
public class StringChar {
public static void main(String args[]) {
	String str="Hello my dear friend";
	char k='f';
	int flag=0;
	char arr1[]=str.toCharArray();
	for(char x:arr1) {
		if (k==x) {
			flag=1;
			break;
		}
		
	}
	if(flag==1) {
	
	System.out.println("character found");
	}else {
		System.out.println("Character not found");
	}
}}
