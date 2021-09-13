package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;
import java.lang.Math;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //p = principle, r = rate of interest, t = time/years, a = amount at end of investment
        //n = number of times the interest is compounded per year
        System.out.println( "What is the principle amount? " );
        double p = input.nextInt();

        System.out.println( "What is the rate? " );
        double r = input.nextDouble();
        r = r/100;

        System.out.println( "What is the number of years? " );
        double t = input.nextInt();

        System.out.println( "What is the number of times the interest is compounded per year? " );
        double n = input.nextInt();

        //Equation to get total exponent value
        double exp = n*t;

        double a = p * (Math.pow((1 + r/n), exp));

        System.out.printf("$%.0f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", p, r*100, t, n, a);
    }
}
