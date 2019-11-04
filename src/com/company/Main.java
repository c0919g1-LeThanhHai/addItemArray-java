package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập vào kích thước mảng: ");
            size = scanner.nextInt();
        } while (size > 20);
        addItem(createArray(size));
    }

    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size + 1];
        for(int i = 0; i < size; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", (i + 1));
            arr[i] = scanner.nextInt();
        }
        for(int item: arr) {
            System.out.print(item+"\t");
        }
        return arr;
    }

    public static void addItem(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int index, item;
        do {
            System.out.print("\nNhập vị trí muốn thay đổi: ");
            index = scanner.nextInt();
            if(index < 0 || index > arr.length - 1) {
                System.out.println("Vị trí không chính xác. Mời nhập lại");
            }
        } while (index < 0 && index > arr.length);

        System.out.print("Nhập giá trị thay đổi: ");
        item = scanner.nextInt();

        for(int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = item;
        for (int value: arr) {
            System.out.print(value+"\t");
        }
    }
}
