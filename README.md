This is my starting set for Minecraft plugins. I've tried to stick to OOP paradigm as close as I could.
To manage repositories and making .jar files I've used Maven. To this step everything should work fine.

I recommend changing everything You need:

- in plugin.yml:
  - name
  - author
  - main
  - description
  - commands
- names of the packages
  - pl.adrian_komuda.plugin_package
- pom.xml
  
        <artifactId>HERE</artifactId>
  
    especially Main class path if You change packages' names (without this change it won't work):
            
        <properties>
            <mainClass>HERE</mainClass>
        <properties>

To add a new command:
1. Create a new command-class in "particular_commands" packages in one of these packages: player, console, player_and_console.
   Also don't forget to implement the proper interface (PlayersCommandsPerformers - only for players -
   or CommandPerformers).
2. Then add that new command to the proper enum (which are in previously mentioned packages).
   Set name and newly created command-class.
   
Compared to previous version, now You don't have to neither add new command to a plugin.yml nor register it
in Main class. Everything You have to do revolves around new class-command, interfaces and commands-enums.
I also added "tab completion".

I hope I didn't forget anything, and it will save Your time in coding. :)

PS: You may delete this README file or change as it will describe Your own plugin. :p