import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class hurdle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
	int count=0;
        int[] height = new int[n];
        for(int i=0; i < n; i++){
            height[i] = in.nextInt();
        }


for(int j=0; j < n; j++){
int diff;
        if(k<height[j]){
diff=height[j]-k;
count=count+diff;
k=k+diff;
}


}
System.out.println(count);
    }
}
