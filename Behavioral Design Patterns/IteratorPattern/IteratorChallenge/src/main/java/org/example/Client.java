package org.example;

public class Client {

    public static void print(IteratorInterface iterator){
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("****Iterator Pattern Demo****");
        SubjectInterface Sc_subjects = new Science();
        SubjectInterface Ar_subjects = new Arts();

        IteratorInterface Sc_iterator = Sc_subjects.createIterator();
        IteratorInterface Ar_iterator = Ar_subjects.createIterator();

        System.out.println("\nScience Subjects: ");
        print(Sc_iterator);

        System.out.println("\nArt Subjects: ");
        print(Ar_iterator);


    }
}
