package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> task = new ArrayList<String>();

        System.out.println("Please choose an option:\n" +
                            "(1) Add a task.\n" +
                            "(2) Remove a task.\n" +
                            "(3) Update a task.\n" +
                            "(4) List all tasks.\n" +
                            "(0) Exit.");

        int choice = input.nextInt();
        input.nextLine();


        while(choice > -1 && choice < 5){
        if(choice==1){
            addTask(task);

        }
        else if(choice == 2){
            removeTask(task);

        }
        else if(choice == 3){
            updateTask(task);

        }
        else if(choice == 4){
            listTask(task);

        }
        else if(choice == 0){
            exit(task);

        }
        System.out.println("Please choose an option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");

        choice = input.nextInt();
        input.nextLine();

    }}
    static ArrayList<String> addTask(ArrayList<String> a){
        System.out.println("What task would you like to add?");
        String userInput = input.nextLine();
        a.add(userInput);
        return a;
    }
    static ArrayList<String> removeTask(ArrayList<String> a) {
        System.out.println("What task would you like to remove?");
        String userInput = input.nextLine();
        a.remove(userInput);
        return a;
    }
    static ArrayList<String> updateTask(ArrayList<String> a) {
        System.out.println("What index value would you like to update?");
        int userInt = input.nextInt();
        input.nextLine();
        System.out.println("What would you like it to be");
        String userInput = input.nextLine();
        a.set(userInt, userInput);
        return a;

    }
    static void listTask(ArrayList<String> a) {
        System.out.println(a);
    }

    static void exit(ArrayList<String> a) {
        System.exit(0);
    }



}
