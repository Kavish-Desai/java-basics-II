package Polymorphism;

public class Manager extends Employee{
    String name;
    double pay;
    public Manager(String name){
        this.name = name;
        this.pay = 75000;
    }
    @Override
    public double calculatePay() {
        return this.pay;
    }
    
}