package com.atguigu03.field_method.method.exercise;
/*
* 2024.4.23
* 案例：将属性测试的exer1中关于员工信息的输出内容放到方法中。通过调用方法显示。
*
* */
public class Employee {

    int id;  //编号
    String name; //姓名
    int age; //年龄
    double salary; //薪资

    //定义一个方法，用于显示员工的属性信息
    public void show(){
        System.out.println("id = " + id + ",name = " + name +
                ", age = " + age + ", salary = " + salary);
    }

    public String show1(){
        return "id = " + id + ",name = " + name +
                ", age = " + age + ", salary = " + salary;
    }

}
