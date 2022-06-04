
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class zadanieSortirovki {
        public static void main(String[] args) {

            int[] data = {1968, 1994, 1991, 1989, 1995, 2022, 2020, 2015, 2019, 2012, 2009};
                System.out.print(Arrays.toString(data) + " => ");
            Date start = new Date();
                zadanieSortirovki SelectionSorter = null;
                SelectionSorter.sort(data);
            Date end = new Date();
                System.out.println(Arrays.toString(data));
            System.out.println("date start " + start.getTime());
            System.out.println("date end " + end.getTime());
            System.out.println("Java sort time = " + (end.getTime() - start.getTime()));



            List<Integer> list = new ArrayList<>();
            list.add(1968);
            list.add(1994);
            list.add(1991);
            list.add(1989);
            list.add(1995);
            list.add(2022);
            list.add(2020);
            list.add(2015);
            list.add(2019);
            list.add(2012);
            list.add(2009);
            System.out.print(list + " => ");
            Date start1 = new Date();
            Collections.sort( list );
            Date end1 = new Date();
            System.out.println(list);
            System.out.println("date start " + start1.getTime());
            System.out.println("date end " + end1.getTime());
            System.out.println("Java sort time = " + (end1.getTime() - start1.getTime()));

        }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }




}
