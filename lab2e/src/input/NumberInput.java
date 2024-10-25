package input;

import exceptions.InvalidNumberException;
import java.util.Scanner;

public class NumberInput {

    public int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[15];
        int count = 0;

        while (count < numbers.length) {
            System.out.print("Введите число #" + (count + 1) + ": ");
            int num = scanner.nextInt();
            try {
                if (num % 3 != 0 || num % 8 != 0) {
                    throw new InvalidNumberException(num);
                }
                numbers[count] = num;
                count++;
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return numbers;
    }
}
