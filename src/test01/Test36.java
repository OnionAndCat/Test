package test01;

public class Test36 {
    public static void main(String[] args) {
        int[] arr ={2,4,8,6,3,1,5,4};
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i] + "]");
            else
                System.out.print(arr[i] + ",");
        }
    }
}
