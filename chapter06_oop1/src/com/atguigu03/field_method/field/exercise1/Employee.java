package com.atguigu03.field_method.field.exercise1;

/*
* 2024.4.22
* 案例：

声明员工类Employee，包含属性：编号id、姓名name、年龄age、薪资salary。

声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
* */
public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public String getInfo(){
        return "Employee id: " + id + "; Name: " + name + "; Age: " + age + "; Salary: " + salary;
    }
}
