package com.atguigu1.one.exercise3;


import java.util.Scanner;

/*
* 2024.4.22
* 案例：学生考试等级划分

从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
	成绩>=最高分-10    等级为’A’
	成绩>=最高分-20    等级为’B’
	成绩>=最高分-30    等级为’C’
	其余              等级为’D’

E.g:
* Please enter the number of the student: 5
* Please enter 5 scores:
* 56
* 74
* 89
* 41
* 89
* The highest score is: 89
* Student 1 score is 56, grade is D
* Student 2 score is 74, grade is B
* Student 3 score is 89, grade is A
* Student 4 score is 41, grade is D
* Student 5 score is 89, grade is A
* */
public class ArrayExercise03 {
    public static void main(String[] args) {
        System.out.println("Please enter the number of the student: ");
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        int highest = Integer.MIN_VALUE;
        int[] scores = new int[studentNum];
        System.out.println("Please enter " + studentNum + " scores:");
        for(int i = 0; i < studentNum; i++){
            int currScore = scanner.nextInt();
            highest = Math.max(currScore, highest);
            scores[i] = currScore;
        }
        System.out.println("The highest score is: " + highest);
        for(int i = 0; i < studentNum; i++){
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + ", grade is " + getGrade(highest, scores[i]));
        }
    }

    public static char getGrade(int highest, int currScore){
        if(currScore >= highest - 10){
            return 'A';
        }else if(currScore >= highest - 20){
            return 'B';
        }else if(currScore >= highest - 30){
            return 'C';
        }else{
            return 'D';
        }
    }
}
