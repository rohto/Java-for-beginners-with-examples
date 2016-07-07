import java.util.*;

public class UseLambda {
	public static void main(String[] args) throws Exception {
		List<String> words = new ArrayList<String>();
		Collections.addAll(words, "Hello", "Japan", "U", "S", "N", "W");
		words.forEach(word -> {
			System.out.println(word);
		});
	}
}
