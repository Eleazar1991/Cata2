package cata2;

import java.util.HashMap;

public class MoreFrecuency {

    private final int[] array;
    public HashMap<Integer, Integer> frecuency;

    public MoreFrecuency(int[] array) {
        this.array = array;
        frecuency = new HashMap<>();
        addFrecuency();

    }

    private void addFrecuency() {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            if (frecuency.isEmpty()) {
                frecuency.put(array[i], 1);
            } else {
                if (frecuency.containsKey(array[i])) {
                    frecuency.put(array[i], ++value);
                } else {
                    frecuency.put(array[i], value);
                }
            }
            value=1;
        }
    }
}
