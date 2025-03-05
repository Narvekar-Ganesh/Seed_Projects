package Language_basic;

import java.util.Scanner;

public class ExpressionResult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);// use scanner class for intput
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        System.out.println("Enter d:");
        int d = sc.nextInt();
        System.out.println("Enter e:");
        int e = sc.nextInt();
        int result;
        result= ((a+b)*(c-d))/e;

        System.out.println("result of Expression is : "+result);

    }
}
