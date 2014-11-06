class MergeSort
{
	public static int[] mergeSort(int[] input){
		if(input.length<2){
			return input;
		}

		int mid=input.length/2;
		int[] left=new int[mid];
		int[] right; // Need to judge the number is odd or even
		if(input.length%2==0){
			right=new int[mid];
		}else{
			right=new int[mid+1];
		}
		int[] result=new int[input.length]; // to store the merge array
		
		for(int i=0;i<mid;i++){
			left[i]=input[i];
		}
		
		for(int j=0;j<right.length;j++){
			right[j]=input[mid+j];
		}
		

		left=mergeSort(left);
		right=mergeSort(right);
		result=merge(left,right);
		return result;
	}
	public static int[] merge(int[] left, int[] right){
		int resultLength=left.length+right.length;
		int[] result=new int [resultLength];
		int le=0;
		int ri=0;
		int reX=0;
		while(le<left.length||ri<right.length){
		 if(le<left.length&&ri<right.length){  // compare left array with right array
			if(left[le]<right[ri]){
				result[reX]=left[le];
				reX++;
				le++;
			}else{
				result[reX]=right[ri];
				reX++;
				ri++;
			}
		  }else if(le<left.length){// right array is empty, check the right array
			  result[reX]=left[le];
			  reX++;
			  le++;
		  }else if(ri<right.length){
			  result[reX]=right[ri];
				reX++;
				ri++;
		  }
		}
		return result; // note to return the result;
	}
	
	
	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args){
		int[] a={12,4,2,5,6};
		
		int[] b=mergeSort(a);
		display(b);
	}
}