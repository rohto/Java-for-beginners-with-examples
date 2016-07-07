import java.util.*;

public class UseEnhancedFor {
	public static void main(String[] args) throws Exception {
		List<String> words = new ArrayList<String>();
		Collections.addAll(words, "Hello", "Japan", "U", "S", "N", "W");
		for(String word: words) {
			System.out.println(word);
		}
	}
}
