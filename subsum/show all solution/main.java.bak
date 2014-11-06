class SubSum{
	
	public static void subSum(int n, int[] input, int goal,int[] solution){
		if(goal==0){
			System.out.println("Done");
			for(int i=0;i<5;i++){
				System.out.print(solution[i]+" ");
				
			}
			System.out.println();
			return;
			
		}else if (goal<0||n>input.length-1){
			return;
		}else if(goal>0){
			solution[n]=1;
			subSum(n+1,input,goal-input[n],solution);
			solution[n]=0;
			subSum(n+1,input,goal,solution);
			//solution[n]=-1;
		}
	
	}
}
public class main{
	public static void main(String[] args){
		SubSum n= new SubSum();
		int[] input={1,2,3,4,5};
		int goal=5;
		int[] solution={0,0,0,0,0};
		n.subSum(0, input, goal,solution);
		
	}
	
}