import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.HashSet;

class exp14 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java"); arrayList.add("Python"); arrayList.add("Java");
        System.out.println("ArrayList: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First"); linkedList.add("Second");
        linkedList.addFirst("Start");
        System.out.println("LinkedList: " + linkedList);

        Vector<Integer> vector = new Vector<>();
        vector.add(10); vector.add(20);
        System.out.println("Vector: " + vector);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red"); hashSet.add("Blue"); hashSet.add("Red");
        System.out.println("HashSet (duplicates removed): " + hashSet);
    }
}
