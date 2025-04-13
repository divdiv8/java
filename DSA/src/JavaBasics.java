public class JavaBasics {
    public static void main(String[] args){
        //array
        int[] nums = new int[4];
        for(int i = 0 ; i< nums.length ; i++){
            nums[i] = i + 10;
        }
        for(int i = 0 ; i< nums.length ; i++){
            System.out.println(nums[i] + " at index = " + i);
        }
        System.out.println(nums);
    }
}
