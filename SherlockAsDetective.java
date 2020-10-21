/*package whatever //do not write package name here */

//Abhijit Karmakar

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N =sc.nextInt();
		    int arr[] = new int[N];
		    
		    for(int i=0;i<N;i++){
		        arr[i] = sc.nextInt();
		    }
		    ArrayList<Integer> ar = new ArrayList<Integer>();
		    for(int i=0;i<N;i++){
		        
		        ar.add(arr[i]);
		        
		        
		      
		        
		    }
		    for(int j=1;j<ar.size()+1;j++){
		        if(ar.contains(j)){
		            continue;
		        }
		        else{
		            System.out.print(j+" ");
		        }
		        }
		        
		        System.out.println();
		        
		    
		    
		    
		    T--;
		}
	}
}
