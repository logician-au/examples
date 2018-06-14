public class sentenceReverse {
	
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, j = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.insert(0, ' ');
				j = 0;
			} else {
				sb.insert(j, str.charAt(i));
				j++;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String sentence = "Two numbers are one and two";
		System.out.println("|" + sentenceReverse.reverse(sentence) + "|");
	}
}
