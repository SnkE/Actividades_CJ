//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Problema 1");
        checkNumber();
        System.out.println("-------------------------------");
        System.out.println("Problema 2");
        boolean Resultado= hasEqualSum(1,-1,0);
        System.out.println(Resultado);
        System.out.println("-------------------------------");
        System.out.println("Problema 3");
        boolean Teen= hasTeen(22,23,24);
        System.out.println(Teen);
        System.out.println("-------------------------------");
        System.out.println("Problema 4");
        adjustLighting(false,false,23);

    }


    public static void checkNumber(){
        int number= 0;
        if(number>0){
            System.out.println("Positivo");
        }else if(number<0){
            System.out.println("Negativo");
        }else{
            System.out.println("Es igual a 0");
        }
    }

    public static boolean hasEqualSum(int num1, int num2, int sum){
        return (num1+num2)==sum;
    }


    public static boolean hasTeen(int t1, int t2, int t3){
        return (t1 >= 13 && t1 <= 19) || (t2 >= 13 && t2 <= 19) || (t3 >= 13 && t3 <= 19);
    }

    public static void adjustLighting(boolean isDayLight, boolean isPresenceDetected, int hour){
        if(isDayLight){
            if(isPresenceDetected){
                System.out.println("Luces a intensidad baja");
            }else{
                System.out.println("Luces apagadas");
            }
        }else{
            if(isPresenceDetected && hour>=18 && hour<=22){
                System.out.println("Luces a intensidad alta");
            }else if(isPresenceDetected && !(hour>=18 && hour<=22)){
                System.out.println("Luces a intensidad suave");
            }else{
                System.out.println("Luces apagadas");
            }
        }
    }
}