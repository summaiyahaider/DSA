/*Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'. Display that username to the user.
Example : 
email = "apnaCollegeJava@gmail.com" ; username = "apnaCollegeJava" 
email = "helloWorld123@gmail.com"; username = "helloWorld123"
*/

import java.util.*;
public class strings4 {
    
    public static void main(String args[]){

        System.out.println("Enter your email");

        Scanner sc = new Scanner(System.in);
        
        String email = sc.next();

        String username = "";

        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i)!='@'){
                username+=email.charAt(i);
            }
            else {
                break;
            }
        }

        System.out.println("Your username is "+username);


    }
}
