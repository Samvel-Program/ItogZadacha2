import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by OUT-Akopyan-SR on 24.05.2019.
 */
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Заполняем массив - ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        System.out.print("\nSorted: \n");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
















