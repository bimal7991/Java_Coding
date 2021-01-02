package LeetCode;
import java.util.*;
public class Event_leetcode {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int events[][]=new int[n][2];
	for(int i=0;i<n;i++)
	{
		events[i][0]=sc.nextInt();
		events[i][1]=sc.nextInt();
		
	}
	  int evtTotal = 0;
	  
	  Arrays.sort(events, new Comparator<int[]>(){
          public int compare(int[] a, int[] b){
              if(a[1] == b[1]){
                  return a[0] - b[0];
              }
              
              return a[1]-b[1];  
          }
    });
	  
	  for(int i=0;i<n;i++)
		{
			System.out.println(events[i][0]+" "+events[i][1]);
			
		}
	  
	  int max=Integer.MIN_VALUE;
	  int min=Integer.MAX_VALUE;
	  for(int ele[]:events)
	  {
		  min=Math.min(min, ele[0]);
		  max=Math.max(max, ele[1]);
	  }
	  
	  
	  TreeSet<Integer>  attend=new TreeSet<Integer>();
	  
	  for(int i=min;i<=max;i++)
		  attend.add(i);
	  
	  int count=0;
	  for(int ele[]:events)
	  {
		  int start=ele[0];
		  Integer pos=attend.ceiling(start);
		  
		  if(pos!=null && pos<=ele[1])
		  {
			  count++;
			  attend.remove(pos);
		  }
		  
	  }
	  System.out.println(count);
	  
	  
	 // Arrays.sort(events, (a,b) -> Integer.compare(a[1],b[1]));   sort according second value;
	  
	  
	  
	  
	  
	  
//	  Set<Integer> available = new HashSet<>();
//
//      for(int[] evt : events){
//          for(int i=evt[0]; i<=evt[1]; i++){                
//              if(available.add(i)){
//                  evtTotal+=1;
//                  break;
//              }
//          }
//      } 
//      System.out.println(evtTotal);
//	
	
}
   
}
