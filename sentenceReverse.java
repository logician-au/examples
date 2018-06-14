import java.util.ArrayList;
import java.util.List;

public class sentenceReverse {

	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder();
		List<String> wordArray = new ArrayList<>();
		while (sb.length() > 0) {
			int firstSpace = sb.indexOf(" ");
			if (firstSpace > 0) {
				String word = sb.substring(0, firstSpace);
				wordArray.add(word);
				sb = new StringBuilder(sb.substring(firstSpace + 1));
			} else {
				wordArray.add(sb.toString());
				break;
			}
		}
		for (int i = wordArray.size() - 1; i >= 0; i--)
			sb2.append(wordArray.get(i) + " ");
		sb2 = new StringBuilder(sb2.substring(0,sb2.length()-1));
		return sb2.toString();
	}

	public static void main(String[] args) {
		String sentence = "Two numbers are one and two";
		System.out.println("|" + sentenceReverse.reverse(sentence) + "|");
	}
}
