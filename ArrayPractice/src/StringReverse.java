
public class StringReverse {
	public static void main(String args[]) {
 String str="Hello";
 System.out.println("Original string is: :"+str);
 char arr1[]=str.toCharArray();
 char arr2[]=new char[str.length()];
 int j=str.length()-1;
 
 for(int i=0;i<=str.length()-1;i++) {
	 arr2[j]=arr1[i];
	 j--;
 }
 
 str=new String(arr2);
 System.out.println("Reverse string is: :"+str);
 
 
}
}