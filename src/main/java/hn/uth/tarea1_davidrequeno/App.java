package hn.uth.tarea1_davidrequeno;

public class App {

  public static double calcularAreaCirculo(double radio) {
    if (radio < 0) {
      throw new IllegalArgumentException("El radio no puede ser negativo");
    }
    return Math.PI * Math.pow(radio, 2);
  }

  public static double calcularAreaCuadrado(double lado) {
    if (lado < 0) {
      throw new IllegalArgumentException("El lado no puede ser negativo");
    }
    return lado * lado;
  }

  public static double calcularAreaRectangulo(double largo, double ancho) {
    if (largo < 0 || ancho < 0) {
      throw new IllegalArgumentException("El largo y el ancho no pueden ser negativos");
    }
    return largo * ancho;
  }

  public static double calcularAreaTriangulo(double base, double altura) {
    if (base < 0 || altura < 0) {
      throw new IllegalArgumentException("La base y la altura no pueden ser negativos");
    }
    return (base * altura) / 2;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
