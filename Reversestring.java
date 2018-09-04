package CodingDemo;

public class Reversestring {
	public static void main(String[] args) {
		String s = "this is a job";
		char[] r = reverse(s, s.toCharArray());
		System.out.println(r);
	}
	static char[] reverse(String s, char[] ch) {
		int startPosition = 0;
		int counter = 0;
		int length = ch.length - 1;
		
		while (counter <= length) {
			if (ch[counter] == ' ' || length == counter) {
				int begin = startPosition;
				int end;
				if (length == counter) {
					end = counter;
				} else
					end = counter - 1;
				char tmp;
				while (end >= begin) {
					tmp = ch[begin];
					ch[begin] = ch[end];
					ch[end] = tmp;
					end--;
					begin++;
				}
				startPosition = counter+1;
			}
			counter++;
		}

		return ch;
	}
}
