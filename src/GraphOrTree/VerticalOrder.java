package GraphOrTree;
import java.io.*;
import java.util.*;
public class  VerticalOrder {
	static Node buildTree(String str){
	     
	     if(str.length()==0 || str.charAt(0)=='N'){
	         return null;
	     }
	     String ip[] = str.split(" ");
	     // Create the root of the tree
	     Node root = new Node(Integer.parseInt(ip[0]));
	     // Push the root to the queue	     
	     Queue<Node> queue = new LinkedList<>(); 
	     
	     queue.add(root);
	     // Starting from the second element
	     int i = 1;
	     while(queue.size()>0 && i < ip.length) {
	         
	         // Get and remove the front of the queue
	         Node currNode = queue.peek();
	         queue.remove();
	             
	         // Get the current node's value from the string
	         String currVal = ip[i];
	             
	         // If the left child is not null
	         if(!currVal.equals("N")) {
	                 
	             // Create the left child for the current node
	             currNode.left = new Node(Integer.parseInt(currVal));
	             // Push it to the queue
	             queue.add(currNode.left);
	         }
	             
	         // For the right child
	         i++;
	         if(i >= ip.length)
	             break;
	             
	         currVal = ip[i];
	             
	         // If the right child is not nullLevelOreder.javaLevelOreder.java
	         if(!currVal.equals("N")) {  
	             // Create the right child for the current node
	             currNode.right = new Node(Integer.parseInt(currVal));   
	             // Push it to the queue
	             queue.add(currNode.right);
	         }
	         i++;
	     }
	     return root;
}
	public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
	    	Node root = buildTree(s);
	    	
	    	List<List<Integer>> res=vertical(root);	
	    	
	       System.out.print("Vertical order \n");
           for (int i = 0; i < res.size (); i++)
             System.out.print (res.get (i) + " ");
           System.out.print("\n");
          
           System.out.print("Top View \n");
           
           ArrayList<Integer> top=topView(root);
           for (int i = 0; i < top.size (); i++)
               System.out.print (top.get (i) + " ");
           System.out.print("\n");
           
           
           System.out.print("Bottom View \n");
           ArrayList<Integer> bottom=bottomView(root);
           for (int i = 0; i < bottom.size (); i++)
               System.out.print (bottom.get (i) + " ");
           System.out.print("\n");
           
         t--;
    }
  }
	private static ArrayList<Integer> rightview(Node root) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> ans=new ArrayList<Integer>();
		 Queue<Node> q=new LinkedList<Node>();
		 q.add(root);
		 
		 while(!q.isEmpty()) {
			 int num=q.size();
			 ArrayList<Integer> sub=new ArrayList<Integer>();
			 for(int i=0;i<num;i++) {
				 Node n1=q.poll();
				 sub.add(n1.data);
				 if(n1.left!=null) {
					 q.add(n1.left);
				 }
				 if(n1.right!=null) {
					 q.add(n1.right);
				 }
			 }
			 ans.add(sub.get(sub.size()-1));
		 }
		return ans;
	}
	
	private static ArrayList<Integer> bottomView(Node root) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans=new ArrayList<Integer>();
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		Queue<Top> q=new LinkedList<Top>();
		q.add(new Top(0,root));
		
		while(!q.isEmpty()) {
		   Top t=q.poll();
		   if(t.node.left!=null) {
			   q.add( new Top(t.p-1,t.node.left));
		   }
		   if(t.node.right!=null) {
			   q.add(new Top(t.p+1,t.node.right));
		   }
		   
		  
			   map.put(t.p, t.node.data);
		   
		}
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			ans.add(m.getValue());
		}
		
		return ans;
	}
	
	
	private static ArrayList<Integer> topView(Node root) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans=new ArrayList<Integer>();
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		Queue<Top> q=new LinkedList<Top>();
		q.add(new Top(0,root));
		
		while(!q.isEmpty()) {
		   Top t=q.poll();
		   if(t.node.left!=null) {
			   q.add( new Top(t.p-1,t.node.left));
		   }
		   if(t.node.right!=null) {
			   q.add(new Top(t.p+1,t.node.right));
		   }
		   
		   if(!map.containsKey(t.p)) {
			   map.put(t.p, t.node.data);
		   }
		}
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			ans.add(m.getValue());
		}
		
		
		
		return ans;
	}
	
	

	private static List<List<Integer>> vertical(Node root) {
		// TODO Auto-generated method stub
		Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> hm=new TreeMap<>();
		Queue<Vertical> q=new LinkedList<Vertical>();
		q.add(new Vertical(0,0,root));		
		while(!q.isEmpty()) {
			Vertical v=q.poll();
			if(v.node.left!=null) {
				q.add(new Vertical(v.vertical-1,v.level+1,v.node.left));
			}
			if(v.node.right!=null) {
				q.add(new Vertical(v.vertical+1,v.level+1,v.node.right));
			}
			if(!hm.containsKey(v.vertical)) {
				TreeMap<Integer, PriorityQueue<Integer>> t=new TreeMap<>();
				hm.put(v.vertical,t);
			}
			if(!hm.get(v.vertical).containsKey(v.level)) {
				hm.get(v.vertical).put(v.level, new PriorityQueue<>());
			}
			hm.get(v.vertical).get(v.level).add(v.node.data);
			
		}
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		for(Map.Entry<Integer, TreeMap<Integer, PriorityQueue<Integer>>> m : hm.entrySet()) {
			//System.out.println(m.getKey() +" "+m.getValue());
			        List<Integer> lis=new ArrayList<Integer>();
					for(Map.Entry<Integer, PriorityQueue<Integer>> level:m.getValue().entrySet()) {
						 Queue<Integer> sub=level.getValue();
						while(!sub.isEmpty()) {
							lis.add(sub.poll());
						}
					
					}
					ans.add(lis);
		}
		return ans;
	}
}
class Vertical{
	int vertical;
	int level;
	
	Node node;
	public Vertical(int p,int q,Node node) {
		this.vertical=p;
		this.level=q;
		this.node=node;
	}
	public Vertical(){
		
	}
}
class Top{
	int p;
	Node node;
	public Top(int _p,Node _n) {
		p=_p;
		node=_n;
	}
	public Top() {
		
	}
	
}




    
