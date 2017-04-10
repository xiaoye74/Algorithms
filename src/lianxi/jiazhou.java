package lianxi;

import java.util.Comparator;

public class jiazhou  implements Comparator<String>{
	private final String zhong="RWQOJMVAHBSGZXNTCIEKUPDYFL";
	@Override
	public int compare(String a,String b){
		for(int i=0;i<Math.min(a.length(), b.length());i++){
			int a1=zhong.indexOf(a.charAt(i));
			int b1=zhong.indexOf(b.charAt(i));
			if(a1>b1) return +1;
			else if(a1<b1) return -1;
		}
		return a.length()-b.length();
	}
	

}
