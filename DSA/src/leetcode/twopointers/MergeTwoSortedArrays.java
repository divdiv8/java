package leetcode.twopointers;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public List<Integer> mergeTwoArrays(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        int ptr1 = 0, ptr2 = 0;
        while(ptr1 < arr1.length && ptr2 < arr2.length){
            if (arr1[ptr1] <= arr2[ptr2]){
                result.add(arr1[ptr1]);
                ptr1++;
            }
            else{
                result.add(arr2[ptr2]);
                ptr2++;
            }
        }
        while(ptr1 < arr1.length){
            result.add(arr1[ptr1]);
            ptr1++;
        }
        while(ptr2 < arr2.length){
            result.add(arr2[ptr2]);
            ptr2++;
        }
        return result;
    }
}
