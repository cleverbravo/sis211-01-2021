package programa10;
import java.util.*;
/*Escribir un programa para leer los parciales(3) de 5 estudiantes
y mostrar por pantalla en orden descendente los promedios
pepe    51 10 0         20.3
carlos  10 5  20        10.
maria   51 0  51        ...
caren   51 51 15        ...
melina  100 20 40       ...
51 10 0
10 5  20
51 0  51
51 51 15
100 20 40

*/
public class Programa10 {
    public static void main(String[] args) {        
        Scanner cin=new Scanner(System.in);
        int matriz[][]=new int [5][3];//5 filas y 3 columnas
        System.out.println("Introduzca los 3 parciales de 5 estudiantes:");
        for(int i=0;i<5;i++)
            for(int j=0;j<3;j++)
                matriz[i][j]=cin.nextInt();
        double promedios[]=new double[5];
        for(int i=0;i<5;i++){
            promedios[i]=0;
            for(int j=0;j<3;j++){
                promedios[i]=promedios[i]+matriz[i][j];//promedios[i]+=matriz[i][j];
            }
            promedios[i]=promedios[i]/3;//promedios[i]/=3;
        }
        System.out.println("mostrando promedios:");
        Arrays.sort(promedios);
        for(int i=0;i<5;i++)
            System.out.println(promedios[5-1-i]);
        
    }
}
