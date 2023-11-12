package string;

import java.util.Scanner;

public class Compress_the_String {

	public static String compress(String str) {

		if (str == null) {
			return null;
		}
		if (str.length() == 0) {
			return "";
		}
		int start = 0;
		int end = 0;
		String compressed = "";
		while (start < str.length()) {
			while ((end < str.length()) && (str.charAt(start) == str.charAt(end))) {
				end = end + 1;
			}
			int total = end - start;

			if (total != 1) {
				compressed += (str.charAt(start) + "" + total);
			} else {
				compressed += str.charAt(start);
			}
			start = end;
		}
		return compressed;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(compress(str));
	}

}
