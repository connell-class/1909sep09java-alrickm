package Day7;

import java.util.Arrays;

public class SortArray {
	
	
	public int[] bubbler(int[] arri){
				int temp;
		int changes=0;
		while(true) {
		   for(int i=0;i<arri.length-1; i++) {
			   temp=arri[i];
			if(arri[i+1]<temp) {
				arri[i]=arri[i+1];
				arri[i+1]=temp;	
				changes+=1;
				}
			}
		   if(changes>0) {
			   changes=0;
			   
		   }else {
			   break;
		   }		   
			//while end
		}
	
			return arri;
	
	}
	
	
	public static void main(String[] args) {
		int[] arr3 = {12,45,5,23,78,76,1,567,8,2,90,0};	
		SortArray bs= new SortArray();
		String presult=Arrays.toString(bs.bubbler(arr3));
		System.out.println(presult);
	}

}
