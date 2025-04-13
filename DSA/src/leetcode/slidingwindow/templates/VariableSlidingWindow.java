package leetcode.slidingwindow.templates;

public class VariableSlidingWindow {
    public void fn(int[] arr){
        int left = 0;
        for(int right = 0; right < arr.length; right ++){
            //some logic to add element at arr[right] to the window
            while(true){//WINDOW_IS_INVALID
                //do some logic to remove element
                //at arr[left] from window
                left++;
            }
            //do some logic to update answer

        }
    }
}
