package com.atguigu2.two.exercise2;

/*
* 2024.4.22
* 案例：声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：

声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是： x：一维int[]   y：二维int[][]

a)    x[0] = y;             no
b)    y[0] = x;             yes
c)    y[0][0] = x;          no
d)    x[0][0] = y;          no
e)    y[0][0] = x[0];       yes
f)    x = y;                no
* */
public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] x;
        int[] y[];
    }
}
