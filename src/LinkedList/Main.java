package LinkedList;

public class Main {

    public static void main(String args[]) {
        LinkedIntList list = new LinkedIntList("list", 1, 5, 3, 4, 2);

        list.add(4);

        list.add(4);

        list.add(4);

        System.out.println("deleteBack test:");

        System.out.println("list before: " + list.toFormattedString());

        System.out.println("value returned:" + list.deleteBack());

        System.out.println("new list: " + list.toFormattedString());

        System.out.println("removeDuplicates test:");

        System.out.println("list before: " + list.toFormattedString());

        list.removeDuplicates();

        System.out.println("new list: " + list.toFormattedString());


    }
}
