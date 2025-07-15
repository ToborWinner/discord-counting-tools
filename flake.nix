{
  description = "A Nix-flake-based Java development environment and package";

  outputs =
    { self, nixpkgs }:
    let
      javaVersion = 23;

      supportedSystems = [
        "x86_64-linux"
        "aarch64-linux"
        "x86_64-darwin"
        "aarch64-darwin"
      ];
      forEachSupportedSystem =
        f:
        nixpkgs.lib.genAttrs supportedSystems (
          system:
          f {
            pkgs = import nixpkgs {
              inherit system;
              overlays = [ self.overlays.default ];
            };
          }
        );
    in
    {
      overlays.default = final: prev: {
        jdk = prev."jdk${toString javaVersion}";
      };

      devShells = forEachSupportedSystem (
        { pkgs }:
        {
          default = pkgs.mkShell {
            packages = with pkgs; [ jdk ];
          };
        }
      );

      packages = forEachSupportedSystem (
        { pkgs }:
        {
          default = pkgs.stdenv.mkDerivation {
            pname = "discord-counting-tools";
            version = "1.0.0";
            src = ./.;

            meta = {
              description = "A Java program to generate weird ways to count using a Discord bot";
              license = "agpl3Only";
            };

            buildInputs = [ pkgs.openjdk ];
            nativeBuildInputs = [ pkgs.makeWrapper ];

            buildPhase = ''
              echo "Compiling Java sources..."
              mkdir -p build
              find src -name '*.java' > sources.txt
              javac -d build @sources.txt
            '';

            installPhase = ''
              echo "Packaging into JAR..."
              mkdir -p $out/lib
              cd build
              jar cfe $out/lib/discord-counting-tools.jar discordCountingTools.Main .
              mkdir -p $out/bin
              makeWrapper ${pkgs.jre}/bin/java $out/bin/discord-counting-tools \
                --add-flags "-jar $out/lib/discord-counting-tools.jar"
              echo "Build Successful."
            '';
          };
        }
      );
    };
}
