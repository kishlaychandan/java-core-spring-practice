import java.util.Scanner;
public class ReverseCopy {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of arr1 : ");
		int arr1[]=new int[sc.nextInt()];
		for (int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Arra1 is");
		for (int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		int arr2[]=ReverseCopy1.copy(arr1);
		System.out.println("Array 2 is : ");
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
}
