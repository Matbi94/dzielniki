package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Podaj liczbe naturalna = ");
        int value = scanner.nextInt();

        scanner.close();

        int wynik = 1;
        while (wynik * 2 <= value) {
            wynik = wynik * 2;
            System.out.println(wynik);
        }
    }
}
