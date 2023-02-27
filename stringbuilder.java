import java.util.*;

public class stringbuilder {

    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("Tony");

        //set char at an Index

        sb.setCharAt(2, 'p');
        System.out.println(sb);

        //insert character at an index

        sb.insert(3, 'y');
        System.out.println(sb);

        //Deleting a character in a string

        sb.delete(2, 4); //Ending index is non-inclusive
        System.out.println(sb);

    }
    
}
