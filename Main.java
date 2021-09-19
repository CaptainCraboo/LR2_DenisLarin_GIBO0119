package ru.mirea.gibo01.pr2;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Объявляем сканнер
        System.out.print("Введите количество элементов массива: ");

        int size = input.nextInt(); //Читаем с клавиатуры размер массива и записываем в size

        Integer[] array1 = new Integer[size]; // Создаем массив размером size

        System.out.print("Введите элементы массива с клавиатуры:");
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt(); //Заполняем массив элементами, введенными с клавиатуры
        }
        System.out.print("Введённый массив: "); //Выводим массив
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array1[i]);
        }

        // Находим максимальный элемент массива, предварительно выводим все элементы массива в консоль
        System.out.print("\n"+"2.Максимальный элемент массива: ");
        int maxNumber = size;
        for (int i = 0; i < size; i++) {
            if (maxNumber <= array1[i]) {
                maxNumber = array1[i];
            }
        }
        System.out.println(maxNumber);

        //Находим минимальный элемент массива
        System.out.print("3.Минимальный элемент массива: ");
        int minNumber = array1[0];
        for (int i = 0; i < size; i++) {
            if (array1[i] < array1[0]) {
                minNumber = array1[i];
            }
        }
        System.out.println(minNumber);

        //Находим сумму элементов массива
        System.out.print("4.Сумма элементов массива: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array1[i];
        }
        System.out.println(sum);

        //Находим среднее арифметическое чисел массива
        System.out.print("5.Среднее арифметическое массива: ");
        int average = 0;
        for (int i = 0; i < size; i++) {
            average = sum / size;
        }
        System.out.println(average);

        //Произведем сортировку массива по возрастанию
        System.out.print("6.Массив, отсортированный по возрастанию: ");
        Arrays.sort(array1);
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\t");

        //Произведем сортировку массива по убыванию
        System.out.print("7.Массив, отсортированный по убыванию:");
        Arrays.sort(array1, Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}