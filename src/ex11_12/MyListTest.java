package ex11_12;
import java.util.ArrayList;
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list.contains(3));

        list.remove(3);
        System.out.println(list.indexOf(3));
        System.out.println(list.toString());

        }
}
