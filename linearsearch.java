import java.util.Scanner;

public class linearsearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elemeents of Array ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " +(i+1)+ ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();

        int result = linearSearch(arr, x);

        if(result == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index " +result);
        }
    }

    public static int linearSearch(int[] arr, int x){
        int size = arr.length;
        for(int i = 0; i < size; i++){
        if (arr[i] == x) {
            return i;       
        }
    }
    return -1;
    }
}