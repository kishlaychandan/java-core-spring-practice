import java.util.Scanner;
public class ArrayCopy {
	public static void main(String args[]) {
		System.out.println("Enter length of first array");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		 int arr1[]= new int[n];
		 
		 System.out.println("Enter elements of first array");
		 for(int i=0;i<arr1.length;i++) {
			 arr1[i]=sc.nextInt();
		 }



		 int arr2[]=new int[arr1.length];
		 
		 for(int i=0;i<=arr1.length-1;i++) {
			 arr2[i]=arr1[i];
		 }
		 
		 for(int i=0;i<=arr1.length-1;i++) {
			 System.out.print(arr2[i]+" ");
		 }
				 
	}
}
