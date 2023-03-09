package org.example;

public interface Order {
    void execute();
}

class BuyStock implements Order{
    private Stock myStock;

    public BuyStock(Stock someStock){
        myStock = someStock;
    }

    public void execute(){
        myStock.buy();
    }
}
class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock someStock) {
        myStock = someStock;
    }

    public void execute() {
        myStock.sell();
    }
}