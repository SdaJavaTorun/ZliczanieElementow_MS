package com.sdajava.zliczaniewystapien;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int wynik = 0;
        int x = 0;
        System.out.println("Podaj ilośc elementów tablicy: ");
        int n = input.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(10);
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                wynik++;
            }
        }
        if (wynik == 1) {
            System.out.println("Wartość " + x + " występuje " + wynik + " raz.");
        } else {
            System.out.println("Wartość " + x + " występuje " + wynik + " razy.");
        }
    }
}

