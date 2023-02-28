package org.example;

import java.util.Scanner;

public class Client {
    private DispenseChain c1;

    public Client(){
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispense();
        DispenseChain c3 = new Dollar10Dispense();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Client atmDispenser = new Client();

        while (true){
            int amount = 0;

            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if(amount%10 != 0){
                System.out.println("Amount should be in multiple of 10");
                return;
            }

            atmDispenser.c1.dispense(new Currency(amount));


        }
    }
}
