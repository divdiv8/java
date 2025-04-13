package collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListPractice {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>(2);
    ArrayList<Student> listStudents = new ArrayList<>();
    void arrayListMethods(){
        list1.add(10);
        list1.add(20);
        list1.add(30);
        for (int i = 4; i <= 10 ; i ++){
            list1.add(i*10);
        }
        System.out.println(list1);
        list1.remove(1);//index
        System.out.println(list1);
        System.out.println("contains 10 " + list1.contains(10));
        System.out.println("index of 20 " + list1.indexOf(20));
        Object[] arr1 = list1.toArray(); //no type version
        Integer[] arr =  list1.toArray(new Integer[0]);
        System.out.println("integer array" + Arrays.toString(arr));
        /* yo
         * yo
         * */
        System.out.println("is list2 empty - " + list2.isEmpty());
        list2.add("div");
        list2.add("vis");
        list2.add("add");//initial capacity?
        System.out.println(list2.size());
        //list2.clear();

        Collections.sort(list2);// natural order
        System.out.println("post sort" + list2);
        Collections.reverse(list2);
        System.out.println("post reverse " + list2);
        Collections.shuffle(list2);
        System.out.println("post shuffle" + list2);

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.age, o2.age);
            }
        };
        listStudents.add(new Student(10, "div"));
        listStudents.add(new Student(20, "vis"));
        listStudents.add(new Student(12, "am"));
        listStudents.forEach(s -> System.out.println(s.age + " " + s.name));
        listStudents.sort(comparator);    // custom order
        listStudents.forEach(s -> System.out.println(s.age + " " + s.name));
        Comparator<Student> comparatorByName = Comparator.comparing(o -> o.name);

        listStudents.sort(comparatorByName);


    }
    public static void main(String[] args){
        new ArrayListPractice().arrayListMethods();
    }
}
class Student{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}
