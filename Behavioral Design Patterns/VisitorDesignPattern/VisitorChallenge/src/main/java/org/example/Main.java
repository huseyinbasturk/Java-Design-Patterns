package org.example;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Visitable> items = new ArrayList<Visitable>();

    private static double calculatePostage(Visitor visitor){
        for(Visitable item: items){
            item.accept(visitor);
        }
        return visitor.getTotalPostageForCart();
    }
    public static void main(String[] args) {

        Visitable myBook = new Book(8.52, 1.05);
        Visitable myCD = new CD(18.52, 3.05);
        Visitable myDVD = new DVD(6.52, 4.05);

        items.add(myBook);
        items.add(myCD);
        items.add(myDVD);

        Visitor visitor = new UsPostageVisitor();
        double myPostage = calculatePostage(visitor);

        System.out.println("The total postage for my item is: " + myPostage);

        visitor = new SouthAmericaPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my item is: " + myPostage);



    }
}