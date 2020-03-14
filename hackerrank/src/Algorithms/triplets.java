package Algorithms;


import java.util.ArrayList;
import java.util.List;

public class triplets {
     // Complete the compareTriplets function below.
	
    static List<Integer> compareTriplets(List <Integer> a, List <Integer> b) {
    	List<Integer>result =new ArrayList<>();
    	int apoints =0;
    	int bpoints=0;
    	
    	if(a.get(0)>b.get(0)) {
    		apoints++;
    	}
    	else if (b.get(0)>a.get(0))
    	{bpoints++;
    		}
    	if(a.get(1)>b.get(1)){
    		apoints++;
    	}
    	else if (b.get(1)>a.get(1)) {
    		bpoints++;
    	}
    	if (a.get(2)>b.get(2)) {
    		apoints++;
    	}else if (b.get(2)<a.get(2)) {
    		bpoints++;
    	}
    	result.add(apoints);
    	result.add(bpoints);
    	 return result;	
        }
    public static void main(String[] args) {
	List<Integer> a = new ArrayList<>();
	a.add(44);
	a.add(55);
	a.add(77);
	List<Integer> b = new ArrayList<>();
	b.add(43);
	b.add(56);
	b.add(76);
	List<Integer>ahh=compareTriplets(a,b);
	System.out.println(ahh);
	
	}
}
