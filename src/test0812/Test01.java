package test0812;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {6, 8, 4, 1, 5, 9, 7, 2, 3, 2};
        //选择
        sortOne(arr);
        printArr(arr);
        //冒泡
        sortThree(arr);
        printArr(arr);
        //比较
        sortTwo(arr);
        printArr(arr);
    }

    public static int[] sortOne(int[] arr) {    //选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    change(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static int[] sortTwo(int[] arr) {        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    change(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static int[] sortThree(int[] arr) {      //比较排序
        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > num) {
                    num = arr[j];
                    index = j;
                }
            }
            if (i != index)
                change(arr, i, index);
        }
        return arr;
    }

    public static void change(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i] + "]");
            else
                System.out.print(arr[i] + " ,");
        }
        System.out.println();
    }
}
