package Algorithms;

public class plusminus {
	 static void plusMinus(int[] arr) {
 double pv=0;
 double nv=0;
 double zv=0;
 for(int i=0;i<arr.length;i++) {
	 if(arr[i]>0) {
		 pv++;
	 } else if (arr[i]<0) {
		 nv++;
	 } else {
		 zv++;
	 }
	 }
 System.out.format("%.6f",pv/arr.length);
 System.out.println();
 System.out.format("%.6f",nv/arr.length);
 System.out.println();
 System.out.format("%.6f",zv/arr.length);
 System.out.println();
}
public static void main(String[] args) {
	int arr[] = {-4,3,-9,0,4,1};
	plusMinus(arr);
}	 
}
