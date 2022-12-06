import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class UseBufferedReader{
	public static void main(String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String: ");
		String s = "";
		StringTokenizer tokenizer;
		while(!s.equals("quit")) {
			try {
				s = in.readLine();
				tokenizer = new StringTokenizer(s);
				int num = tokenizer.countTokens();
				System.out.println("There are " + num + " words in this line.");
				for(int i = 0; i < num; i ++) {
					String word = tokenizer.nextToken();
					System.out.println(word);
				}
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}