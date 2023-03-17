package org.example;

public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set of data:\nAli\nVeli\n");

        System.out.println(fileWriter+"\n\n");

        caretaker.save(fileWriter);

        fileWriter.write("Second set of data:\nHakan\n");

        System.out.println(fileWriter+"\n\n");

        caretaker.undo(fileWriter);
        System.out.println(fileWriter+"\n\n");

    }
}
