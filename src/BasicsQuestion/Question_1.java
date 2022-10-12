package BasicsQuestion;

import java.util.Scanner;


//Question 1:- Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number");
        int num2 = input.nextInt();

        System.out.println("Enter Third Number");
        int num3 = input.nextInt();

        int max = maximum(num1,num2,num3);
        int min = minimum(num1,num2,num3);

        System.out.println("Maximum digit of the given number is:" + max);
        System.out.println("Minimum digit of the given number is:" + min);

    }
    static int maximum(int num1, int num2, int num3){
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        return max;
    }

    static  int minimum(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        return min;
    }
}
