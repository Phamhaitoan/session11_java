package ex11_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo ngẫu nhiên một List số nguyên có tối đa 10 phần tử
        List<Integer> randomIntegers = new ArrayList<>();
        int maxSize = 10;
        Random random = new Random();

        for (int i = 0; i < maxSize; i++) {
            randomIntegers.add(random.nextInt(100)); // Generate random integers between 0 and 99
        }

        // In list số nguyên đó
        System.out.println("Random Integers List: " + randomIntegers);

        // Tìm ra phần tử lớn nhất
        int maxValue = Collections.max(randomIntegers);

        // In phần tử lớn nhất ra
        System.out.println("Maximum value: " + maxValue);
    }
}
