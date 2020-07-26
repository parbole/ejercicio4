import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
        double r, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite el valor del radio: ");
        Scanner teclado = new Scanner(System.in);
        r = teclado.nextDouble();
        
        resultado = Math.PI * Math.pow(r, 2);
        
        System.out.print("El area del circulo de radio " + r +  " es: " + String.format("%.2f", resultado) + " metros cuadrados" + "\n");
        
        resultado = (4 * Math.pow(r, 3)/3) * Math.PI;

        System.out.print("El volumen de la esfera de radio " + r +  " es: " + String.format("%.2f", resultado) + " metros cubicos");
    }
}