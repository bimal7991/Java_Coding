package codechef;

import java.io.*;
import java.util.*;


public class Cricket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
          //  int 5 = Integer.parseInt(br.readLine().trim());
            int[][] Strength = new int[N][5];
            for(int i_Strength=0; i_Strength<N; i_Strength++)
            {
            String[] arr_Strength = br.readLine().split(" ");
            for(int j_Strength=0; j_Strength<arr_Strength.length; j_Strength++)
            {
            Strength[i_Strength][j_Strength] = Integer.parseInt(arr_Strength[j_Strength]);
            }
            }

            int out_ = Tour_Winner(Strength);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static int Tour_Winner(int[][] Strength){
        // Write your code here
        int[] a = new int[Strength.length];
        int n=Strength.length;
        for(int i=0;i<n;i++)
        {
        	a[i]=i;
        }
        
        int k=0;
        while(n!=1)
        {
        	for(int i=0;i<n;i++)
        	{
        	   k=Winner(Strength, a[i], a[i++]);
        	   a[i-1]=k;
        	   
        	   
        	}
        	n=n/2;
        	
        }
        
		return a[n]+1;
   
    }
    
    static int Winner(int[][] Strength,int a1,int a2)
    {
    	int n=Strength.length;
    	int count=0;
    	
    		for(int j=0;j<5;j++)
    		{
    			if(Strength[a1][j]>=Strength[a2][j])
    				count++;
    		}
         if(count>=3)
        	 return a1;
         else
    	
		return a2;
    	
    }
    
}

