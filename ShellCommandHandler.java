import java.io.File;
import java.io.IOException;

public class ShellCommandHandler {
    private File currentDirectory;

    public ShellCommandHandler() {
        // TODO: Initialize currentDirectory to the user's current working directory
        // Hint: Use System.getProperty("user.dir")
        currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        // TODO: Print the absolute path of the current directory
        System.out.println("Current directory :  " + currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        // TODO: List all files and directories in the current directory
        // For directories, prefix with "[DIR] "
        // For files, prefix with "[FILE]"
        File[] files = currentDirectory.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                if (file.isDirectory()) {
                    System.out.println("DIR" + file.getName());

                } else {
                    System.out.println("File " + file.getName());
                }
            }
        }
    }

    public void changeDirectory(String name) {
        //פונקציה לשינוי התיקיה הנוכחית לפי השם שהמשתמש הכניס
        // TODO: Implement the change directory command
        // If name is null, show usage message: "Usage: cd [directory_name]"
        // If name is "..", move to parent directory if possible
        // Otherwise, try to move to the specified directory
        // If directory doesn't exist, print error message: "Directory not found: [name]"
        if (name != null) {
            System.out.println(" You didnt write anything ," + "Usage : cd " + name);
            return;
        }
        File target;
        if (name.equals("?")) {
            target = currentDirectory.getParentFile();
            if (target != null) {
                System.out.println("You didnt answer");
            } else {
                target = new File(currentDirectory, name);
            }
            if (target != null && target.isDirectory()) {
                currentDirectory = target;
            } else {
                System.out.println("Directory not found: " + name);
            }
        }

    }

    public void makeDirectory(String name) { // יוצרת תיקייה חדשה
        // TODO: Implement the make directory command
        // If name is null, show usage message: "Usage: mkdir [directory_name]"
        // If directory already exists, print: "Directory already exists."
        // If directory creation is successful, print: "Directory created: [name]"
        // If directory creation fails, print: "Failed to create directory."
        if (name == null) {
            System.out.println("Usage: mkdir" + name);
            return;
        }
        File thenewfile = new File(currentDirectory, name);
        if (thenewfile.exists()) {
            System.out.println("Directory already exists.");
        } else if (thenewfile.mkdir()) {
            System.out.println("Directory created " + name);
        } else {
            System.out.println("Failed to create directory");
        }
    }

    public void createFile(String name) throws IOException {
        // TODO: Implement the create file command
        // If name is null, show usage message: "Usage: touch [file_name]"
        // If file already exists, print: "File already exists."
        // If file creation is successful, print: "File created: [name]"
        // If file creation fails, print error message with exception details
        if (name == null) {
            System.out.println("Usage :touch" + name);
            return;
        }
        File newfile = new File(currentDirectory, name);
        if (newfile.exists()) {
            System.out.println("file created" + name);
        }
        boolean iscreated = newfile.createNewFile();
        if (iscreated) {
            System.out.println("The file is created" + name);

        } else {
            System.out.println("The file is not created" + name);
        }
    }
        public void printHelp() { // מציגה את הפקודות הנתמכות
            // TODO: Implement help command to print information about all available commands
            // List all commands with their descriptions
            System.out.println(" This is Available commands:");
            System.out.println("pwd - Print the current working directory");
            System.out.println("ls - List files and directories in the current directory.");
            System.out.println("cd [dir] - Change to the specific directory (use .. to move up)");
            System.out.println("mkdir [dir] - Create new file or directory.");
            System.out.println("touch [file] - Create new empty file");
            System.out.println("help - Show this help message");
            System.out.println("exit - Exit the program");
        }
    public File getCurrentDirectory() {
        // TODO: Return the current directory
        return currentDirectory; // Replace this with your implementation
    }




}



