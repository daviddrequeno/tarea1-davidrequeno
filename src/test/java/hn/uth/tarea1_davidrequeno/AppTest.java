package hn.uth.tarea1_davidrequeno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void testCalcularCirculo() {
    // Probamos valores positivos
    assertEquals(78.54, App.calcularAreaCirculo(5), 0.01, "Error: Área de círculo con radio 5 incorrecta.");
    assertEquals(314.16, App.calcularAreaCirculo(10), 0.01, "Error: Área de círculo con radio 10 incorrecta.");
    assertEquals(12.57, App.calcularAreaCirculo(2), 0.01, "Error: Área de círculo con radio 2 incorrecta.");

    // Probamos con un valor negativo para validar la excepción
    IllegalArgumentException thrown = assertThrows(
      IllegalArgumentException.class,
      () -> App.calcularAreaCirculo(-1),
      "Se esperaba una excepción para radio negativo."
    );
    assertEquals("El radio no puede ser negativo", thrown.getMessage());
  }

  @Test
  public void testCalcularAreaCuadrado() {
    assertEquals(25, App.calcularAreaCuadrado(5), 0, "Error: Área de cuadrado con lado 5 incorrecta.");
    assertEquals(100, App.calcularAreaCuadrado(10), 0, "Error: Área de cuadrado con lado 10 incorrecta.");
    assertEquals(4, App.calcularAreaCuadrado(2), 0, "Error: Área de cuadrado con lado 2 incorrecta.");

    IllegalArgumentException thrown = assertThrows(
      IllegalArgumentException.class,
      () -> App.calcularAreaCuadrado(-4),
      "Se esperaba una excepción para lado negativo."
    );
    assertEquals("El lado no puede ser negativo", thrown.getMessage());
  }

  @Test
  public void testCalcularAreaRectangulo() {
    assertEquals(50, App.calcularAreaRectangulo(5, 10), 0, "Error: Área de rectángulo con largo 5 y ancho 10 incorrecta.");
    assertEquals(20, App.calcularAreaRectangulo(4, 5), 0, "Error: Área de rectángulo con largo 4 y ancho 5 incorrecta.");
    assertEquals(200, App.calcularAreaRectangulo(10, 20), 0, "Error: Área de rectángulo con largo 10 y ancho 20 incorrecta.");

    IllegalArgumentException thrown = assertThrows(
      IllegalArgumentException.class,
      () -> App.calcularAreaRectangulo(-5, 10),
      "Se esperaba una excepción para largo negativo."
    );
    assertEquals("El largo y el ancho no pueden ser negativos", thrown.getMessage());
  }

  @Test
  public void testCalcularAreaTriangulo() {
    assertEquals(25, App.calcularAreaTriangulo(5, 10), 0, "Error: Área de triángulo con base 5 y altura 10 incorrecta.");
    assertEquals(10, App.calcularAreaTriangulo(4, 5), 0, "Error: Área de triángulo con base 4 y altura 5 incorrecta.");
    assertEquals(100, App.calcularAreaTriangulo(10, 20), 0, "Error: Área de triángulo con base 10 y altura 20 incorrecta.");

    IllegalArgumentException thrown = assertThrows(
      IllegalArgumentException.class,
      () -> App.calcularAreaTriangulo(5, -10),
      "Se esperaba una excepción para altura negativa."
    );
    assertEquals("La base y la altura no pueden ser negativos", thrown.getMessage());
  }
}
