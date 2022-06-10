package GraphOrTree;
import java.io.*;
import java.util.*;
public class PreorderInorderPostorder {
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
	    	Tree g = new Tree();
         ArrayList<Integer> res = g.postOrder(root);
         for (int i = 0; i < res.size (); i++)
             System.out.print (res.get (i) + " ");
         System.out.print("\n");
         t--;
 }
}
}
class Pair{
    Node n;
    int state;
    Pair(Node n, int state){
        this.n=n;
        this.state=state;
    }
}
class Tree {
   public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> pre=new ArrayList<Integer>();
        ArrayList<Integer> in=new ArrayList<Integer>();
        ArrayList<Integer> post=new ArrayList<Integer>();
        Stack<Pair> st=new Stack<Pair>();
        
        Pair p=new Pair(root,1);
        st.add(p);
        while(!st.isEmpty()){
         Pair temp=st.peek();
         if(temp.state==1){
             temp.state++;
             pre.add(temp.n.data);
             if(temp.n.left!=null){
                 st.push(new Pair(temp.n.left,1));
             }
         }
         else if(temp.state==2){
             temp.state++;
             in.add(temp.n.data);
             if(temp.n.right!=null){
                 st.push(new Pair(temp.n.right,1));
             }
             
         }else{
             post.add(temp.n.data);
             st.pop();
         }

        }
        return post;
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    /*
     * 
     * create a tree by using inorder and preorder
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return createTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,hm);
        
    }
	private static Node createTree(int[] inorder, int instart, int inend, int[] preorder, int prestart, int preend,
			HashMap<Integer, Integer> hm) {
		// TODO Auto-generated method stub
		if(instart>=inend || prestart>=preend) {
			return null;
		}
		
		Node root=new Node(preorder[prestart]);
		
		int inroot=hm.get(root.data);
		int numleft=inroot-instart;
		
		root.left=createTree(inorder, instart, inroot-1, preorder, prestart+1, prestart+numleft, hm);
		root.right=createTree(inorder, inroot+1, inend, preorder, prestart+numleft+1, preend, hm);
		
		return root;
	}*/
}



    
