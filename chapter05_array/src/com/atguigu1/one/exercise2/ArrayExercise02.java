package com.atguigu1.one.exercise2;

import java.util.Scanner;

/*
* 2024.4.18
* 案例：输出英文星期几

用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}

拓展：一年12个月的存储

用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
{"January","February","March","April","May","June","July","August","September","October","November","December"}
*
* */
public class ArrayExercise02 {
    public static void main(String[] args) {
        String[] days = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String[] months = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter number from 1-7 to get a day: ");
        Scanner scanner = new Scanner(System.in);
        int currDay = scanner.nextInt();
        if(currDay < 1 || currDay > 7){
            System.out.println("You are entering an invalid number.");
        }else{
            System.out.println(days[currDay - 1]);
        }
        System.out.println("Enter number from 1-12 to get a month: ");
        int currMonth = scanner.nextInt();
        if(currMonth < 1 || currMonth > 12){
            System.out.println("You are entering an invalid number.");
        }else{
            System.out.println(months[currMonth - 1]);
        }
    }
}
