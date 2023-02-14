package org.example;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Jason Fedin",100, "Developer");
        Employee dev2 = new Developer("Huseyin B", 21, "Junior Developer");

        Manager engManager = new Manager("Mike", 250000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer("Tom", 201, "Developer");

        Manager generalManager = new Manager("Mark", 500000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();


    }
}
