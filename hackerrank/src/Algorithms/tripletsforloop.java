package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class tripletsforloop {
	
	static List<Integer> compareTriplets(List <Integer> a, List <Integer> b) {
    	List<Integer>result =new ArrayList<>();
    	int apoints =0;
    	int bpoints=0;
    	for(int i=0;i<a.size();i++) {

        	if(a.get(i)>b.get(i)) {
        		apoints++;
        	}
        	else if (b.get(i)>a.get(i))
        	{bpoints++;
        		}
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
       System.out.println(ahh);}
}

