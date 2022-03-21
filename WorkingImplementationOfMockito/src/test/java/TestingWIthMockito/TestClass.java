package TestingWIthMockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import PojoClasses.ToBeMocked;
import PojoClasses.ToBeTested;

class TestClass {
	
	public ToBeMocked toBeMocked=mock(ToBeMocked.class);
	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

	
	@Test
	void test() {
		Mockito.when(toBeMocked.needsToBeMocked()).thenReturn("MockData");
		ToBeTested toBeTested=new ToBeTested(toBeMocked);
		assertEquals("MockData",toBeTested.getStrings());
		
		//using argumentMatchers
		when(toBeMocked.yes(Mockito.anyInt())).thenReturn("");
		assertEquals(toBeMocked.yes(1),"");
		assertEquals(toBeMocked.yes(2),"");
		
		//verifying is the method is mocked
		verify(toBeMocked).needsToBeMocked();
		
		//below line will give error since toBeTested is not a mock object
		//verify(toBeTested).getStrings();
		
		//verifies the no. of interactions
		//verify(toBeMocked,times(2)).needsToBeMocked();
	
		//verify no interactions with the whole object
		//verifyNoInteractions(toBeMocked);
	
		when(toBeMocked.anotherMethodToBeMocked()).thenReturn("yes");
		//this verifies whether below methods are run in sequence
		//InOrder inorder=inOrder(toBeMocked);
		//inorder.verify(toBeMocked).needsToBeMocked();
		//inorder.verify(toBeMocked).anotherMethodToBeMocked();
		
		//using doAnswer
		Answer<String> answer=invocation->{
			Integer a=(Integer) invocation.getArguments()[0];
			
			return ""+(a+1);
		};
		
		//using argument captor
		toBeTested=mock(ToBeTested.class);
		doCallRealMethod().when(toBeTested).no("apoo");
		toBeTested.no("apoo");
		verify(toBeTested).getStr(captor.capture());
		assertEquals(captor.getValue(),"apoo");
	}

}
