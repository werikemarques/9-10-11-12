package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import teste.Pais_crud;

public class PaisTest {

	@Test
	public void testComMaisHabitantes() {
		Pais_crud p = new Pais_crud();
		p = p.comMaisHabitantes();
		assertEquals("pais com mais habitantes", "Brasil", p.getNome());
	}

}
