package programa18;
import java.util.*;
public class Programa18 {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Number> v=new ArrayList();
        v.add(new Number(80.9999));
        v.add(new Number(80.1294));
        v.add(new Number(80.1291));
        v.add(new Number(80.8999));
        v.add(new Number(80.9999));
        v.sort( (a,b)-> (int)(a.x*100)-(int)(b.x*100));
        for(int i=0;i<v.size();i++)
            System.out.println(v.get(i).x);
    }
}
class Number{
    double x;
    public Number(double x){
        this.x=x;
    }
}

