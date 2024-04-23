package com.atguigu04.example.exercise1;
/*
* 2024.4.23
* 案例：

(1)创建Person类的对象，设置该对象的name、age和gender属性，
调用study方法，输出字符串“studying”;
调用showAge()方法，返回age值;
调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如：2岁。

(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
* */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println("Studying!");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        this.age += addAge;
    }

}
