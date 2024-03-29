package org.example;

public interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");

    }
}

class PayPalStrategy implements PaymentStrategy{
    private String email_id;
    private String password;

    public PayPalStrategy(String email_id, String password) {
        this.email_id = email_id;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}
