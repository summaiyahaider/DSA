import java.util.*;

public class functions7 {
    public static int powerFunction(int x, int n){
        int answer=1;
        for(int i = 1; i<=n; i++){
            answer=answer*x;

        }
        System.out.println(answer);
        return answer;
    }
public static void main(String args[]){
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    System.out.println("Enter the exponential power n");
    int n = sc.nextInt();

    powerFunction(x, n);
    sc.close();
}

}
