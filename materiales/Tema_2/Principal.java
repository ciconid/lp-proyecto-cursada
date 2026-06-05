package Tema_2;

public class Principal {
    public static void main(String[] args) {

        int input1, input2;
        input1 = Sistema.read();
        input2 = Sistema.read();

        C objetoC = new C(input1, input2);

        objetoC.procesarComplejo(input1 + input2, input1 - input2);

        int resultado1 = objetoC.obtenerEstado(); 

        Sistema.print(resultado1);
    }
}