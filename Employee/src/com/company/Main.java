package com.company;

public class Main {

    public static void main(String[] args) {
	CProgrammer cProgrammer1= new CProgrammer(100,"Denis");
	JavaProgrammer javaProgrammer1= new JavaProgrammer(150,"Robert");
	JavaScriptProgrammer javaScriptProgrammer1= new JavaScriptProgrammer(125,"John");
	//Employee employee1= new Employee(20,"Jack");
	//Employee employee2= new Employee(30,"Ron");
	//Employee employee3= new Employee(40,"Eduard");
	Employee[] programmers= new Employee[]{
	        cProgrammer1,
            javaProgrammer1,
            javaScriptProgrammer1
    };
     //   Employee[] employees= new Employee[]{
       //         employee1,
         //       employee2,
           //     employee3,
        //};
        programmers[1].work();

    }

    private static boolean isProgrammer(Employee employee){
    	if(employee instanceof Programmer){
    		return true;
		}
    	return false;
	}
}
