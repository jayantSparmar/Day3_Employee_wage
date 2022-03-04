package com;

public class Emp_wage_uc3
{
    public static void main(String[] args) {
        int is_part_time = 1;
        int is_full_time = 2;
        int emp_rate_per_hour = 20;

        int empHour = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random()*10)%2;

        if (empCheck ==  is_part_time )
            empHour = 4;
        else if (empCheck == is_full_time  )
            empHour = 8;
        else
            empHour = 0;
        empWage = empHour * emp_rate_per_hour;

        System.out.println("Emp Wage:" + empWage );


    }}
