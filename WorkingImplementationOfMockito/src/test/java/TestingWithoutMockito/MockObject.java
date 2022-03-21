package TestingWithoutMockito;

import PojoClasses.ToBeMocked;

public class MockObject implements ToBeMocked{

	public MockObject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String needsToBeMocked() {
		// TODO Auto-generated method stub
		return "MockData";
	}

	@Override
	public String anotherMethodToBeMocked() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object yes(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object no(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getStr(String string) {
		// TODO Auto-generated method stub
		
	}

}
