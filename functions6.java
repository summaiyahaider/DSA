import java.util.*;

public class functions6 {
    public static String table(int a) {
        int product;
        String str="";
        for (int i = 1; i <= 10; i++) {
            product = a * i;
            str=(a + "*" + i + "=" + product);


            /* 
            Second approach:
            str=str+(a + "*" + i + "=" + product)+"\n";*/
           
            System.out.println(str);
        }
        return str;
    }

    public static void main(String args[]) {
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        table(a);

        sc.close();
    }
}
