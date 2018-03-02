import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Tests {

	@Test
	public void testSuma() {
		Matematica mate=new Matematica();
		int resultado=mate.suma(1, 2);
		int resultadoEsperado=3;
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	public void testSumaArray(){
		Matematica mate=new Matematica();
		int resultado=mate.suma(1, 2);
		resultado=mate.suma(1, 2);
		resultado=mate.suma(1, 2);
		resultado=mate.suma(1, 2);
		ArrayList<Integer> arrayEsperado=new ArrayList<>();
		arrayEsperado.add(3);
		arrayEsperado.add(3);
		arrayEsperado.add(3);
		arrayEsperado.add(3);
		assertEquals(mate.getSumas(), arrayEsperado);
	}
	
	@Test
	public void testMayor(){
		Matematica mate=new Matematica();
		assertTrue(mate.mayor(10, 6));
	}

}
