package TestingWithoutMockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import PojoClasses.ToBeMocked;
import PojoClasses.ToBeTested;

class TestClass {
	
	public ToBeMocked toBeMocked=new MockObject();
	ToBeTested toBeTested=new ToBeTested(toBeMocked);
	
	@Test
	void test() {
		assertEquals("MockData",toBeTested.getStrings());
	}

}
