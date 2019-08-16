package kjs.d2.sw1928;

public class Base64Decoder {
	public static void main(String[] args) {
		char c = 'A';
		int ci = c;
		String str = "A";
		byte[] b = str.getBytes();
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}
}