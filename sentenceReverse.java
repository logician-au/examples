public class sentenceReverse {
	
	public static String reverse(String str) {
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = strArr.length-1; i>=0; i--) {
			String spacer = i == 0 ? "" : " ";
			sb.append(strArr[i] + spacer);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String sentence = "Two numbers are one and two";
		System.out.println("|" + sentenceReverse.reverse(sentence) + "|");
	}
}
