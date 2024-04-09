package com.example.scorecalculator;

public class Main {
    public static void main(String[] args) {

        EmergencyTask task1 = EmergencyTask.ICE_SHADOW;
        EmergencyTask task2 = EmergencyTask.NETWORK;
        EmergencyTask task3 = EmergencyTask.COMPANY_CONFLICT;
        EmergencyTask task4 = EmergencyTask.ICE_SHADOW;



        System.out.println("Task 1: " + task1.getName() + ", Score: " + task1.getScore());
        System.out.println("Task 2: " + task2.getName() + ", Score: " + task2.getScore());
        System.out.println("Task 3: " + task3.getName() + ", Score: " + task3.getScore());
        System.out.println("Task 3: " + task3.getName() + ", Score: " + task4.getScore());
    }
}
