package main.java.com.codr.searching;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int array[] = {12,15,82,43,65,23,87,29};
        int length = array.length;
        int toSearch = 65;
        Arrays.sort(array);
        int result = binarySearch(array,0,length-1,toSearch);
        if (result > 0)
            System.out.println("Element found at position " + result);
        else
            System.out.println("Element not found");
    }

    static int binarySearch(int array[],int firstIndex, int lastIndex, int toSearch){
        if (lastIndex >= firstIndex){
            int mid = firstIndex + (lastIndex - firstIndex)/2;
            if (array[mid] == toSearch)
                return mid;
            if (array[mid] > toSearch)
                return binarySearch(array,firstIndex,mid-1,toSearch);
            if (array[mid] < toSearch)
                return binarySearch(array,mid+1,lastIndex,toSearch);
        }
        return -1;
    }
}

