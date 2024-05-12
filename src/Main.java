import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        float[] arrFl = {1.57f, 7.654f, 9.986f};

        boolean[] arrBool = {true, true, false, false, true};

        //Задача 2
        System.out.println("Задача 2");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }

        for (int i = 0; i < arrFl.length; i++) {
            if (i == arrFl.length - 1) {
                System.out.println(arrFl[i]);
                break;
            }
            System.out.print(arrFl[i] + ",");
        }

        for (int i = 0; i < arrBool.length; i++) {
            if (i == arrBool.length - 1) {
                System.out.println(arrBool[i]);
                break;
            }
            System.out.print(arrBool[i] + ",");
        }

        //Задача 3
        System.out.println("Задача 3");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }

        for (int i = arrFl.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrFl[i]);
                break;
            }
            System.out.print(arrFl[i] + ",");
        }

        for (int i = arrBool.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrBool[i]);
                break;
            }
            System.out.print(arrBool[i] + ",");
        }

        //Задача 4
        System.out.println("Задача 4");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString (arr));
    }
}