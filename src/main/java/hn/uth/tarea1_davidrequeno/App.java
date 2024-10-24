package hn.uth.tarea1_davidrequeno;

public class App {
	
   public static double calcularAreaCirculo(double radio) {
    return Math.PI * Math.pow(radio, 2);
  }

  public static double calcularAreaCuadrado(double lado) {
    return lado * lado;
  }

  public static double calcularAreaRectangulo(double largo, double ancho) {
    return largo * ancho;
  }

  public static double calcularAreaTriangulo(double base, double altura) {
    return (base * altura) / 2;
   }
	
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
