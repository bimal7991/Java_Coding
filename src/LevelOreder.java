
import java.io.*;
import java.util.*;
public class LevelOreder {
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
	             
	         // If the right child is not null
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
	    	
         ArrayList<ArrayList<Integer>> res=lavelOrder(root);    	
         for (int i = 0; i < res.size (); i++)
             System.out.print (res.get (i) + " ");
         System.out.print("\n");
         
         ArrayList<Integer> post=postOrder(root);
         for (int i = 0; i < post.size(); i++)
             System.out.print (post.get(i) + " ");
         System.out.print("\n");
         
	    	ArrayList<Integer> adjList[]=getAdjLis(root);
         for (int i = 0; i < adjList.length; i++)
        	 if(!adjList[i].isEmpty())
             System.out.print (i+" ->"+adjList[i] + " ");
         System.out.print("\n");
         
         t--;
 }
}
	private static ArrayList<Integer>[] getAdjLis(Node root) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list[]=new ArrayList[100001];
		for(int i=0;i<100001;i++)
		{
			list[i]=new ArrayList<Integer>();
		}
		
		Queue<Node> q=new LinkedList<Node>();
		 q.add(root);
		 
		 while(!q.isEmpty()) {
			 int num=q.size();
			// ArrayList<Integer> sub=new ArrayList<Integer>();
			 for(int i=0;i<num;i++) {
				 Node n1=q.poll();
				
				 if(n1.left!=null) {
					 list[n1.data].add(n1.left.data);
					 list[n1.left.data].add(n1.data);
					 q.add(n1.left);
				 }
				 if(n1.right!=null) {
					 list[n1.data].add(n1.right.data);
					 list[n1.right.data].add(n1.data);
					 q.add(n1.right);
				 }
			 }
			 
		 }
		
		return list;
	}
	private static ArrayList<Integer> postOrder(Node root) {
		// TODO Auto-generated method stub
		ArrayList<Integer> post=new ArrayList<Integer>();
		Stack<Node> st=new Stack<Node>();
		st.push(root);
		while(!st.isEmpty()) {
			Node n1=st.pop();
			post.add(n1.data);
			if(n1.left!=null) {
				st.push(n1.left);
			}
			if(n1.right!=null) {
				st.push(n1.right);
			}
		}		
		Collections.reverse(post);
		return post;
	}
	private static ArrayList<ArrayList<Integer>> lavelOrder(Node root) {
		// TODO Auto-generated method stub
		 ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
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
			 ans.add(sub);
		 }
		return ans;
	}
	
}





    
