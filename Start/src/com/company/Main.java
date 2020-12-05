package com.company;

public class Main {

    public static void main(String[] args) {
        byte a1 = 1;
        short b1 = 2;
        int c1 = 3;
        long d1 = 4;
        float e1 = 5;
        double f1 = 6;
        char g1 = 'g';
        boolean i1 = true;
        System.out.println(Calc(22, 33, 44, 55));
        System.out.println(Task(5, 10));
        PosNeg(-10);
        System.out.println(Negative(5));
        SayMyName("Денис");
        Star(1996);
    }
        public static float Calc(float a2, float b2, float c2, float d2) {
            float sum;
            sum = a2 * (b2 + (c2 / d2));
            return sum;
        }

        public static boolean Task(int a3, int b3) {
            int sum3;
            sum3 = a3 + b3;
            return sum3 >= 10 && sum3 <= 20;
        }

        public static void PosNeg(int a4){
        if(a4 < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }
        }

    public static boolean Negative(int a5){
        return a5 < 0;
    }

    public static void SayMyName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void Star(int year){
        int a6 = year % 4;
        int b6 = year % 100;
        int c6 = year % 400;
        if(c6 == 0){
            System.out.println("Этот год - високосный!");
        }else if(a6 == 0 && b6 != 0){
            System.out.println("Этот год - високосный!");
        }
        else {
            System.out.println("Этот год - не високосный!");
        }
    }
}
