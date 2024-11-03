public class TestFigura {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(6, 8);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
