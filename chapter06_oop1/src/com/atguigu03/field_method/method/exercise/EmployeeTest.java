package com.atguigu03.field_method.method.exercise;

/*
 * 2024.4.23
 * 案例：将属性测试的exer1中关于员工信息的输出内容放到方法中。通过调用方法显示。
 *
 * */
public class EmployeeTest {
    public static void main(String[] args) {
        //创建类的实例（或创建类的对象、类的实例化）
        Employee emp1 = new Employee();

        System.out.println(emp1);//类型@地址值

        emp1.id = 1001;
        emp1.name = "Tom";
        emp1.age = 24;
        emp1.salary = 7800;

//        System.out.println("id = " + emp1.id + ",name = " + emp1.name +
//                ", age = " + emp1.age + ", salary = " + emp1.salary);

        //替换为：
        emp1.show();

//        System.out.println(emp1.show());//编译报错

        System.out.println(emp1.show1()); //编译通过


        //创建Employee的第2个对象
//        Employee emp3 = emp1;//错误写法
        Employee emp2 = new Employee();



//        System.out.println("id = " + emp2.id + ",name = " + emp2.name +
//                ", age = " + emp2.age + ", salary = " + emp2.salary);

        //替换为：
        emp2.show();
    }
}
