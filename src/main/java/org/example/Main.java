package org.example;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static void main() {
    }
    static void Task1(){
        for (int i = 1; i < 99; i++) {
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
    static void Task2(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
    static void Task3(){
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
    static void Task4(){
        System.out.println("enter base");
        int base = scanner.nextInt();
        System.out.println("enter power");
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <=power ; i++) {
            result=result*base;
        }
        System.out.println(result);
    }
    static void Task5(){
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = number; i >1; i--) {
            result=result*i;
        }
        System.out.println(result);
    }
    static void Task6(){
        for (int i = 1; i <= 100; i++) {
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
    static void Task7(){
        int result = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(result);
            result=result*2;
        }

    }
    static void Task8(){
        int result = 1;
        for (int i = 0; i < 15; i++) {
            if(i%2!=0){
                result = result*i;
                System.out.println(result);
            }

        }
    }
    static void Task9(){
        int count = 0;
        int total = 0;
        boolean flag = true;
        while (flag){
            System.out.println("enter a number");
            int number = scanner.nextInt();

            if(number>0){
                total = total+number;
                count++;
            }
            else{
                flag = false;
            }
        }
        System.out.println(total);
        System.out.println(count);
        System.out.println(total/count);
    }
    static void Task10(){
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int remainder =0;
        int sum=0;
        boolean flag = true;
        while(flag){
            if(number!=0){//123 12
                remainder=number%10;//3 2
                number=(number-remainder)/10;//12 1
                sum=sum+remainder;
            }
            else{
                flag=false;
            }
        }
        System.out.println(sum);
    }
    static void Task11(){
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int remainder =0;
        int count=0;
        boolean flag = true;
        while(flag){
            if(number!=0){//123 12
                remainder=number%10;//3 2
                number=(number-remainder)/10;//12 1
                count++;
            }
            else{
                flag=false;
            }
        }
        System.out.println(count);

    }
    static  void Task12(){
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int counter =0;
        while(number>=1){
                number=number/2;
                counter++;
        }
        System.out.println(counter);
    }
    static void Task13(){
        int count = 0;
        for (int i = 100; i <200 ; i++) {
            if((i%5==0)^(i%6==0)){
                if(count<10){
                    System.out.print(i+" ");
                    count++;
                }
                else{
                    System.out.println();
                    System.out.print(i+" ");
                    count=1;
                }
            }
        }
    }
}