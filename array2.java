import java.util.Scanner;

public class array2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");

        int size = sc.nextInt();

        int numbers[]=new int[size];

        System.out.println("Enter marks");
        for(int i =0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }

    sc.close();
    }
}
