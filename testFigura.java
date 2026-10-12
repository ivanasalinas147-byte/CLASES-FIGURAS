public class testFigura
{
	public static void main(String[] args) {
		 Figura figura = new Figura();
		 
		 double circulo, triangulo;
		 
		 circulo = figura.calcularArea(3.5);
		 triangulo = figura.calcularArea(9.8, 12.5);
		 rectangulo = figura.calcularArea(9, 12);
		 
		 System.out.print("Areas");
		 System.out.print("Circulo: " + circulo);
		 System.out.print("Triangulo" + triangulo);
		 System.out.print("Rectangulo" + rectangulo);
		 System.out.print("\n");
		 
		 circulo = figura.calcularPerimetro(3.5);
		 triangulo = figura.calcularPerimetro(9.8, 12.5);
		 rectangulo = figura.calcularPerimetro(9, 12);
		 
		 System.out.print("Perimetro");
		 System.out.print("Circulo: " + circulo);
		 System.out.print("Triangulo" + triangulo);
		 System.out.print("Rectangulo" + rectangulo);
		 System.out.print("\n");
		 
	}
}
