class  Queens{
	int numQueens;
	int[][] board;
	public Queens(){
		numQueens=0;
		board=new int[4][4];
		for (int i=0;i<4 ;i++ )
		{
			for (int j=0;j<4 ;j++ )
			{
				board[i][j]=0;
			}
		}
	}
   public boolean chessCriteria(int x,int y)
   {
	   for(int i=0;i<4;i++){
		   if(get(x,i)==1)
			   return false;
		   if(get(i,y)==1)
			   return false;
			   
	   }
	   for(int i=0;i<4;i++){
		   if(get(x-i,y-i)==1)
			   return false;
		   if(get(x-i,y+i)==1)
			   return false;
		   if(get(x+i,y-i)==1)
			   return false;
		   if(get(x+i,y+i)==1)
			   return false;
	   }
	   
	   return true;
	   
   }
   
   public void placeQueen(int x, int y, int type){
	   if(type==0){
		   board[x][y]=1;
	   }
	   if(type==1){
		   board[x][y]=0;
	   }
	   
   }
	public int get(int i, int j){
		if (i<0||j<0||i>3||j>3)
		{
			//System.out.println("out of array");
			return -3;
		}else {
			return (board[i][j]);
		}
	}

	public void display(){
		for(int i=0;i<4;i++){
			for (int j=0;j<4 ;j++ )
			{
				System.out.print(board[i][j]+" ");
			}
		System.out.println();
		}
	}


	public void start(){
		solve(0);
		System.out.println(count);
	}
	int count=0;
	public boolean solve(int numQueens){
		if(numQueens==4){
			display();
			count++;
			
			return true;
		}else{
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
				{
					if(chessCriteria(i,j)){
						placeQueen(i,j,0);
						numQueens++;
					
						solve(numQueens);  // recursion happens in side the judge criteria
							//return true;
						
							placeQueen(i,j,1);
							numQueens--;// we don't need to return !
						
					
					
					}
				}
			
		}
			
	return false;	
	}
}
	
public class main{

	public static void main(String[] args){
	 Queens eight= new Queens();
	 eight.start();
	 //eight.display();
	
	}


}