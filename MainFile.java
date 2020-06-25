import java.lang.Math;

public class MainFile {
    public static String padLeft(String s, int n){
        /**
        * pading de izquierda recive un numero 
        *
        */
        return String.format("%" + n + "s", s);
    } 

    public static void arbol(int filas){
        int asterisco = 0;
        for (int alto = 1; alto <= filas; alto++){
            for (int espacio = 1; espacio <= filas - alto; espacio++){
                System.out.print(" ");
            }
            for (asterisco = 1; asterisco <= (alto * 2) - 1; asterisco++){
                System.out.print("\033[32m*");// color
            }
            System.out.println();
        }
        // Tallo del arbol
        int tronco =  Math.round(asterisco / 2) + 1;
        
        System.out.println(filas < 10 ? padLeft("***", tronco) : padLeft("***", tronco) + "\n" + padLeft("***", tronco));
        
    }

    public static void main(String[] args) {
        
        if (args.length == 0){
            System.out.println("Filas de arbolito: ");
            int in = Integer.parseInt(System.console().readLine());
            arbol(in);

        } else {
            if (Integer.parseInt(args[0]) < 5){
                System.out.println("Ingrese un parametro mayor o igual 5");
            } else {
                arbol(Integer.parseInt(args[0]));
            }
        }
    }
}