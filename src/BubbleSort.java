import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào độ dài của mảng: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Mời bạn nhập vào giá trị của các phần tử trong mảng:");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("Mời bạn nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextDouble();
        }

        sort(array);
        System.out.println("Mảng sau khi sắp xếp theo thứ tự tăng dần:");
        printArray(array);
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }
    }

    private static void sort(double[] array) {
        for (int u = array.length - 1; u > 0; u--) {
            for (int i = 0; i < u; i++) {
                if (array[i] > array[i + 1]) {
                    double swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                }
            }
        }
    }
}
