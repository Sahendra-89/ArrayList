import java.util.ArrayList;

public class Array {
    public static void main(String args[]) {
        // className onbejctName=new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        // print the array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println();

        // list.add(1, 9);

        // System.out.println(list);
        // get operation- t c o(1)
        // int element = list.get(2);
        // System.out.println(element);
        // delete option linear time- o(n)
        // list.remove(2);
        // System.out.println(list);
        // set funcyton -o(n)
        // list.set(2, 10);
        // System.out.println(list);
        // contain element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

    }

}
