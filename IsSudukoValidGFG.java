/*package whatever //do not write package name here */

/*Abhijit Karmakar*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		while(T>0){
		    int mat [][] = new int[9][9];
		    
		    for(int i =0;i<9;i++){
		        for(int j =0;j<9;j++){
		            mat[i][j] = sc.nextInt();
		    }
		    }
		    ArrayList<Integer> ar = new ArrayList<Integer>();
		    Set<Integer> hash_Set = new HashSet<Integer>();
		    boolean flag = false;
		     for(int i =0;i<9;i++){
		        for(int j =0;j<9;j++){
		            if(mat[i][j]!=0){
		           ar.add(mat[i][j]);
		           hash_Set.add(mat[i][j]);
		            }
		           
		           
		           
		    }
		     if(ar.size() == hash_Set.size()){
		         flag = true;
		               System.out.print(1);
		               break;
		           }
		          else{
		              
		              continue;
		          }
		      
		    
		    }
		    if(flag == false){
		         System.out.print(0);
		    }
		    System.out.println();
		    T--;
		}
	}
}
