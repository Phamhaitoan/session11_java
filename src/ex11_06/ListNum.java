package ex11_06;

import java.util.ArrayList;
import java.util.List;

public class ListNum {
    public static void main(String[] args)
    {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(18);
        listInteger.add(39);
        listInteger.add(3);
        listInteger.add(20);
        listInteger.add(5);
        listInteger.add(36);
        listInteger.add(8);

        for (int i = 0; i < listInteger.size(); i++)
        {
            for (int j = 0; j < listInteger.size() - 1 ; j++)
            {
                if (listInteger.get(j) > listInteger.get(j+1))
                {
                    int temp = listInteger.get(j);
                    listInteger.set(j,listInteger.get(j+1));
                    listInteger.set(j+1,temp);

                }
            }
        }
        for (int i = 0; i < listInteger.size(); i++)
        {
            System.out.println(listInteger);

        }
    }
}
