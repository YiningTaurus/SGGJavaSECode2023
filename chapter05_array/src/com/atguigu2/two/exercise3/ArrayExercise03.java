package com.atguigu2.two.exercise3;
/*
* 2024.4.22
* 案例：二维数组存储数据，并遍历

String[][] employees = {
    {"10", "1", "段 誉", "22", "3000"},
    {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
    {"11", "3", "任我行", "23", "7000"},
    {"11", "4", "张三丰", "24", "7300"},
    {"12", "5", "周芷若", "28", "10000", "5000"},
    {"11", "6", "赵 敏", "22", "6800"},
    {"12", "7", "张无忌", "29", "10800","5200"},
    {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
    {"12", "9", "杨 过", "26", "9800", "5500"},
    {"11", "10", "小龙女", "21", "6600"},
    {"11", "11", "郭 靖", "25", "7100"},
    {"12", "12", "黄 蓉", "27", "9600", "4800"}
};
* 其中"10"代表普通职员，"11"代表程序员，"12"代表设计师，"13"代表架构师。
* */
public class ArrayExercise03 {
    public static void main(String[] args) {
        String[][] employees = {
                {"10", "1", "段 誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵 敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨 过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭 靖", "25", "7100"},
                {"12", "12", "黄 蓉", "27", "9600", "4800"}
        };
        String info = "员工类型\t编号\t姓名\t年龄\t薪资\t奖金\t股票\n";
        for(String[] employee : employees){
            if(employee.length == 5){
                info += getTitle(employee[0]) + "\t" + employee[1] + "\t" + employee[2] + "\t" + employee[3] + "\t" + employee[4] + "\n";
            }else if (employee.length == 6){
                info += getTitle(employee[0]) + "\t" + employee[1] + "\t" + employee[2] + "\t" + employee[3] + "\t" + employee[4] + "\t"
                        + employee[5] + "\n";
            }else if(employee.length == 7){
                info += getTitle(employee[0]) + "\t" + employee[1] + "\t" + employee[2] + "\t" + employee[3] + "\t" + employee[4] + "\t"
                        + employee[5] + "\t" + employee[6] + "\n";
            }
        }
        System.out.println(info);
    }

    public static String getTitle(String num){
        if(num.equals("10")){
            return "普通职员";
        }else if(num.equals("11")){
            return "程序员";
        }else if(num.equals("12")) {
            return "设计师";
        }else if(num.equals("13")){
            return "架构师";
        }
        return "?";
    }
}
