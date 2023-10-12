
package ejercicio2_10;

public class Pedido {
    // atributos para no olvidarme
    private String Plato1;
    private String Plato2;
    private String Bebida3;
    private String Postre4;
    //constructores

    public Pedido(String primerPlato, String bebida) {
        this.Plato1 = primerPlato;
        this.Bebida3 = bebida;
    }

    public Pedido(String primerPlato, String segundoPlato, String bebida) {
        this.Plato1 = primerPlato;
        this.Plato2 = segundoPlato;
        this.Bebida3 = bebida;
    }
    //# programadora por siempre, aunque voy aprediendo, lice hize mi mayor esfuerzo

    public Pedido(String primerPlato, String segundoPlato, String bebida, String postre) {
        this.Plato1 = primerPlato;
        this.Plato2 = segundoPlato;
        this.Bebida3 = bebida;
        this.Postre4 = postre;
    }

    public double calcularValorPedido() {
        double valorTotal = 0.0;
        return valorTotal;
    }
}
