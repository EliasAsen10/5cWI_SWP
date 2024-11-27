package at.ase.AlgorithmExamples;

import java.util.Random;

public class DataGenerator1 {

        public static int[] generateDataArray(int size) {
        int[] dataArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt(Integer.MAX_VALUE) + 1;
        }

        return dataArray;
}
}
