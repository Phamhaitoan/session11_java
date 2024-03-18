package ex11_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SUM {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int maxSize = 10;
        for (int i = 0; i < maxSize; i++) {
            numbers.add((int) (Math.random()*100));
        }
        System.out.println("in ra một dãy số bất kì " + numbers);
        int sum = 0;
        for (Integer number : numbers){
            sum += number;
        }
        System.out.println("tổng dãy số là " + sum);
    }
}
