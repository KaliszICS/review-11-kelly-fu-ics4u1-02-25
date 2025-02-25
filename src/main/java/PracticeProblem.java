public class PracticeProblem {

	public static void main(String args[]) {

	}
	//1
	public static int[] createIntArray(){
		int[] numArray;
		numArray = new int[5];
		for (int i = 0; i < 5; i++){
			numArray[i] = i + 1;
		}
		return numArray;
	}

	//2
	public static String[] createArray(String a, String b, String c, String d){
		String[] arr;
		arr = new String[]{a,b,c,d};
		return arr;
	}

	//3
	public static int findValue(int num, int[] arr1){
		for(int i = 0; i < arr1.length; i++){
			if (arr1[i] == num){
				return i;
			}
		}
		return -1;
	}


	//4
	public static int findThirdValue (String str, String[] arr2){
		int count;
		count = 0;
		for(int i = 0; i < arr2.length; i++){
			if (arr2[i].equals(str)){
			count++;
			if (count == 3){
				return i;
			}
		}
	}
		return -1;
	}

}
