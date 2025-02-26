package at.ase.GbtSort;

public class BubbleSort implements Sorter {
    @Override
    public int[] sort(int[] array) {
        // Äußere Schleife: Anzahl der Durchgänge
        for (int i = 0; i < array.length - 1; i++) {
            // Innere Schleife: Vergleiche benachbarte Elemente
            for (int j = 0; j < array.length - i - 1; j++) {
                // Wenn linkes Element größer als rechtes Element
                if (array[j] > array[j + 1]) {
                    // Tausche die Elemente
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
} 