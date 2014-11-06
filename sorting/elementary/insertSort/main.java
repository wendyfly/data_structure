class main
{
	public static void insertSort(int[] a){
		int in, out;//out to record the comparing variable, the left side is ordered, the right side is out of order
		for(out=1;out<a.length;out++){
			int temp=a[out];//take out the comparing element and leave a moving space
			in=out;
			while(in>0&&a[in-1]>temp){
				a[in]=a[in-1];//elemnt moving to right
				in--;
			}
			a[in]=temp;
		}
	}

	public static void display(int[] a){
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] test={3,2,1,4};	
		insertSort(test);
		display(test);
	}
}
