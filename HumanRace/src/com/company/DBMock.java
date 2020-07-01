package com.company;


public class DBMock {
    public Student[] getStudents(){
        Student students0 = new Student("Oleg","E12", new int[]{30,42,56});
        Student students1 = new Student("Jack","E12", new int[]{11,78,86});
        Student students2 = new Student("John","E12", new int[]{100,4});
        Student students3 = new Student("Robert","E12", new int[]{18,28,55, 99});
        Student students4 = new Student("Lisa","E12", new int[]{30,42,65});
        Student[] students = {students0,students1,students2,students3,students4};
        return students;
    }
}
