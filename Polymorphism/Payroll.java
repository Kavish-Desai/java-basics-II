package Polymorphism;
public class Payroll{
    public static void main(String[] args){
        Manager m = new Manager("You");
        CEO c = new CEO("Me");

        System.out.println("You are a manager and you make $" + m.calculatePay());
        System.out.println("I am a CEO and I make $" + c.calculatePay());
    }
}