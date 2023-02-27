/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaElectronica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isabel
 */
public class TablaJavaenConsola {
     public static void main (String args[]){
        List<Student> students = new ArrayList<>();
        students.add(new Student("S101","John",8, '4'));
        students.add(new Student("S102","Leo",10, '6'));
        students.add(new Student("S103","Mary",5, '2'));
        students.add(new Student("S104","Lisa",6, '3'));

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %5s %5s", "STUDENT ID", "NAME", "AGE", "GRADE");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Student student: students){
            System.out.format("%10s %20s %5d %5c",
                    student.getId(), student.getName(), student.getAge(), student.getGrade());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
class Student{
    private String id;
    private String name;
    private int age;
    private Character grade;
    Student(String id,String name,int age, Character grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public Character getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
    
