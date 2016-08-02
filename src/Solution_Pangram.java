import java.io.*;
import java.util.*;

public class Solution_Pangram {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean result = verifyPangram(input);
        System.out.println(result);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

	private static boolean verifyPangram(String input) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		char[] charArr = str.toCharArray();
		for (char ch : charArr) {
			map1.put(ch, 0);
		}
		System.out.println(map1);
		
		char[] charInput = input.toLowerCase().toCharArray();
		for (char ch : charInput) {
			if (map1.containsKey(ch)) {
				map1.put(ch, map1.get(ch) + 1);
			} 
		}
		System.out.println(map1);
		
		if (map1.values().contains(0)) {
			return false;
		}
		return true;
	}
}