package leetcode.twopointers.templates;

public class TwoInputsExhaustBoth {
    public int template(int[] arr1, int[] arr2){
        int i = 0, j = 0, answer = 0;
        boolean CONDITION = true;
        while(i < arr1.length && j < arr2.length){
            //do some logic
            if(CONDITION){
                i++;
            } else{
                j++;
            }
        }
        while(i < arr1.length){
            //do logic
            i++;
        }
        while(j < arr2.length){
            //do logic
            j++;
        }
        return answer;
    }
}
