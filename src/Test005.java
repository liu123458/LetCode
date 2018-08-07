
/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。 示例 1： 输入: "babad" 输出: "bab" 注意:
 * "aba"也是一个有效答案。 示例 2： 输入: "cbbd" 输出: "bb"
 * 
 * @author zuish
 *
 */
public class Test005 {
	public static void main(String[] args) {
		String string = "111";
		System.out.println(longestPalindrome(string));
	}

	public static String longestPalindrome(String s) {
		if (s == null || s.equals("")) {
			return "";
		}
		char words[] = s.toCharArray();
		String string = String.valueOf(words[0]);
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i] == words[i + 1]) {
				int right = i + 2, left = i - 1;
				boolean temp = true;
				while (left >= 0 && right < words.length && temp) {
					if (words[left] == words[right]) {
						right++;
						left--;
					} else {
						temp = false;
					}
				}
				if (string.length() < (right - left - 1)) {
					char dd[] = new char[right - left - 1];
					int ss = 0;
					for (int j = left + 1; j < right; j++) {
						dd[ss] = words[j];
						ss++;
					}
					string = String.valueOf(dd);
				}

			}
			int right = i + 1, left = i - 1;
			boolean temp = true;
			while (left >= 0 && right < words.length && temp) {
				if (words[left] == words[right]) {
					right++;
					left--;
				} else {
					temp = false;
				}
			}
			if (string.length() < (right - left - 1)) {
				char dd[] = new char[right - left - 1];
				int ss = 0;
				for (int j = left + 1; j < right; j++) {
					dd[ss] = words[j];
					ss++;
				}
				string = String.valueOf(dd);
			}
		}
		return string;
	}

}
