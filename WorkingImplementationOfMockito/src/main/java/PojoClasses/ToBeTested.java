package PojoClasses;

public class ToBeTested {

	public ToBeMocked toBeMocked;
	
	public ToBeTested(ToBeMocked toBeMocked2) {
		this.toBeMocked=toBeMocked2;
		// TODO Auto-generated constructor stub
	}

	public String getStrings() {
		toBeMocked.anotherMethodToBeMocked();
		return toBeMocked.needsToBeMocked();
	}
	
	public String yes(int a) {
		return "";
	}
	
	public String getStr(String ann) {
		return ann;
	}
	public String no(String str) {
		String ss=getStr(str);
		return ss;
	}
	
	public ToBeTested() {
		super();
	}
	
}
