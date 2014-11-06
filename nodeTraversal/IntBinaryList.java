import java.util.Queue;
import java.util.ArrayDeque;
import java.util.*;
public class IntBinaryList{
	IntBinaryNode root;
	public IntBinaryList(){
		root=null;
	}
	public static IntBinaryNode search(IntBinaryNode p, int el){
	 while(p!=null){	// note, we use while, since if cannot forever loop
		if(p.key==el){
			System.out.println("Find the node");
			return p;
		}else{
			if(p.key<el){
				p=p.right;
			}else{
				p=p.left;
			}
			
		}
		
	}
	 
	 System.out.println("Cannot find node");
	 return null;
   }
	
	public static void breadthFirst(IntBinaryNode input){
		IntBinaryNode p=input;
		Queue<IntBinaryNode> queue=new ArrayDeque<IntBinaryNode>();  
		if(p!=null){
			queue.add(p);
			while(!queue.isEmpty()){
				p= queue.remove();
				System.out.print(p.key+" ");
				if(p.left!=null)
					queue.add(p.left);
				if(p.right!=null)
					queue.add(p.right);
			}
		}
		
	}
	
	public static void preorder(IntBinaryNode p){
		if(p!=null){
			System.out.print(p.key+" ");
			preorder(p.left);
			preorder(p.right);
		}
	}
	
	public static void iterpreorder(IntBinaryNode p){
		
		Stack<IntBinaryNode> travStack =new Stack<IntBinaryNode>();
		if(p!=null){
			travStack.push(p);
			}
			while(!travStack.isEmpty()){
			IntBinaryNode s=(IntBinaryNode) travStack.pop();
				System.out.print(s.key+" ");
				
				if(s.right!=null){
					
					travStack.push(s.right);// using stack, first in , last out. note the s, if we use s=s.right, it will effect the s.right result
				}
				if(s.left!=null){
					
					travStack.push(s.left);
				}
				
			}
			
		
		
	}
	public static void inorder(IntBinaryNode p){
		if(p!=null){
			inorder(p.left);
			System.out.print(p.key+" ");
			inorder(p.right);
		}
	}
	
	
	
	public static void iterinorder(IntBinaryNode p){
		Stack<IntBinaryNode> travStack =new Stack<IntBinaryNode>();
		// now we start processing the tree
		// we also need a current focus to know where we are 
		IntBinaryNode current= p;
		// the criteria to decide when we stop the loop is when current points to null and no nodes in stack
		while(current!=null||!travStack.isEmpty()){
			//fristly, if current is not null, we push current to stack and shift focus to its left sub-tree
			if(current!=null){
				travStack.push(current);
				current=current.left;
			}
			else//we need pop out nodes from the stack and at that time we shift focus to its right sub-tree
			{
				current=travStack.pop();
				System.out.print(current.key+" ");
				current=current.right;
			}	
		}
	}
	
	public static void postorder(IntBinaryNode p){
		if(p!=null){
			postorder(p.left);
			postorder(p.right);
			System.out.print(p.key+" ");
			
		}
	}                                                                                                                                                                                                         
	
	

	
	public static void iterpostorder(IntBinaryNode p){
	// we need two support data structure /variables
	//1. a stack to store the pointers of each traversed tree node
	//2. a previous tree node pointer to know where we were
		Stack<IntBinaryNode> travStack= new Stack<IntBinaryNode>();
		IntBinaryNode previous=null;
	//firstly, we add the current root to stack for processing
		travStack.push(p);
	// define the key loop
		while(!travStack.isEmpty()){
			IntBinaryNode current = travStack.peek();
			//firstly, make sure it is not a null
			if(current==null)
				travStack.pop();
			//now check if it is leaf node to be printed
			else if (current.left==null&&current.right==null){
				System.out.print(current.key+" ");
				travStack.pop();
				previous=current;
			}
			//3rd, check if previous pointer is our left child, if so, we need push right child for process
			else if(current.left==previous){
				travStack.push(current.right);
				previous=current;
			}
			//4th,if previous pointer is current pointer'r right child, print itself;
			else if(current.right==previous){
				System.out.print(current.key+" ");
				travStack.pop();
				previous=current;
			}
			// otherwise push left child to stack
			else{
				travStack.push(current.left);
				previous=current;
			}
		}	
	}
	
	public static void insert(int el,IntBinaryNode p){
		if (p==null)
			p=new IntBinaryNode(el);
		else{
		IntBinaryNode prev=null;
		while(p!=null){
			prev=p;// use prev to record insert location
			if(p.key<el)
				p=p.right;
			else p=p.left;
		}
		
	   if (prev.key<el)
			prev.right=new IntBinaryNode(el);
		else
			prev.left=new IntBinaryNode(el);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args){
		IntBinaryNode p4= new IntBinaryNode(1);
		IntBinaryNode p5= new IntBinaryNode(4);
		IntBinaryNode p6= new IntBinaryNode(6);
		IntBinaryNode p7= new IntBinaryNode(8);
		IntBinaryNode p2= new IntBinaryNode(3,p4,p5);
		IntBinaryNode p3= new IntBinaryNode(7,p6,p7);
		IntBinaryNode p1= new IntBinaryNode(5,p2,p3);
		//search(p1,3);
		//breadthFirst(p1);
		//preorder(p1);
		//inorder(p1);
		//postorder(p1);
		//iterpreorder(p1);
		//iterinorder(p1);
		//iterpostorder(p1);
		insert(9,p1);
		preorder(p1);
	}
}   