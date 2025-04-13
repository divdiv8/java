public class Recursion {
    public static void main(String[] args){
        //problem1:Print a string in reverse order.
        String first = "first program";
        //printStringInReverse(first);
        printReverse("xyzabc".toCharArray());
    }

    private static void printStringInReverse(String str) {
        if (str == null || str.isEmpty()) return;
        //System.out.println(str.substring(1));
        printStringInReverse(str.substring(1));
        System.out.print(str.charAt(0));
    }

    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }//xyzabc
        System.out.println(str[index] + " " + index);
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
