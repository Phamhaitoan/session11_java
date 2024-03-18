package ex11_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int maxSize = 10;
        for (int i = 0; i < maxSize; i++) {
            numbers.add((int) (Math.random()*10));
        }
        System.out.println("in ra một dãy số bất kì " + numbers);
        System.out.println("in ra số nhỏ nhất là :" + Collections.min(numbers));
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập vào giá trị thứ nhất");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("hãy nhập vào giá trị thứ hai");
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if ( number1 <= numbers.get(i) && numbers.get(i) <= number2){
                sum += numbers.get(i);
            }
        }
        System.out.println("tổng dãy số từ giá trị 1 đến giá trị 2 là "  +  sum);
    }
}
