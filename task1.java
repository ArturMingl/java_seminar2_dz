package java_tasks.Seminar2dz;

import java.io.FileWriter;
import java.util.Arrays;

/**Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
 * результат после каждой итерации запишите в лог-файл. */

public class task1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] arr = {6, 2, -3, 0, 21, 15, 3, 5, 6, 1};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                sb.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter fw = new FileWriter("log_task1.txt", false);
                    fw.write(sb.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }  
            }
        }
    }
}
