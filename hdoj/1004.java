package hdoj1004;

import java.util.*;
import java.util.Map.Entry;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		while (ss.hasNextInt()) {
			int t = ss.nextInt();
			if (t == 0) {
				break;
			}
			HashMap<String, Integer> hash = new HashMap<String, Integer>();
			while ((t--) != 0) {
				String str = ss.next();
				int temp;
				if (!hash.containsKey(str)) {
					temp = 0;
				} else {
					temp = hash.get(str).intValue() + 1;
				}
				hash.put(str, temp);
			}
			Set<String> keyS = hash.keySet();
			// 方法一：返回包含Map中所有关键字（key）的Set对象
			String ans = "";
			int max = -1;
			for (String s : keyS) {
				int tmp = hash.get(s).intValue();
				if (tmp > max) {
					max = tmp;
					ans = s;
				}
			}
			System.out.println(ans);
//方法二：
			// String ans = "";
			// int max = -1;
			// Iterator<Entry<String,Integer>> iter=hash.entrySet().iterator();
			// while(iter.hasNext()){
			// Entry<String, Integer> entry=iter.next();
			// int temp = entry.getValue();
			// if(max < temp){
			// max = temp;
			// ans = entry.getKey().toString();
			// }
			// }
			// System.out.println(ans);
			// hash.clear();
		}
	}

}
