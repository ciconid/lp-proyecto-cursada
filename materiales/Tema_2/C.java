package Tema_2;

public class C extends A {
    B objetoB; 

    public C(int valorBase, int multiplicadorB) {
        super(valorBase);
        this.objetoB = new B(valorBase * 2, multiplicadorB); 
    }

    public void procesarComplejo(int x, int y) {
        objetoB.procesarSimple(x);

        if (x > 0 && y < 100) {
            this.valorBase += this.calcular(x+y);
        }
    }

    public int obtenerEstado() {
        return super.obtenerEstado() + objetoB.calcularConFor(10);
    }
}