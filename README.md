# discord-counting-tools
## Not all modes work at the moment because they updated the math in the bot. Might be fixed soon.
A script to generate weird messages that are valid for a Discord counting bot.

## Usage
The command allows you two specify two parameters: mode and number. The number is required, however you may choose to omit the mode. When the mode is omitted, it will be randomized.
```
Usage: [mode] <num>
```
A list of modes can be found near the end of `Main.java`.

## Testing without installing
If you have Nix installed and would like to test the program without installing it, run the following command and replace `<num>` and `[mode]` with the desired inputs.
```bash
nix run github:ToborWinner/discord-counting-tools -- [mode] <num>
```
