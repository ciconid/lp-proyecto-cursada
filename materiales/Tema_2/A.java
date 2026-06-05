package Tema_2;

public class A {

    static int factorGlobal = 10;
    
    int valorBase;

    public A(int valorBase) {
        this.valorBase = valorBase;
    }

    public int calcular(int limite) {
        int resultado = 0;
        int i = 0;
        
        while (i < limite) {
            if (resultado >= 1000) {
                break;
            }

            if (i % 2 == 0 || factorGlobal > 50) {
                resultado += i * factorGlobal;
            }
            i++;
        }
        return resultado;
    }

    public int obtenerEstado() {
        return valorBase*factorGlobal;
    }
}