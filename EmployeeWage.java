package com.employeewage;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
    static Random r = new Random();
    static Scanner sc =new Scanner(System.in);

    static int wagePerHour = 20;
    static int empHour ;

    public static void WageCalculation(){
        int n = r.nextInt(3);

        // UC4 Switch case used to check employee attendance status
        switch(n){ // UC1 to check the Employee is present or absent using RANDOM class.
            case 0:
                empHour=8;
                System.out.println("Employee is Present for "+empHour+" hours. ");
                break;
            case 1:// UC3 to add employee hours present for part time
                empHour=4;
                System.out.println("Employee present for part time for "+empHour+" hours. ");
                break;

            default:
                empHour=0;
                System.out.println("Employee is Absent so no salary for him...");
        }
        int wage = wagePerHour*empHour; // UC2 to calculate the daily wage for present employee
        System.out.println("Employee Wage for one day is: "+wage);

        System.out.println("Enter number of days worker worked in one month: ");//uc5 to calculate monthly wage of employee
        int workDays = sc.nextInt();
        int monthlyWage = wage*workDays;
        int monthlyHour = empHour*workDays;
        System.out.println("Employee this month salary will be : "+monthlyWage);

        System.out.println("");//uc6 to check if the Employee working hours or days meets the company requirements
        // i.e. working days atleast should be 20 in a month or minimum of 100 working hours
        if (workDays >=20 || monthlyHour >=100){
            System.out.println("Worker Satisfies the payscale condition.");
            System.out.println("The Final Salary will be credited to Workers  bank account is: "+monthlyWage);
        }
        else{
            System.out.println("Worker did not satisfies the payscale condition.");
            System.out.println("Worker needs to work for more hour or minimum for 20 days. ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculation Program!");

        WageCalculation();





    }
}
