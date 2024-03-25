public class pontosCartesianos {

    private double pontoX;
    private double pontoY;

    public pontosCartesianos(double pontoX, double PontoY) {
        this.pontoX = pontoX;
        this.pontoY = PontoY;
    }

    public double getPontoX() {
        return pontoX;
    }

    public double getPontoY() {
        return pontoY;
    }

    public void setPontoX(double pontoX) {
        this.pontoX = pontoX;
    }

    public void setPontoY(double pontoY) {
        this.pontoY = pontoY;
    }

    public double calcularPontos(pontosCartesianos p1, pontosCartesianos p2) {
        double x, y, resultado;
        x = Math.pow(p2.pontoX - p1.pontoX, 2);

        y = Math.pow(p2.pontoY - p1.pontoY, 2);

        resultado = Math.sqrt(x + y);
        return resultado;

    }
}
        
        y = Math.pow(p2.pontoY - p1.pontoY, 2);
        
        resultado = Math.sqrt(x + y);
        return resultado;

    }


}
