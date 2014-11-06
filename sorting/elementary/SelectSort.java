class SelectSort 
{
	public static void selectSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j])
				min=j;
				}
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			
			
			
		}
	}

	public static void display(int[] b){
		for (int i=0;i<b.length ;i++ )
		{
			System.out.print(b[i]+" ");
		}
	}

	public static void swap(int x, int y, int[] a){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	public static void main(String[] args) 
	{
		int[] input={2,1,5,3};
		selectSort(input);
		display(input);
	}
}
