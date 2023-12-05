package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//made by Evgenia Sichen

public class Main {
    public static void main(String[] args) {
        System.out.println("Method       Size    ArrayList_Time    LinkedList_Time");
        Time();
    }

    public static void Time() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        int size = 1000;

        // ADD
        long startTime = System.nanoTime();
        for (int j = 0; j < size; j++) {
            arrayList.add(j);
        }
        long estimatedTime = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        for (int j = 0; j < size; j++) {
            linkedList.add(j);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("ADD          " + size + "    " + estimatedTime + "           " + estimatedTime1);

        // GET
        long startTime2 = System.nanoTime();
        for (int j = 0; j < size; j++) {
            arrayList.get(j);
        }
        long estimatedTime2 = System.nanoTime() - startTime2;

        long startTime3 = System.nanoTime();
        for (int j = 0; j < size; j++) {
            linkedList.get(j);
        }
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("GET          " + size + "    " + estimatedTime2 + "          " + estimatedTime3);

        // Add_Middle
        long startTime6 = System.nanoTime();
        int randomNumber = random.nextInt(size);
        for (int j = 0; j < size; j++) {
            arrayList.add(randomNumber, j);
            randomNumber = random.nextInt(size);
        }
        long estimatedTime6 = System.nanoTime() - startTime6;

        long startTime7 = System.nanoTime();
        randomNumber = random.nextInt(size);
        for (int j = 0; j < size; j++) {
            linkedList.add(randomNumber, j);
            randomNumber = random.nextInt(size);
        }
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println("Add_Middle   " + size + "    " + estimatedTime6 + "          " + estimatedTime7);

        // REMOVE
        long startTime4 = System.nanoTime();
        for (int j = 0; j < size; j++) {
            arrayList.remove(0);
        }
        long estimatedTime4 = System.nanoTime() - startTime4;

        long startTime5 = System.nanoTime();
        for (int j = 0; j < size; j++) {
            linkedList.remove(0);
        }
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("REMOVE       " + size + "    " + estimatedTime4 + "          " + estimatedTime5);
    }
}
