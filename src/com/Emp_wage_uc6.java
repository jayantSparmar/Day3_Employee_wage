package com;

public class Emp_wage_uc6 {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAXIMUM_HOUR_IN_MONTH = 100;

    public static void main(String[] args) {
                     int emphour = 0;
                     int totalEmphours = 0;
                     int totalWorkingDays = 0;
        while (totalEmphours <= MAXIMUM_HOUR_IN_MONTH &&
                totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case is_part_time:
                    emphour = 4;
                    break;
                case is_full_time:
                    emphour = 8;
                default:
                    emphour = 0;
                    totalEmphours += emphour;
                    System.out.println("Day#:" + totalWorkingDays + "EMP HOUR:" + emphour);
            }
            int totalEmpWage = totalEmphours * EMP_RATE_PER_HOUR;
            System.out.println("Total EmpWage:" + totalEmpWage);

        }

    }
}

