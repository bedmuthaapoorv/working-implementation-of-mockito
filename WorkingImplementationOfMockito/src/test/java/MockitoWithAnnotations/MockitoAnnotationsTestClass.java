package MockitoWithAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import PojoClasses.ToBeMocked;
import PojoClasses.ToBeTested;

@ExtendWith(MockitoExtension.class)
class MockitoAnnotationsTestClass {
	
	@Mock
	ToBeMocked toBeMocked;
	
	@InjectMocks
	ToBeTested toBeTested;
	
	@Captor
	ArgumentCaptor<String> captor;
	
	
	@Test
	void test() {
		when(toBeMocked.needsToBeMocked()).thenReturn("Hi");
		//System.out.print("yo yo");
		assertEquals(toBeMocked.needsToBeMocked(),"Hi");
	}
	
	@Test
	void test2() {
		when(toBeMocked.needsToBeMocked()).thenReturn("Hi");
		assertEquals(toBeTested.getStrings(),"Hi");
	}
	
}
