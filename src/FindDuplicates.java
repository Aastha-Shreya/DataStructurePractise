import java.util.*;


public class FindDuplicates {
    //first we will use brut force technique to find the duplicates in a array.
    public boolean duplicates(int[] arr){

        int[] newArr = new int[];

        for(int i =0; i<arr.length; i++){
            newArr[arr[i]] += 1;
            if(newArr[arr[i]]>1){
                return true;
            }
        }
        return false;
    }
}
