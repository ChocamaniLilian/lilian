package ejercicio2_10;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Sopa de Mani", "Coca-Cola");
        Pedido pedido2 = new Pedido("Charque", "Filete de pollo", "Agua mineral");
        Pedido pedido3 = new Pedido("Ramen", "Papas fritas", "Agua", "Helado");

        double totalPedido1 = pedido1.calcularValorPedido();
        double totalPedido2 = pedido2.calcularValorPedido();
        double totalPedido3 = pedido3.calcularValorPedido();

        System.out.println("Valor del pedido 1: $" + totalPedido1);
        System.out.println("Valor del pedido 2: $" + totalPedido2);
        System.out.println("Valor del pedido 3: $" + totalPedido3);
    }
}