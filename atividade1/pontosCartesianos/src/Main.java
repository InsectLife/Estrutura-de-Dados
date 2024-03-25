public class Main {
    public static void main(String[] args){
        
        pontosCartesianos p1 = new pontosCartesianos(3, -4);
        pontosCartesianos p2 = new pontosCartesianos(6, 0);

        System.out.println(p1.calcularPontos(p1, p2));
    }
}
