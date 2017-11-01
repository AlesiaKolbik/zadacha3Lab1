package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i != j && i != k && j != k) {
                        int sum = i * 100 + j * 10 + k;
                        System.out.print(sum+" ");
                    }
                }
            }
        }
    }
}
