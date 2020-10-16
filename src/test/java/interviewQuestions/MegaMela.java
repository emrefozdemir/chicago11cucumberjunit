package interviewQuestions;

import java.util.Scanner;

public class MegaMela {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Amount:");
        float amount = input.nextInt();
        input.nextLine();
        if(amount < 1000 && amount > 0){
            System.out.println("Amount you have saved on the bill is: ");
            System.out.printf("Rs.0.00");
            System.out.println();
            System.out.println("Amount to be paid:");
            System.out.printf("Rs.%.2f%n", amount);
        }else if(amount >= 1000){
            float firstTwoDigit = Integer.parseInt((amount + "").substring(0, 2));
            if (firstTwoDigit < 50) {
                System.out.println("Amount you have saved on the bill is: ");
                System.out.printf("Rs.%.2f%n", (amount * firstTwoDigit) / 100);
                System.out.println("Amount to be paid:");
                System.out.printf("Rs.%.2f%n", (amount - (amount * firstTwoDigit) / 100));
            } else{
                System.out.println("Amount you have saved on the bill is: ");
                System.out.printf("Rs.%.2f%n",(amount * 50) / 100);
                System.out.println("Amount to be paid:");
                System.out.printf("Rs.%.2f%n", (amount - (amount * 50) / 100));
            }
        }
        else{
            System.out.println((amount+"").substring(0,(amount+"").indexOf(".")) + " is not a valid amount");
        }
    }
}
