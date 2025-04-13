//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//
//        }
        /// Primitive vs reference datatypes
        ///a primitive variable's information is stored as the value of that variable,
        ////whereas a reference variable holds a reference to information related to that variable
        String x = "x"; // string pool
        String y = "x"; ///same string as y - reference same literal in string pool
        String z = new String("x"); //object in heap
        String a = new String("x"); // object in heap
        System.out.println(x == y); /// == compares memory location in case of strings. true
        System.out.println(z == a); /// false because different memory
        System.out.println(z.equals(a)); ///compares values

    }
}