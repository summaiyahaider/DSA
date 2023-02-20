import java.util.*;

public class introStrings {
    public static void main(String args[]){

        String firstName = "Summaiya";
        String lastName = "Haider";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
