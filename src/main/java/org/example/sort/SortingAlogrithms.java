package org.example.sort;

public class SortingAlogrithms {
    public int[] selectionSort(int[] a) throws Exception {
        if(a.length == 0)
            throw new Exception("Array contains no elements");

        int temp;
        int index=0;

        for(int k=0; k<a.length-1; k++){
            index = k;
            for(int i=k+1; i<a.length; i++){
                if(a[i] < a[index]){
                    index = i;
                }
            }
            //swap a[k] a[index]
            temp = a[index];
            a[index] = a[k];
            a[k] = temp;


        }
        return a;
    }
}
