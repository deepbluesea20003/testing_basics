package com.lbg;

import java.util.Scanner;

public class IO {
    public static String getUserInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }
}
