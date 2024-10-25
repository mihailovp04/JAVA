package main;

import input.NumberInput;

public class Main {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();

        int[] numbers = numberInput.inputNumbers();
        System.out.println("Все числа введены корректно: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
