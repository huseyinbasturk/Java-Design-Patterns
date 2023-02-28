package org.example;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying Os is: " + osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
