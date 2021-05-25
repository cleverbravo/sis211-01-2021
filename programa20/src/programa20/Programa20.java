package programa20;

public class Programa20 
{
    public static void main(String[] args) {
        Auto suzuky=new Auto();
        Auto toyota=new Auto();
        Auto nissan=new Auto();
    }
}

//relacion de agregacion=>relacion de dependencia FUERTE
class Auto{
    Rueda r[]=new Rueda[4];
    Puerta p[]=new Puerta[3];
    Motor m;
    //relacion de asociación=>relacion de dependencia
    public void setMotor(Motor m1){
        m=m1;
    }
}
class Rueda{
    String marca;
    int aro;
}
class Puerta{
    String color1,color2;
    TipoVentana ventana;
}
enum TipoVentana{Rayban,VidrioTemplado,Normal};
class Motor{
    String marca,serie;
    int cilindrada;
}