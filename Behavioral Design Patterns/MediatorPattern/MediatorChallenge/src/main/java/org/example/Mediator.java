package org.example;

import java.util.ArrayList;

interface Mediator {

    void addBuyer(Buyer buyer);
    void findHighestBigger();
}

class AuctionMediator implements Mediator{
    //this class implements mediator interface and holds all the buyers in an arraylist.
    // we can  add buyers and find the biggest bidder
    private ArrayList buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list");
    }

    @Override
    public void findHighestBigger() {
        int maxBid = 0;
        Buyer winner = null;

        for(Object a:buyers){
            Buyer b = (Buyer) a;
            if(b.price > maxBid){
                maxBid = b.price;
                winner = b;
            }

        }
        System.out.println("The auction winner is  " + winner.name + ". He paid " + winner.price + "$ for the item");
        for(Object a:buyers){
            Buyer b = (Buyer) a;

            b.auctionHasEnded();
        }

    }

}
