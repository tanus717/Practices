package CodingDemo;
public class PreservingString {
	public static void main(String[] args) {
		String s = "this is a job";
		char[] ch = s.toCharArray();
		char[] result = new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				result[i] = ' ';
			}
		}
		int a = result.length - 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				if (result[a] == ' ') {
					a--;
				}
				result[a] = ch[i];
				a--;
			}
		}
  System.out.println(String.valueOf(result));
	}
}
