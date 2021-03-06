package ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Primer archivo: ");
            FileReader fr1 = new FileReader(sc.nextLine());
            System.out.println("Segundo archivo: ");
            FileReader fr2 = new FileReader(sc.nextLine());
            BufferedReader bf1 = new BufferedReader(fr1);
            BufferedReader bf2 = new BufferedReader(fr2);
                
            String Cadena1;
            String Cadena2;
            boolean iguales = true;         
            
            Cadena1 = bf1.readLine();
            Cadena2 = bf2.readLine();
                
            while ((Cadena1!=null) && (Cadena2!=null) && iguales) {
                if (!Cadena1.equals(Cadena2)){
                	iguales = false;
                }
                Cadena1 = bf1.readLine();
                Cadena2 = bf2.readLine();
            }
            bf1.close();
            bf2.close();
            sc.close();
            if ((iguales) && (Cadena1==null) && (Cadena2==null)){
            	System.out.println("Los ficheros son iguales");
            }else{
            	System.out.println("Los ficheros son diferentes");
            }
        }catch (FileNotFoundException e){
                e.getMessage();
        }catch (IOException e){
                e.getMessage();
        }
	}
}
