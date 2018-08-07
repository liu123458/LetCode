

/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数： P A H N A P L S I I G Y I R
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR" 实现一个将字符串进行指定行数变换的函数: string convert(string s,
 * int numRows); 示例 1: 输入: s = "PAYPALISHIRING", numRows = 3 输出:
 * "PAHNAPLSIIGYIR" 示例 2: 输入: s = "PAYPALISHIRING", numRows = 4 输出:
 * "PINALSIGYAHRPI" 解释: P I N A L S I G Y A H R P I
 * 
 * @author zuish
 *
 */

public class Test006 {
	public static void main(String[] args) {
		String string = "PAYPALISHIRING";
		System.out.println(convert(string, 9));
	}

	public static String convert(String s, int numRows) {
		if (s.equals("")) {
			return "";
		} else if (numRows == 1) {
			return s;
		} else {
			char words[] = s.toCharArray();
			int dd = 0;
			int ddd = (s.length() / (numRows * 2 - 2)+1) * (numRows - 1) ;
			char temp[][] = new char[numRows][ddd];
			for (int i = 0; i < ddd; i++) {
				for (int j = 0; j < numRows; j++) {
					temp[j][i] = '$';
				}
			}
			for (int i = 0; i < ddd; i++) {
				for (int j = 0; j < numRows && dd < s.length(); j++) {
					if (i % (numRows - 1) == 0) {
						temp[j][i] = words[dd++];
					} else {
						if (j == (numRows - (i % (numRows - 1)) - 1)) {
							temp[j][i] = words[dd++];
						}
					}
				}
			}
			dd = 0;
			for (int i = 0; i < numRows; i++) {
				for (int j = 0; j < ddd; j++) {
					if (temp[i][j] != '$') {
						words[dd++] = temp[i][j];
					}
				}
			}
			s = String.valueOf(words);
			return s;
		}

	}

}
