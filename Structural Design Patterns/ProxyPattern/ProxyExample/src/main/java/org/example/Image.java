package org.example;

public interface Image {
    void display();
}

class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(this.fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + this.fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
