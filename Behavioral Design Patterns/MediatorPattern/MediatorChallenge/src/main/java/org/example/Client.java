package org.example;

public class Client {
    public static void main(String[] args) {
        AuctionMediator med = new AuctionMediator();


        Buyer b1 = new AuctionBuyer(med, "Jason");
        Buyer b2 = new AuctionBuyer(med, "Kagan");
        Buyer b3 = new AuctionBuyer(med, "Pinar");

        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Vegas. Please bid you offers...");
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Waiting for the buyer's offers......");

        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("-------------------------------------------------------------------");
        med.findHighestBigger();

        b2.cancelTheBid();
        System.out.println(b2.name + " has canceled his bid, in that case ");

        med.findHighestBigger();



    }
}
