package GraphOrTree;
import java.io.*;
import java.util.*;
public class BoundaryTraversal {
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
	    	
         ArrayList<Integer> res=boundaryTraversal(root);	
         for (int i = 0; i < res.size (); i++)
             System.out.print (res.get (i) + " ");
         System.out.print("\n");
         
         
         
         t--;
    }
  }
	private static ArrayList<Integer> boundaryTraversal(Node root) {
		
		ArrayList<Integer> ans=new ArrayList<Integer>();
		
		if(!isLeaf(root)) {
			ans.add(root.data);
		}
		leftboundary(root,ans);
		addleaf(root,ans);
		
		rightBoundary(root,ans);
		
		// TODO Auto-generated method stub
		return ans;
	}
	private static void rightBoundary(Node root, ArrayList<Integer> ans) {
		// TODO Auto-generated method stub
		Node temp=root.right;
		ArrayList<Integer> sub=new ArrayList<Integer>();
		while(temp!=null) {		
       	 if(!isLeaf(temp)) {
       		 sub.add(temp.data);
       		 
       	 }
       	 if(temp.right!=null) {
       		 
       		temp=temp.right;	
       	 }
       	 else
       		temp=temp.left;
        }
		
		for(int i=sub.size()-1;i>=0;i--) {
			ans.add(sub.get(i));
		}
		
		
	}
	private static void addleaf(Node root, ArrayList<Integer> ans) {
		// TODO Auto-generated method stub
		if(isLeaf(root)) {
			ans.add(root.data);
			return ;
		}
		if(root.left!=null)
		addleaf(root.left, ans);
		if(root.right!=null)
	    addleaf(root.right, ans);
	    
	}
	private static void leftboundary(Node root, ArrayList<Integer> ans) {
		// TODO Auto-generated method stub
		Node temp=root.left;
         while(temp!=null) {		
        	 if(!isLeaf(temp)) {
        		 ans.add(temp.data);
        		 
        	 }
        	 if(temp.left!=null) {
        		 temp=temp.left;
        	 }
        	 else
        	   temp=temp.right;	 
         }
		
	}
	private static boolean isLeaf(Node root) {
		// TODO Auto-generated method stub
		return (root.left)==null && (root.right==null);
	}
	
}





    
