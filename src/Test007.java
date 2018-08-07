/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 * @author zuish
 *
 */
public class Test007 {
	public static void main(String[] args) {
		
		System.out.println(reverse(123));
	}
	 public static int reverse(int x) {
		 if(-10<x&&x<10){
			 return x;
		 }
		        String num=String.valueOf(x);
		        char[] number=num.toCharArray();
		        char temp[]=new char[number.length];
		        if(number[0]=='-'){
		        	temp[0]='-';
		        	int ij=number.length-1;
		        	for(int i=1;i<number.length;i++){
		        		temp[i]=number[ij--];
		        	}
		        }else {
		        	int ij=number.length-1;
		        	for(int i=0;i<number.length;i++){
		        		temp[i]=number[ij--];
		        	}
			}
		        num=String.valueOf(temp);
		        long dd=Long.parseLong(num);
		        if(dd>Integer.MAX_VALUE||dd<Integer.MIN_VALUE){
		        	return 0;
		        }
		        return (int)dd;
	    }
}
