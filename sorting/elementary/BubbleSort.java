class BubbleSort
{
	public static void bubbleSort(int[] a){
		for(int i=1;i<=a.length;i++){  // define how many times we do the bubble array
			for(int j=0;j<a.length-i;j++) // start from element 0; the crucial part is end condition: not length-1; because in that condition j+1 out of array. actually, every time finish one bubble pass, we compare one less element
				if(a[j]>a[j+1])
					swap(j,j+1,a);
		}		
	
	}	
	public static void swap(int x,int y, int[] a){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	
	public static void display(int[] b){
		for (int i=0;i<b.length ;i++ )
		{
			System.out.print(b[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] input={2,1,5,3};
		bubbleSort(input);
		display(input);
	}
}