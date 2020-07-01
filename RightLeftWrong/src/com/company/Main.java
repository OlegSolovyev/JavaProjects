package com.company;


public class Main {


    public static void main(String[] args) {
	Person person1= new Person("Jack the Ripper",666);

	Person person2;
	person2=method("Jack Catch",1985);


	Date date1= new Date();
	date1.day=1;
	date1.month=6;
	date1.year=2004;

	Car car1= new Car("Audi",50000);
	Car car2= new Car("Audi",40000);
		person2.car=car1;
		person1.car=car2;

		System.out.println("-------------------");
		Person[] people ={person1,person2};
		for (int i =0;i<people.length;i++){
			people[i].print();
		}
		System.out.println("-------------------");

	Car[] cars = {car1,car2};
	for (int i =0;i<cars.length;i++){
		System.out.println(cars[i].toString());
	}
		System.out.println("-------------------");
	person1.print();
		System.out.println(person1.getAge());
	person2.print();

		System.out.println("compare "+ car2.compareTo(car1));

    }

	public static Person method(String name, int year){
		Person p= new Person(name,year);
		return p;
	}


}
