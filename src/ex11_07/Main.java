package ex11_07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random()*100));
        }

        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        System.out.println(listNumber);
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < listNumber.size(); i++) {
           if (listNumber.get(i) % 2 == 0){
               listNumber.add(listNumber.get(i));
           }
        }
        System.out.println(listNum);
    }
}
