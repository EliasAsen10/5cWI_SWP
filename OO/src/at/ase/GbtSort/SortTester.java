package at.ase.GbtSort;

import java.util.Arrays;

public class SortTester {
    public static void main(String[] args) {
        // Erstelle Test-Array mit unsortierten Zahlen
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(testArray));
        
        // Teste jeden Sortieralgorithmus mit einer Kopie des Arrays
        testInsertionSort(testArray.clone());
        testSelectionSort(testArray.clone());
        testBubbleSort(testArray.clone());
    }
    
    // Test-Methode für Insertion Sort
    private static void testInsertionSort(int[] array) {
        Sorter sorter = new InsertionSort();
        System.out.println("\nInsertion Sort:");
        System.out.println("Vorher: " + Arrays.toString(array));
        // Zeitmessung Start
        long startTime = System.nanoTime();
        array = sorter.sort(array);
        // Zeitmessung Ende
        long endTime = System.nanoTime();
        System.out.println("Nachher: " + Arrays.toString(array));
        System.out.println("Zeit: " + (endTime - startTime) + " Nanosekunden");
    }
    
    // Test-Methode für Selection Sort
    private static void testSelectionSort(int[] array) {
        Sorter sorter = new SelectionSort();
        System.out.println("\nSelection Sort:");
        System.out.println("Vorher: " + Arrays.toString(array));
        // Zeitmessung Start
        long startTime = System.nanoTime();
        array = sorter.sort(array);
        // Zeitmessung Ende
        long endTime = System.nanoTime();
        System.out.println("Nachher: " + Arrays.toString(array));
        System.out.println("Zeit: " + (endTime - startTime) + " Nanosekunden");
    }
    
    // Test-Methode für Bubble Sort
    private static void testBubbleSort(int[] array) {
        Sorter sorter = new BubbleSort();
        System.out.println("\nBubble Sort:");
        System.out.println("Vorher: " + Arrays.toString(array));
        // Zeitmessung Start
        long startTime = System.nanoTime();
        array = sorter.sort(array);
        // Zeitmessung Ende
        long endTime = System.nanoTime();
        System.out.println("Nachher: " + Arrays.toString(array));
        System.out.println("Zeit: " + (endTime - startTime) + " Nanosekunden");
    }
} 