package programa12;

public class Programa12 {
                                        
    public static String invertir(String cad){
        String result="";
        char []invertir=cad.toCharArray();
        for(int cont=cad.length()-1;cont>=0;cont--)
            result=result+invertir[cont];
        return result;
    }
    public static void main(String[] args) {
        String resultado=invertir("hola");
        System.out.println(resultado);
    }
}
