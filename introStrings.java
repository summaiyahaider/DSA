import java.util.*;

public class introStrings {
    public static void main(String args[]){

        System.out.println("Enter your first and last name");

        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();


        //Concatenantion
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        //Using charAt function
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //Using compareTo function
        if(firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        } 

        //Substring

        String sentence = "My name is Summaiya";
        String name = sentence.substring(11);
        System.out.print(name);
    }
}
