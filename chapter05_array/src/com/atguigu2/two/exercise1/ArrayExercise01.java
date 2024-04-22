package com.atguigu2.two.exercise1;
/*
* 2024.4.22
* 案例1：获取arr数组中所有元素的和。
* */
public class ArrayExercise01 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);
    }
}
