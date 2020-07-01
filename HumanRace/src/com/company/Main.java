package com.company;

public class Main {

    public static void main(String[] args) {
        DBMock db=new DBMock();
        Student[] students=db.getStudents();

	print(students);
        System.out.println("-----------------------------");
        System.out.println(bestStudent(students).toString());
    }

    public static void print(Student[] students){
        for (int i=0; i<students.length ; i++){
            System.out.println(students[i].toString());
        }
    }

    public static Student bestStudent(Student[] students){
        Student theBestStudent = students[0];
        for (int i=0; i<students.length; i++){
           if (students[i].getReit() > theBestStudent.getReit()){
               theBestStudent = students[i];
           }
        }
        return theBestStudent;
    }
}

