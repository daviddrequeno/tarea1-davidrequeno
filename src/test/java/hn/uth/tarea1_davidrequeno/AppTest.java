package hn.uth.tarea1_davidrequeno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
	
    
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }
  
//Prueba del método para calcular el área del círculo
  @Test
  public void testCalcularCirculo () {
	 assertEquals(78.54, App.calcularAreaCirculo(5), 0.01);
	 assertEquals(314.16, App.calcularAreaCirculo(10), 0.01);
     assertEquals(12.57, App.calcularAreaCirculo(2), 0.01);
  }
  
  @Test
  public void testCalcularAreaCuadrado() {
      assertEquals(25, App.calcularAreaCuadrado(5), 0);
      assertEquals(100, App.calcularAreaCuadrado(10), 0);
      assertEquals(4, App.calcularAreaCuadrado(2), 0);
  }

  @Test
  public void testCalcularAreaRectangulo() {
      assertEquals(50, App.calcularAreaRectangulo(5, 10), 0);
      assertEquals(20, App.calcularAreaRectangulo(4, 5), 0);
      assertEquals(200, App.calcularAreaRectangulo(10, 20), 0);
  }

  @Test
  public void testCalcularAreaTriangulo() {
      assertEquals(25, App.calcularAreaTriangulo(5, 10), 0);
      assertEquals(10, App.calcularAreaTriangulo(4, 5), 0);
      assertEquals(100, App.calcularAreaTriangulo(10, 20), 0);
  }
}
