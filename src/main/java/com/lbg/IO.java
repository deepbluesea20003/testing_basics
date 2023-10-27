package com.lbg;

import java.util.Scanner;

public class IO {
    public static String getUserInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        System.out.println("Input: ");
        return sc.nextLine();
    }
}
