//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String nombre="Emilio Sonck";
    public static double[] calificaciones={70.0,80.8,90.6,30.4,50.3};

    public static void main(String[] args) {
        imprimirDatos();
    }

    public static void PromediarCalificacion(double[] array){
        double suma=0, promediar;
        int contador=1;
        for(int i=0;i<array.length;i++){
                suma+=array[i];
                System.out.println("Calificacion"+contador+ ": "+array[i]);
                contador++;
        }
        promediar=suma/array.length;
        System.out.println("El promedio es: "+promediar);
        AsignarCalificacion(promediar);
    }

    public static void AsignarCalificacion(double promediar){
        String Calificacion = "";
        if(promediar<=50){
            Calificacion="F";
        }else if(promediar>=51 && promediar<=60){
            Calificacion="E";
        }else if(promediar>=61 && promediar<=70){
            Calificacion="D";
        }else if(promediar>=71 && promediar<=80){
            Calificacion="C";
        }else if(promediar>=81 && promediar<=90){
            Calificacion="B";
        }else if(promediar>=91 && promediar<=100){
            Calificacion="A";
        }else{
            System.out.println("No valido");
        }
        System.out.println("Tu Calificacion es: "+Calificacion);
    }

    public static void imprimirDatos(){
        System.out.println("...:::Hola, Bienvenido al sistema de calificaciones:::...");
        System.out.println("Nombre del estudiante: "+nombre);
        PromediarCalificacion(calificaciones);
    }
}