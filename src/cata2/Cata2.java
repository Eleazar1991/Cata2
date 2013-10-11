package cata2;

import java.util.Map;

public class Cata2 {
    public static void main(String[] args) {
        int[] array1={1,2,3,1,3,4,5,5,6};    
        MoreFrecuency a= new MoreFrecuency(array1);
        for (Map.Entry<Integer,Integer> entry : a.frecuency.entrySet()) {
            System.out.println("Elemento: "+entry.getKey());
            System.out.println("Se encuentra "+entry.getValue()+" veces");
            
            
        }
    }
}
