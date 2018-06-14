public class sentenceReverse {
	
	public static String reverse(String str) {
		String[] strArr = str.split(" ");
		String[] strArrRes = new String[strArr.length];
		for (int i = strArr.length - 1, j = 0; i >= 0; i--, j++)
			strArrRes[j] = strArr[i];
		return String.join(" ", strArrRes);
	}

	public static void main(String[] args) {
		String sentence = "Two numbers are one and two";
		System.out.println("|" + sentenceReverse.reverse(sentence) + "|");
		System.out.println(sentenceReverse.reverse(sentence).equals("two and one are numbers Two") ? "CORRECT" : "incorrect");
	}
}
