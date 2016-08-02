import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_FunnyString {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
    	for (int i = 0; i<input; i++) {
    		char[] charArr = br.readLine().toCharArray();
    		int l = charArr.length;
    		int j = 0;
    		boolean funny = true;
    		while(funny) {
    			if (j >= (l-1)/2) {
    				break;
    			}
    			if (Math.abs(charArr[j] - charArr[j+1]) == Math.abs(charArr[l-j-1] - charArr[l-j-2])) {
    				j++;
    			} else {
    				funny = false;
    			}
    		}
    		if (funny) {
    			System.out.println("Funny");
    		} else {
    			System.out.println("Not Funny");
    		}
    	}


	}

	private static boolean verifyFunny(String str) {
		if (str.length() == 0 || str == null) {
			return true;
		}
		
		char[] charArr = str.toCharArray();
		int[] result = new int[charArr.length];
		for(int i=1; i<charArr.length; i++) {
			result[i] = (int) charArr[i] - (int)charArr[i-1]; 
		}
		
		for (int i=1; i<=result.length-1; i++) {
			if (result[i] != result[result.length-i]) {
				return false;
			}
		}
		return true;
	}

}
