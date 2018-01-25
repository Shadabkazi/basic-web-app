package tutorial;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;

public class CalculatorTest {
	@Mock
	private Calculator calc;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this); // used for creating object without new keyword
	}
	
	
@Test
public void testAbs() {

	when(calc.abs(-20)).thenReturn(20);
	assertEquals(20, calc.abs(-20));
}
}
