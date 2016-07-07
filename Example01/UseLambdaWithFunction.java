import java.util.*;

public class UseLambdaWithFunction {
	public static void main(String[] args) throws Exception {
		List<String> words = new ArrayList<String>();
		Collections.addAll(words, "Hello", "Japan", "U", "S", "N", "W");
		words.forEach(x -> println(x));
	}
	static void println(String str) {
		System.out.println(str);
	}
}
