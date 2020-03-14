package Algorithms;

import java.util.List;

public class diagonaldifference {
	public static int diagonalDifference (List<List<Integer>> arr) {
	
		 int d1=0;
	        for(int i=0;i<arr.size();i++) {
	            d1=d1+arr.get(i).get(i);
	            }
	        int d2=0;
	        int j=arr.size()-1;
	        for(int i=0;i<arr.size();i++) {
	            d2=d2+arr.get(i).get(j);
	            j--;
	        }
	        int r = d1-d2;
	        if(r>=0) {
	            return r;
	        } else {
	            return -r;
	            }
			}}
