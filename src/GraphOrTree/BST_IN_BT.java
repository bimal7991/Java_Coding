package GraphOrTree;
import java.io.*;
import java.util.*;
public class BST_IN_BT {
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
	       int ans=largestBst(root);
         t--;
     }
  }
	static int largestBst(Node root)
    {
        // Write your code here
        
        int ans=largest(root).size;
        
		return ans;
        
    }
	static NodeValue largest(Node root ) {
		if(root==null) {
			return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE, 0);
		}
		
		NodeValue left=largest(root.left);
		NodeValue right=largest(root.right);
		
		if(root.data>left.max && root.data<right.min) {
			
			return new  NodeValue(Math.min(root.data, left.min),
					Math.max(root.data, right.max),
					left.size+right.size+1);
		}
		else {
			return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.size, right.size));
		}
		
	
	}
	
}
class NodeValue{
	int min,max,size;
	public NodeValue() {
		
	}
	NodeValue(int min,int max,int size){
		this.min=min;
		this.max=max;
		this.size=size;
	}
	
}





    
