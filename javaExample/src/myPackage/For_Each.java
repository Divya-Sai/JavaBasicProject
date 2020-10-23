package myPackage;

public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value = new int[] {234,567,678};
		
		//Method 1
		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]);
		}
		
		//Method 2
		for(int i:value) {
			System.out.println(i);
		}
	}

}
