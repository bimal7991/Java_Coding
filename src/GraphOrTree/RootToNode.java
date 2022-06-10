package GraphOrTree;
import java.io.*;
import java.util.*;
public class RootToNode {
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
	    	int target=Integer.parseInt(br.readLine());
         ArrayList<Integer> post=treePath(root,target);
         for (int i = 0; i < post.size(); i++)
             System.out.print (post.get(i) + " ");
         System.out.print("\n");
         
         System.out.println("Enter tow node value you want to find LCA ");
         int a=Integer.parseInt(br.readLine());
         int b=Integer.parseInt(br.readLine());
         
         Node node=LCA(root,a,b);
         
         System.out.println("LCA of "+a +" "+b+"- > "+ node!=null?node.data:-1 );
         
         
	    	
         
            t--;
         }
}
	
	
	private static Node LCA(Node root, int a, int b) {
		if(root==null || root.data==a || root.data==b) {
			return root;
		}
		
		Node left=LCA(root.left,a,b);
		Node right=LCA(root.right,a,b);
		
		if(right!=null && left!=null) {
			return root;
		}
		else if(left!=null && right==null) {
			return left;
		}
		else if(left==null && right!=null)
			return right;
		else
			return null;
		
	}
	private static ArrayList<Integer> treePath(Node root,int target) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(root==null) {
			return arr;
		}
		
		path(root,target,arr);
		
		return arr;
	}
	private static boolean path(Node root, int target, ArrayList<Integer> arr) {
		
		if(root==null)
			return false;
		
		arr.add(root.data);
		
		if(root.data==target) {
			return true;
		}
		
		boolean left=path(root.left,target,arr);
		boolean right=path(root.right,target,arr);
		
		if(right==false && left==false) {
			arr.remove(arr.size()-1);
		}
		return left || right;
	}
	
}
	





    
