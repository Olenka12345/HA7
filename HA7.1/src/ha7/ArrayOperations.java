package ha7;

import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {46, 69, 75, 66, 99, -23, -12, -32, -1, 1, 5, 7, 32, 19, -6, 99, 42, -16, 2, 8};
        Random random = new Random();

        // Заповнення масиву випадковими числами в діапазоні від -100 до 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }

        // Вивід масиву
        System.out.print("Масив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 1. Знаходження суми всіх від'ємних чисел
        int negativeSum = 0;
        for (int num : numbers) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);

        // 2. Кількість парних і непарних чисел
        int evenCount = 0, oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        // 3. Знаходження найбільшого і найменшого елементів та їх індексів
        int max = numbers[0], min = numbers[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + ", Індекс: " + maxIndex);
        System.out.println("Найменший елемент: " + min + ", Індекс: " + minIndex);

        // 4. Середнє арифметичне чисел після першого від'ємного числа
        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1 || firstNegativeIndex == numbers.length - 1) {
            System.out.println("Від'ємних чисел немає або вони знаходяться в кінці масиву.");
        } else {
            int sum = 0, count = 0;
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                sum += numbers[i];
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Середнє арифметичне чисел після першого від'ємного: " + average);
        }
    }
}

