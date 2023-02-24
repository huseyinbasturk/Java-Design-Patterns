package org.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("****Decorator Pattern Demo");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorateEx_1 cd_1 = new ConcreteDecorateEx_1();
        //decorating concreteComponent object cc with ConcreteDecorateEx_1
        cd_1.setTheComponent(cc);
        cd_1.doJob();

        ConcreteDecorateEx_2 cd_2 = new ConcreteDecorateEx_2();

        //decorating concreteComponent object cc with ConcreteDecorateEx_2

        cd_2.setTheComponent(cd_1);
        cd_2.doJob();


    }
}
