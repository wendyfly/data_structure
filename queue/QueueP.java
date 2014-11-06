class Queue{
	//array in sorted order, from max at size-1 to min at 0
	 int max;
	  long[] queueArray;
	 int nItems;
	
	public Queue(int n){
		max=n;
		queueArray= new long[max];
		nItems=0;
	}
	
	public void insert(long item){
		int i;
		if(nItems==0){
			queueArray[0]=item;
			nItems++;
		}else{
			for(i=nItems-1;i>=0;i--){
				if(item<queueArray[i]){
					queueArray[i+1]=queueArray[i];
				}
				if(item>=queueArray[i]){
					break;
				}
			}
			queueArray[i+1]=item;
			nItems++;
		}
	}
	
	public  void display(){
		for(int i=0; i<nItems; i++){
			System.out.print(queueArray[i]+" ");
		}
	}
	
	public long remove(){  // remove the min
		return queueArray[--nItems];
	}
	
	
}

class QueueP
{
	public static void main(String[] args){
		Queue q=new Queue(10);
		q.insert(3);
		q.insert(6);
		q.insert(1);
		q.insert(7);
		q.display();
		
	}
}