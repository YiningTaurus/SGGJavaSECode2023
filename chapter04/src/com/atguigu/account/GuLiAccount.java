package com.atguigu.account;

/*
* 2024.4.15
*
* */

import com.atguigu.util.Utility;

public class GuLiAccount {
    public static void main(String[] args) {
        int balance = 10000;
        boolean loopFlag = true;
        String details = "Income/Expenditure\ttotal\tAmount\tDetail\n";

        while(loopFlag){
            System.out.println("-----------------GULI Account-----------------");
            System.out.println();
            System.out.println("       1 Income & Expenditure Detail");
            System.out.println("       2 Record Income");
            System.out.println("       3 Record Expenditure");
            System.out.println("       4 Exit");
            System.out.println();
            System.out.println("Please choose from 1-4: ");
            char selection = Utility.readMenuSelection();
            if(selection == '1'){
                System.out.println("---Current income and expenditure detailed records---");
                System.out.println(details);
                System.out.println();
                System.out.println("-----------------------------------------------------");
            }else if(selection == '2'){
                System.out.println("Income amount: ");
                int currIncome = Utility.readNumber();
                System.out.println("Income detail: ");
                String currDetail = Utility.readString();
                balance += currIncome;
                details += "Income\t" + balance + "\t" + currIncome + "\t" + currDetail + "\n";
            }else if(selection == '3'){
                System.out.println("Expenditure amount: ");
                int currExpenditure = Utility.readNumber();
                System.out.println("Expenditure detail: ");
                String currDetail = Utility.readString();
                balance -= currExpenditure;
                details += "Expenditure\t" + balance + "\t" + currExpenditure+ "\t" + currDetail+ "\n";
            }else if(selection == '4'){
                System.out.println("You want to exit? (Y/N): ");
                char confirmSelection = Utility.readConfirmSelection();
                if(confirmSelection == 'Y'){
                    loopFlag = false;
                }
            }
        }
    }
}
