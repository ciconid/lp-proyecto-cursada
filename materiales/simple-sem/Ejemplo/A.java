
package base;

public class A {
    int x,y;
    
    void met1(int p){
        x = p;
        y = p*5;
    }
    
    int met2(){
        int rtn;
        if((x+y)/2 > 10){
            rtn = x+2;
        }
        else{
            rtn = y*5;
        }
        return rtn
    }
}
