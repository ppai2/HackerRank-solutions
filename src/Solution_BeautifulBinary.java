import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_BeautifulBinary {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length");
        int input = Integer.parseInt(br.readLine());
        System.out.println("Enter the binary string");
        String bin = br.readLine();
        int result = verifyBeauty(input, bin);
        System.out.println(result);
	}

	private static int verifyBeauty(int input, String bin) {
		char[] charArr = bin.toCharArray();
		int count = 1;
		for (int i=0; i<= charArr.length-2; i++) {
			if (charArr[i] == 0) {
				if (charArr[i+1] == 1) {
					count += 1;
					return count;
				} 
			}
		}
		return count;
	}

}
