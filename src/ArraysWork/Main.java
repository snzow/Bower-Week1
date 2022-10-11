package ArraysWork;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrMethods test = new ArrMethods();

        ArrayList<String> check = new ArrayList<String>();
        check.add("bus");
        check.add("car");
        check.add("plane");

        System.out.println("repeat test:");
        test.printList(check);
        test.repeat(check,3);
        test.printList(check);

        System.out.println("deleteDuplicates test:");
        test.printList(check);
        test.deleteDuplicates(check);
        test.printList(check);

        ArrayList<Integer> intTest = new ArrayList<Integer>();
        intTest.add(1);
        intTest.add(5);
        intTest.add(1);
        intTest.add(7);
        intTest.add(4);

        int[] ar1 = {1,2,3};
        int[] ar2 = {1,2,3};
        System.out.println("equals test:");
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(test.equals(ar1,ar2));

        System.out.println("removeEvens test:");
        test.printList(intTest);
        test.removeEvens(intTest);
        test.printList(intTest);

        System.out.println("collapse test:");
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(test.collapse(ar1)));

    }
}
