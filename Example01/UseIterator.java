import java.util.*;

public class UseIterator {
	public static void main(String[] args) throws Exception {
		List<String> words = new ArrayList<String>();
		Collections.addAll(words, "Hello", "Japan", "U", "S", "N", "W");
		Iterator it = words.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
