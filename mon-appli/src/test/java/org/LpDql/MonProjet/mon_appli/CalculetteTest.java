package org.LpDql.MonProjet.mon_appli;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class CalculetteTest {
	
	Calculette c;
	
	Calculette service = Mockito.mock(Calculette.class);

	@Before
	public void setUp() throws Exception {
		this.c = new Calculette();
	}

	@After
	public void tearDown() throws Exception {
		this.c = null;
	}

	@Test
	public void testAdd() {
		assertEquals(5, c.add(3, 2));
		/*  */
		when(service.add(8, 4)).thenReturn(5);
		assertEquals(5, service.add(8, 4));
		assertEquals(5, service.add(8, 4));
		assertEquals(5, service.add(8, 4));
		/* Verify avec "times" permet de tester le nombre de fois où on a fait appel à la méthode "service" */ 
		verify(service, times(3)).add(8, 4);
	}

}
