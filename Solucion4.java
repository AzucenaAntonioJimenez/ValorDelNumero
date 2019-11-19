/**
 * programa que muestra el valor de una posición de un numero
 */
import java.util.*;
public class Solucion4
{
   public static String algo(String numero, int indice){
       char valor=numero.charAt(indice);
       String ceros="";
       int a=numero.length();
       for(int i=(a-1); i>indice;i--){
           ceros+="0";
        }
        return valor+ceros;
    }
    
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);  
       System.out.println("Ingresa un numero");
       String numer=sc.next();
       boolean no=false;
       for(int i=0; i<numer.length(); i++)
       {
           if(numer.charAt(i)=='1' || numer.charAt(i)=='2' || numer.charAt(i)=='3' || numer.charAt(i)=='4' || numer.charAt(i)=='5' || numer.charAt(i)=='6' || numer.charAt(i)=='7' || numer.charAt(i)=='8' || numer.charAt(i)=='9' || numer.charAt(i)=='0')
           no=true;
           else{
           no=false;
           break;}
        }
        if(no==true){
       System.out.println("Posiciones:\n0,1,2,3...");
       System.out.println("De que posicion quieres conocer su valor?");
       int num=sc.nextInt();String valores;
       valores= algo(numer, num);
       System.out.println("Su valor es: "+valores);
    }}
}
