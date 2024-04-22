package com.atguigu03.field_method.field.exercise2;

/*
* 2024.4.22
* 案例：

（1）声明一个MyDate类型，有属性：年year，月month，日day

（2）声明一个Employee类型，包含属性：编号、姓名、年龄、薪资、生日（MyDate类型）

（3）在EmployeeTest测试类中的main()中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
* */
public class EmployeeTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(1997, 5, 11);
        MyDate myDate2 = new MyDate(1997, 10, 24);
        Employee employee1 = new Employee(111, "XXX", 18, 10000, myDate1);
        Employee employee2 = new Employee(222, "YYY", 18, 20000, myDate2);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
