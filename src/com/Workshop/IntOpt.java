package com.Workshop;
import java.util.Scanner;
public class IntOpt {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of A ");
        int a=sc.nextInt();
        System.out.println("enter the values of B ");
        int b=sc.nextInt();
        System.out.println("enter the values of C ");
        int c=sc.nextInt();
        int FirstProblem=(a+b*c);
        System.out.println("(a+b*c) ==" + FirstProblem);
        int SecondProblem=(a*b+c);
        System.out.println("(a*b+c0 == " + SecondProblem);
        int ThirdProblem=(c+a/b);
        System.out.println("(c+a/b) == " + ThirdProblem);
        int FourthProblem=(a%b+c);
        System.out.println("(a%b+c) == " + FourthProblem);

    }
}
