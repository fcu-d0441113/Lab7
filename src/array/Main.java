package array;

public class Main {

	public static void main(String[] args) {
		// primitive type array
		int[] nArray = new int[5];

		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i]);
		}

		// class type array
		String[] sArray = new String[5];

		for (int i = 0; i < sArray.length; i++) {
			sArray[i]=String.valueOf(i);
			System.out.println(sArray[i].length());
		}

	}

}
