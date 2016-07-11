package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		char[] temp = new char[str.length()];
		int j=0;
//		System.out.println(str.length());
//		System.out.println(str.charAt(str.length()-1));
		for(int i=str.length(); i>0; i--){
			temp[j] = str.charAt(i-1);
			j++;
		}
		return temp;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		System.out.println(array);
	}
}
