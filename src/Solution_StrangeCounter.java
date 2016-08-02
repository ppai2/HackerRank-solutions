import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution_StrangeCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int initial = 3; 
		int start = initial;
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for (int i=1; i<=n; i++) {
			if (!(map1.containsKey(i))) {
				map1.put(i, initial);
				initial--;
			}
			
		}
		System.out.println(map1);
		System.out.println("Output of n is: " + map1.get(n));
	}

}
