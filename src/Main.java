public class Main {
    public static void main(String[] args) {
        Produto bola = new Produto(100,20);

        System.out.println("O valor do Produto é de: R$ "+bola.calcularValorComImposto());
    }
}