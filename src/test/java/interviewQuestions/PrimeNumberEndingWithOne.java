package interviewQuestions;

import java.util.Scanner;

public class PrimeNumberEndingWithOne {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int i,j,count;
        for(i=a;i<=b;i++)
        {
            for(j=2;j<=b;j++)
            {
                if(i%j==0)
                    break;
            }
            if(j==i && j%10==1)
            {
                System.out.println(i);
            }
        }
    }
    }

