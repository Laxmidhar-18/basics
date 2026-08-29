import java.util.Scanner;

public class array_part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " element of array : " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }


        }
    }

