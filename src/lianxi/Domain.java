package lianxi;

public class Domain implements Comparable<Domain> {
	private String[] fileds;
	private int n;
	public Domain(String s){
		fileds=s.split("\\.");
		n=fileds.length;
	}
	@Override
	public String toString(){
		if(n==0) return "";
		String s=fileds[0];
		for(int i=1; i<n;i++){
			s=fileds[i]+"."+s;
		}
		return s;
	}
	@Override
	public int compareTo(Domain a){
		for(int i=0; i<Math.min(this.n, a.n);i++){
			String s=fileds[this.n-i-1];
			String s1=fileds[a.n-i-1];
			int c=s.compareTo(s1);
			if(c>0) return +1;
			if(c<0) return -1;
		}
		return this.n-a.n;
	}

}
