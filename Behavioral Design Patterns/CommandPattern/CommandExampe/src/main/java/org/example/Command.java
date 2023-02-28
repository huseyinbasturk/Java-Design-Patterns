package org.example;

public interface Command {
    void execute();

    //could add and undo or redo commands
}


class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    //store previous state for undo, String someState

    public OpenFileCommand(FileSystemReceiver receiver){
        this.fileSystemReceiver = receiver;
    }

    @Override
    public void execute() {
        //save previous state, in case undo called someState = '...'
        this.fileSystemReceiver.openFile();
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    //store previous state for undo, String someState

    public CloseFileCommand(FileSystemReceiver receiver){
        this.fileSystemReceiver = receiver;
    }

    @Override
    public void execute() {
        //save previous state, in case undo called someState = '...'
        this.fileSystemReceiver.closeFile();
    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    //store previous state for undo, String someState

    public WriteFileCommand(FileSystemReceiver receiver){
        this.fileSystemReceiver = receiver;
    }

    @Override
    public void execute() {
        //save previous state, in case undo called someState = '...'
        this.fileSystemReceiver.writeFile();
    }
}