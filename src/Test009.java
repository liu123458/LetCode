import java.util.ArrayList;
import java.util.Stack;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 * @author zuish
 *
 */
public class Test009 {
	 public boolean isPalindrome(int x) {
		        if(x<0){
		        	return false;
		        }else if(x<10){
				return true;
			}
		        ArrayList<Integer> list= new ArrayList<>();
		        Stack<Integer> stack=new Stack<>();
		        while(x>0){
		        	int num=x%10;
		        	list.add(num);
		        	stack.push(num);
		        	x=x/10;
		        }
		        if(list.size()%2==0){
		        	for(int i=0;i<(list.size()/2);i++){
		        		if(!stack.pop().equals(list.get(i))){
		        			return false;
		        		}
		        	}
		        	return true;
		        }else {
		        	for(int i=0;i<=(list.size()/2);i++){
		        		if(!stack.pop().equals(list.get(i))){
		        			return false;
		        		}
		        	}
		        	return true;
			}
	    }
}
