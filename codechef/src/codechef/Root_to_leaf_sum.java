package codechef;

import java.util.Stack;

class Node{
	int data;
	Node left,right;
	
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
	
}

public class Root_to_leaf_sum {
	 Node root;
	 
	 boolean haspath(Node node,int sum) {
		 if(node==null) {
			return sum==0;
		 }
		return haspath(node.left, sum-node.data) || haspath(node.right, sum-node.data) ;
			
		 
		 
		
	 }
	 Node prev=null;
	 
	 void preOrder(Node node)
	 {
		 if(node==null)
			 return;
		 Stack<Node> s1=new Stack<>();
		 s1.push(node);
		 while(!s1.isEmpty())
		 {
			 node=s1.pop();
			 System.out.print(node.data+" ");
			 if(node.right!=null)
				 s1.push(node.right);
			 if(node.left!=null)
				 s1.push(node.left);
		 }
		 System.out.println();
		 
	 }
	 
	 void postOrder(Node node)
	 {
		 Stack<Node> s1=new Stack<>();
		 Stack<Node> s2=new Stack<>();
		 
		 if(node==null)
			 return;
		 
		 s1.push(node);
		 while(!s1.isEmpty())
		 {
			 node=s1.pop();
			 s2.push(node);
			 
			 if(node.left!=null)
				 s1.push(node.left);
			 if(node.right!=null)
				 s2.push(node.right);
			 
			 
			 
			 
		 }
		 
		 while(!s2.isEmpty())
		 {
			 Node n=s2.pop();
			 System.out.println(n.data+" ");
			 
		 }
		 
		 
	 }
	 
	 boolean isbst(Node node)
	 {
		 if(node!=null)
		 {
		 if(!isbst(node.left))
			 return false;
		 
		 if(prev!=null && node.data<prev.data)
			 return false;
		 prev=node;
		 
		return isbst(node.right);
		 }
		 
		 
		 return true;
	 }
	 
	 
	public static void main(String[] args) {
		
		Root_to_leaf_sum tree=new Root_to_leaf_sum();
		tree.root=new Node(4);
		tree.root.left = new Node(2); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(3); 
       // tree.root.right.left = new Node(2); 
        int sum=24;
        tree.postOrder(tree.root);
        tree.preOrder(tree.root);
        if(tree.haspath(tree.root,sum))
        {
        	System.out.println("YES");
        }
        else
        {
        	System.out.println("NO");
        }
        
        if(tree.isbst(tree.root))
        {
            System.out.println("BST");	
        }
        else
        {
        	System.out.println("NOT BST");
        }
        
	}
	

}

