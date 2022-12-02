package helloWorldSamuelVidal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class HelloWorldTest {
	
	HelloWorld hw;
	HelloWorld service = Mockito.mock(HelloWorld.class);

	@Before
	public void setUp() throws Exception {
		this.hw = new HelloWorld();
	}

	@After
	public void tearDown() throws Exception {
		this.hw = null;
	}

	@Test
	public void testHelloWorld() {
		assertEquals("Hello world", hw.helloWorld());
		when(service.helloWorld()).thenReturn("good bye");
		assertEquals("good bye", service.helloWorld());
		assertEquals("good bye", service.helloWorld());
		verify(service, times(2)).helloWorld();
	}

}
