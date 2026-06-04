
package base;


public class Base {


    public static void main(String[] args) {
        A v = new A();
        int i = Sistema.read();
        v.met1(i);
        int m = v.met2();
        Sistema.print(m);
    }
    
}
