package com.rumata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Число " + number + " в 16-иричной системе равно: " + Integer.toHexString(number));
        System.out.println("Число " + number + " в 2-ичной системе равно: " + binaryString);
        System.out.println("Число " + binaryString + " в 10-ичной системе равно: " + Integer.parseInt(binaryString, 2));

    }
}
