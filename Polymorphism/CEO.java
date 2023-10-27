package Polymorphism;

public class CEO extends Employee{
    String name;
    double pay;

    public CEO(String name){
        this.name = name;
        this.pay = 100000;
    }
    @Override
    public double calculatePay() {

        return pay;
    }
    
}