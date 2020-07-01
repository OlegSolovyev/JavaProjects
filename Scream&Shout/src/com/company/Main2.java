package com.company;

public class Main2 {

    public static void main(String[] args){
        Employee employee2=new Employee(1000,"Qwe");
        Programmer programmer1= new Programmer(1000,"Qwe");
        Employee employee1= new Employee(100,"Jack");
        employee1.startTask("write code");
        employee1.finishTask();
        employee1.paySalary();

        Programmer programmer= new Programmer(100,"John");
        programmer.startTask("playing Skyream");
        programmer.finishTask();
        programmer.paySalary();

        Employee[] employees= new Employee[]{
                employee1,
                programmer,
        new Tester(999.99,"Carol")
        };

        for (Employee employee:employees){
            employee.paySalary();
        }

    }
}
