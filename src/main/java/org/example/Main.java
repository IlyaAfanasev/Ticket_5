package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jhon", 20);
        Student student2 = new Student("Jhon", 20);
        Student student3 = new Student("Jhon", 21);
        System.out.println(student1.equals(student2));
        System.out.println(student2.equals(student3));
        System.out.println(student1.equals(student3));
        System.out.println(student2.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());
    }
}