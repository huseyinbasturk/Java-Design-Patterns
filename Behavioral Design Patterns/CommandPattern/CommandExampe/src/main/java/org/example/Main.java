package org.example;

public class Main {
    public static void main(String[] args) {

        //create receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //create the command with the associating receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //creating invoker and associate it with the command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        //perform action on invoker object
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();

   }
}