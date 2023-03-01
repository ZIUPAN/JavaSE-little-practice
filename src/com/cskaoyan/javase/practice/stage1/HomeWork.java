package com.cskaoyan.javase.practice.stage1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        //调用requirementOne()
        requirementOne();

    }

    //需求一
    public static void requirementOne()
    {
        while (true)
        {
            System.out.println("----------王道Java学生管理系统----------");
            // 输出换行
            System.out.println();
            System.out.println("            1.学 生 列 表");
            System.out.println("            2.增 加 学 生");
            System.out.println("            3.删 除 学 生");
            System.out.println("            4.修 改 学 生");
            System.out.println("            5.查 询 学 生");
            System.out.println("            6.退 出 系 统");
            System.out.println();
            System.out.println("请选择功能(1-6)：");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            // 判断输入的数字
            if (number==6)
            {
                requirementTwo(number);
                break;
            }
        }
    }

    //需求二
    public static void requirementTwo(int quit)
    {
        if (quit==6)
        {
            System.out.println("确认退出码（1/2）：");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            if (number==1)
            {
                System.out.println("感谢使用本系统！");
            }
        }
    }
}
