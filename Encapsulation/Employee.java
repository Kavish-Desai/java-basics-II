package Encapsulation;

public class Employee extends Person{

    private String salary;

    Employee(String firstName, String lastName, Byte age, Integer ssn, String salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak(){
        return "Hello, my name is " + this.getFirstName() + " " + this.getLastName() + " and my salary is " + this.salary;
    }
    
}