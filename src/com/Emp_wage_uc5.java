package com;

public class Emp_wage_uc5 {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {

        int emphour = 0 , empWage = 0 , totalempWage = 20;
        for (int day = 0 ; day < NUMBER_OF_WORKING_DAYS; day ++ ) {
            int empCheck = (int) Math.floor(Math.random() * 10) %3;
        switch (empCheck) {
            case is_part_time:
                emphour = 4;
                break;
              case is_full_time:
                emphour = 8;
            default:
                emphour = 0;
                empWage = emphour * EMP_RATE_PER_HOUR;
                totalempWage += empWage;
                System.out.println( "Emp Wage:" +empWage);
                System.out.println("Total EmpWage:" + totalempWage);


            }
        }



    }}
