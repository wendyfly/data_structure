class IntBinaryNode 
{
	int key;
	IntBinaryNode left, right;
	public IntBinaryNode(){
		left=right=null;
	}
	public IntBinaryNode(int el){
		this.key=el;
		left=right=null;
	}
	public IntBinaryNode(int el, IntBinaryNode l,IntBinaryNode r){
		this.key=el;
		left=l;
		right=r;
		
}
