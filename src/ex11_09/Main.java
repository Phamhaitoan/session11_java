package ex11_09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(4);

        for (int i = 0; i < listNumber.size(); i++) {
            for (int j = i +1 ; j < listNumber.size(); j++) {
                if (listNumber.get(j).equals(listNumber.get(i))){
                    listNumber.remove(j);
                    j--;
                }
            }
        }
        System.out.println(listNumber);
    }
}
