class ReverseCopy1 {
	static int[] copy(int arr1[]) 
	{
		int arr2[]=new int[arr1.length];
		int j=arr2.length-1;
		for (int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		return arr2;
		
		
	}
}
