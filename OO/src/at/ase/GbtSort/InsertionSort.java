package at.ase.GbtSort;

public class InsertionSort implements Sorter {
    @Override
    public int[] sort(int[] array) {
        // Durchlaufe das Array ab dem zweiten Element
        for (int i = 1; i < array.length; i++) {
            // Speichere aktuelles Element als Schlüssel
            int key = array[i];
            // Starte Vergleich mit vorherigem Element
            int j = i - 1;
            
            // Verschiebe Elemente nach rechts, solange sie größer als key sind
            while (j >= 0 && array[j] > key) {
                // Verschiebe größeres Element eine Position nach rechts
                array[j + 1] = array[j];
                // Gehe zum nächsten Element
                j = j - 1;
            }
            // Füge key an der richtigen Position ein
            array[j + 1] = key;
        }
        return array;
    }
} 