import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class endoffile {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int lineNum=1;
   while (scan.hasNextLine()==true) {
        if(scan.hasNext()==true){
        
            System.out.println(lineNum+" "+scan.nextLine());
            lineNum++;
        }
    } 
    }
}
