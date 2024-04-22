package com.atguigu03.field_method.field.exercise2;

/*
* 2024.4.22
* 案例：

（1）声明一个MyDate类型，有属性：年year，月month，日day

（2）声明一个Employee类型，包含属性：编号、姓名、年龄、薪资、生日（MyDate类型）

（3）在EmployeeTest测试类中的main()中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
* */
public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(int id, String name, int age, int salary, MyDate birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
