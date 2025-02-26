package at.ase.GbtSort;

public class SelectionSort implements Sorter {
    @Override
    public int[] sort(int[] array) {
        // Durchlaufe das Array bis zum vorletzten Element
        for (int i = 0; i < array.length - 1; i++) {
            // Setze aktuelles Element als Minimum
            int minIndex = i;
            // Suche in restlichem Array nach kleinerem Element
            for (int j = i + 1; j < array.length; j++) {
                // Wenn kleineres Element gefunden, merke Position
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Tausche gefundenes Minimum mit aktuellem Element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
} 