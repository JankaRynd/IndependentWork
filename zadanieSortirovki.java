import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class zadanieSortirovki {
        public static void main(String[] args) {

            int[][] data = {
                    {},
                    {1},
                    {28, 03, 24, 29},
                    {10, 8, 3, 2, 9},
                    {1968, 1994, 1991, 1989, 1995, 2022, 2020, 2015, 2019, 2012, 2009},
            };
            for (int[] arr : data) {
                System.out.print(Arrays.toString(arr) + " => ");
                zadanieSortirovki SelectionSorter = null;
                SelectionSorter.sort(arr);
                System.out.println(Arrays.toString(arr));
            }

            List<Integer> list = new ArrayList<>();
            Date start = new Date();
            Collections.sort( list );
            Date end = new Date();

            System.out.println("Java sort time = " + (end.getTime() - start.getTime()));

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
