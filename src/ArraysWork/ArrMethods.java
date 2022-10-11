package ArraysWork;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class ArrMethods implements ArrMethodsInterface{

    /** copies each element in al k times
     *
     * @param al arraylist of strings
     * @param k number of times to copy each element
     */
    public void repeat(ArrayList<String> al, int k) {

        //storing the original length of the list
        int listLength = al.size();

        //clearing the arraylist if 0 or below
        if (k <= 0) {
            al.clear();
            return;
        }

        //iterate through the list, copying the specified value k times, and then removing the original
        for (int i = 0; i < listLength; i++) {
            for (int j = 0; j < k; j++) {
                String toCopy = al.get(0);
                al.add(toCopy);
            }
            al.remove(0);
        }
    }

    /**Takes a sorted arraylist of strings and removes any duplicates within the list
     *
     * @param al a sorted arraylist of strings
     */
    public void deleteDuplicates(ArrayList<String> al){

        //storing the original list size
        int listSize = al.size();
        //a variable to check where in the list we are once we start removing things
        int distanceThroughList = 0;

        /*loops through the list and compares each object to the one immediately after it
        if they are the same, it removes the first from the array list
         */
        for(int i = 0; i < listSize-1; i++) {
            if(distanceThroughList + 1 == listSize){
                break;
            }
            if (al.get(distanceThroughList) == al.get(distanceThroughList + 1)) {
                al.remove(distanceThroughList);
            }
            else {
                distanceThroughList++;
            }
        }
    }

    /**accepts an array of integers and returns a new array where each pair of integers
     * has been replaced by a sum of that pair. If number of elements is odd, final element will be unchanged.
     *
     * @param arr an array of integers
     * @return an array of integers where the values from arr have been collapsed to their sums
     */
    public int[] collapse(int[] arr){

        //storing length of original array
        int originalLength = arr.length;

        //calculating the length of the new array
        int newLength = originalLength / 2 + originalLength % 2;

        //creating the new array
        int[] summedArr = new int[newLength];

        //creating an integer to track how far through the original array we have iterated
        int distanceThroughOriginalArray = 0;

        /*loops through the new array, summing the two corresponding values
        * in the original if they are not the last odd integer, while inserting it unchanged if it is.
        */
        for (int i = 0; i < newLength; i++){
            if (distanceThroughOriginalArray + 1 < originalLength){
                summedArr[i] = arr[distanceThroughOriginalArray] + arr[distanceThroughOriginalArray + 1];
                distanceThroughOriginalArray += 2;
            }
            else{
                summedArr[i] = arr[distanceThroughOriginalArray];
                distanceThroughOriginalArray++;
            }
        }
        return summedArr;
    }

    /**takes a pair of integer arrays and returns true if the arrays contain
     * the same elements in the same order
     *
     * @param a1 first array of integers
     * @param a2 second array of integers
     * @return true if arrays are identical, false if not
     */
    public boolean equals(int[] a1, int[] a2){

        //return false if the arrays are not the same length
        if(a1.length != a2.length){
            return false;
        }
        //iterate through the arrays, checking each element against the equivalent element from the other array
        for (int i = 0; i < a1.length; i++){
            if(a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }


    /**accepts a list of integers, removes the even values from it, and then returns a list of the even
     * values that have been removed
     *
     * @param list the inital list to remove evens from
     * @return a list of the even numbers that have been removed
     */
    public List<Integer> removeEvens(List list){

        //length of original list
        int listLength = list.size();

        //a new list to hold the evens
        List evens = new ArrayList();

        //a variable to track which value in the list we want to pull out
        int distance = 0;

        //iterate through the list removing even values and adding them to the list of evens
        for (int i = 0; i < listLength; i++){
            int value = (int)list.get(distance);
            if(value % 2 == 0){
                list.remove(distance);
                evens.add(value);
            }
            else{
                distance++;
            }
        }
        return evens;
    }

    /**
     * A method to print the contents of a list
     * @param list the list to print
     */
    public void printList(List list){
        System.out.print("[ ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i).toString());
            if(i < list.size() - 1){
                System.out.print(", ");
            }
            else{
                System.out.println(" ]");
            }
        }
    }

}
