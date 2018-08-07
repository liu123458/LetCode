import java.util.ArrayList;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。 示例： 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。 给定
 * "bbbbb" ，最长的子串就是 "b" ，长度是1。 给定 "pwwkew" ，最长子串是 "wke"
 * ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列 而不是子串。
 * 
 * @author zuish
 *
 */
public class Test003 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}
		char words[] = s.toCharArray();
		int max = 1;
		boolean ischongfu = false;
		for (int i = 0; i < words.length; i++) {
			ischongfu = false;
			ArrayList<Character> num = new ArrayList<>();
			for (int j = i; j < words.length && ischongfu == false; j++) {
				if (ischongfu1(num, words[j])) {
					ischongfu = true;
				} else {
					num.add(words[j]);
				}
			}
			if (num.size() > max) {
				max = num.size();
			}
		}
		return max;
	}

	public boolean ischongfu1(ArrayList<Character> num, char i) {
		if (num.isEmpty()) {
			return false;
		} else {
			for (Character character : num) {
				if (character == i) {
					return true;
				}
			}
			return false;
		}
	}

}
