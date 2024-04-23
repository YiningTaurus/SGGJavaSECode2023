package com.atguigu04.example.exercise1;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("XXX", 18, "Female");
        Person person2 = new Person("YYY", 19, "Male");
        System.out.println(person1.showAge());
        person1.addAge(2);
        System.out.println(person1.showAge());
        person2.study();
    }
}
