import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class statics {

static int B,H;
	static boolean flag;


		static{Scanner cin=new Scanner(System.in);
		B=cin.nextInt();
		H=cin.nextInt();
		if(B*H>0){
			flag=true;
		}else{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}


 
   public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

