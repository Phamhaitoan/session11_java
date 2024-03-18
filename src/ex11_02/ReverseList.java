package ex11_02;
import java.util.ArrayList;
import java.util.List;


public class ReverseList {
        public static void main(String[] args) {
            List<Integer> originalList = new ArrayList<>();
            List<Integer> reversedList = new ArrayList<>();

            // Thêm các phần tử vào list
            originalList.add(1);
            originalList.add(2);
            originalList.add(3);
            originalList.add(4);
            originalList.add(5);

            System.out.println("Original List: " + originalList);

            // Đảo ngược danh sách
            for (int i = originalList.size() - 1; i >= 0; i--) {
                reversedList.add(originalList.get(i));
            }

            System.out.println("Reversed List: " + reversedList);
        }

}
