package Tema_2;

public class B extends A {
    int multiplicador;

    public B(int valorBase, int multiplicador) {
        super(valorBase);
        this.multiplicador = multiplicador;
    }

    public void procesarSimple(int x) {
        int base = this.multiplicador + 1;
        
        if (x > 0) {
            this.multiplicador = base + (x * multiplicador);
        } else {
            this.multiplicador = base + 1;
        }
    }

    public int calcularConFor(int repeticiones) {
        int total = 0;
        for (int j = 0; j < repeticiones; j++) {
            total += j * multiplicador;
        }
        return total;
    }
}