package programa11;

public class Programa11 {
    public static int cuadrado(int x){
        return x*x;
    }
    public static int funcion(int a,int b,String mensaje){
        System.out.println(mensaje);
        int c=cuadrado(b);
        return 100+a+c;
    }
    public static void main(String[] args) {
        System.out.println("hola desde main");
        int z=2,y=3;
        int aqui=funcion(y,z,"tercer parametro de la funcion");
        System.out.println("la funcion devolvio:"+aqui);//107
        int x=funcion(aqui,1,"el otro string");
        System.out.println("la funcion devolvio x:"+x);
    }
}
