package cata2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MoreFrecuency {

    private final int[] array;
    public static HashMap<Integer, Integer> frecuency;

    public MoreFrecuency(int[] array) {
        this.array = array;
        frecuency = new HashMap<>();
        addFrecuency();
    }

    private void addFrecuency() {
        for (int i = 0; i < array.length; i++) {
            if (frecuency.isEmpty()) {
                frecuency.put(array[i], 1);
            } else {
                if (frecuency.containsKey(array[i])) {
                    frecuency.put(array[i], frecuency.get(array[i])+1);
                } else {
                    frecuency.put(array[i], 1);
                }
            }
        }
    }
    public static int moreTimesAppear(){
        int aux=0;
        int max=0;
        for(Entry<Integer, Integer> a: frecuency.entrySet()){
            if(aux<a.getValue()){
                aux=a.getValue();
                max=a.getKey();
            }
        }
        return max;
    }            
}
