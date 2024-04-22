package com.atguigu03.field_method.field.exercise1;

/*
* 2024.4.22
* 案例：

声明员工类Employee，包含属性：编号id、姓名name、年龄age、薪资salary。

声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
* */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "XXX", 18, 10000);
        Employee employee2 = new Employee(2, "YYY", 19, 20000);
        System.out.println(employee1.getInfo());
        System.out.println(employee2.getInfo());
    }
}
