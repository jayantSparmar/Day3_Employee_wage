package com.bridgelaqbz;
import java.util.Scanner;
public class geometry_uc3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start point of line ");
        int a1=sc.nextInt();
        System.out.println("enter end point of line ");
        int a2=sc.nextInt();
        System.out.println("enter start point of line ");
        int b1=sc.nextInt();
        System.out.println("enter end point of  line ");
        int b2=sc.nextInt();

        double length = Math.sqrt((a2 - a1) * 2 + (b2 - b1) * 2 );
        String str = length+"";
        System.out.println("Length of first Line is :" + str);

        System.out.println("enter start point of line ");
        int x1=sc.nextInt();
        System.out.println("enter end point of line ");
        int x2=sc.nextInt();
        System.out.println("enter start point of line ");
        int y1=sc.nextInt();
        System.out.println("enter end point of line ");
        int y2=sc.nextInt();


        double length2 = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2 );
        String str1 = length2+"";
        System.out.println("Length of second Line is :" + str1);

        int var1 = str.compareTo( str1 );
        System.out.println("line comparison = "+var1);


        if(var1==0)
        {
            System.out.println("Lines are equal");
        }
        else if(var1 >=1)
        {
            System.out.println("first Line is greater-");
        }
        else if(var1 < 0)
        {
            System.out.println("first line is small-");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
