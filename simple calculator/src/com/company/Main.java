package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        String inp1 = sc.nextLine();
        double d1= Double.parseDouble(inp1);

        System.out.print("Enter second number : ");
        String inp2 = sc.nextLine();
        double d2= Double.parseDouble(inp2);

        double d3 = d1 + d2;

        System.out.println("Addition is: " + d3 );




    }
}
