package selectionsort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào độ dài của mảng: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Mời bạn nhập vào giá trị của các phần tử trong mảng: ");
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

    private static void sort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
