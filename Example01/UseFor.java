import java.util.*;

public class UseFor {
	public static void main(String[] args) throws Exception {
		List<String> words = new ArrayList<String>();
		Collections.addAll(words, "Hello", "Japan", "U", "S", "N", "W");
		for(int i=0; i<words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
}
