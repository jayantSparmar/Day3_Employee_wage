package com;


public class Emp_wage_uc4 {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int emphour = 0;
        int empWage = 0;
    int empCheck = (int) Math.floor(Math.random()*10)%3;

    switch (empCheck) {
        case is_part_time:
            emphour = 4;
            break;
        case is_full_time:
            emphour = 8;
            break;
        default:
            emphour = 0;
    }
    empWage = emphour * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage:" + empWage );
    }}
