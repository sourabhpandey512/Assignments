package program;
import java.util.*;
import java.lang.*;

public class BubbleSort {
public static void main(String args[]) {
	int[] a=new int[]{5,6,2,4,1,7};
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int t=a[j+1];
				a[j+1]=a[j];
				a[j]=t;
			}
		}
	}
	for(int i:a)
	System.out.print(" "+i);
	
	
}
}