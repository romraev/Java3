package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.printf("\nНаименьшее число: " + list.get(0));
        System.out.printf("\nНаибольшее число: " + list.get(list.size() - 1));
        System.out.printf("\nСреднее значение: " + list.get(list.size()/2));
    }
}