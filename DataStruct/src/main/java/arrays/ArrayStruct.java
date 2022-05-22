package arrays;

import java.util.Scanner;

public class ArrayStruct {

    public static void main(String[] args) {
        addElements();
    }


    public static void addElements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter in the size of array");
        int size = sc.nextInt();

        int[] newArray = new int[size];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++){
            newArray[i] = sc.nextInt();
        }
        System.out.println("The elements in the array");
        for (int j = 0; j < size; j++){

            if(j == size-1){
                System.out.print(newArray[j]+"]");
            }else if(j == 0) {
                System.out.print("["+newArray[j]+", ");
            }else {
                System.out.print(newArray[j] + ", ");
            }

        }

    }


    public  int[] editElement(int pos, int val){
        int[] arr = {420, 69, 21, 8902};
        int length = arr.length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Elements before modify");
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
        arr[pos] = val;

        System.out.println("\nArray after modification");
        for(int k =0; k < length; k++){
            System.out.print(arr[k] + " ");
        }
        return arr;
    }
}
