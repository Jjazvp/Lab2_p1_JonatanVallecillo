package lab2p1_jonatanvallecillo;

import java.util.Scanner;


public class Lab2p1_JonatanVallecillo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
   
        System.out.println("Elija el ejercicio que desea");
        System.out.println("Ejercicio 1 = 1");
        System.out.println("Ejercicio 2 = 2");
        System.out.println("Ejercicio 3 = 3");        
        int ejercicio = leer.nextInt();
        
        if (ejercicio == 1){
            System.out.println("Bienvenidos a Ejercicio 1");
                System.out.println("Ingrese 3 valores que no sean negativos");        
            System.out.println("Ingrese el primer número");
            int num1 = leer.nextInt();        
            System.out.println("Ingrese el segundo número");
            int num2 = leer.nextInt();        
            System.out.println("Ingrese el tercer número");
            int num3 = leer.nextInt();
            if ((num1 < 0) || (num2 < 0) || (num3 < 0)){
                System.out.println("Las longitudes no pueden ser negativas");        
            }
            if ((num1 + num2 > num3) && (num1 + num3 > num2) && (num2 +num3 > num1)){ 
                System.out.println("Las variables forman un triángulo");
            }else{
               System.out.println("Las variables no forman un triángulo");
            }//Fin ejercicio 1
        
        }while (ejercicio == 2){          
            System.out.println("Elija la figura que desee");
            System.out.println("Triángulo = 1");
            System.out.println("Rectángulo = 2");
            System.out.println("Círculo = 3");    
            
            int figuras = leer.nextInt(); 
                          
            if (figuras == 1){
                System.out.println("Ingrese la longitud de la base");
                double numf1 = leer.nextDouble();
                System.out.println("Ingrese la longitud de la altura");
                double numf2 = leer.nextDouble();
                
                double area1 = (numf1 * numf2)/2;
                
                System.out.println("El área del triángulo es "+ area1);
                System.out.println("¿Desea calcular el área de otra figura?");
            
            }else if (figuras == 2){
                System.out.println("Ingrese el primer número");
                double numf1 = leer.nextDouble();
                System.out.println("Ingrese el segundo número");
                double numf2 = leer.nextDouble();
                
                double area2 = numf1 * numf2;
                
                System.out.println("El área del rectángulo es "+ area2);
                System.out.println("¿Desea calcular el área de otra figura?");
                                
            }else if (figuras == 3){
                double pi = 3.141516;
                System.out.println("Ingrese el radio del círculo");
                double radio = leer.nextDouble();
                
                double area3 = pi * radio * radio;
                
                System.out.println("El área del círculo es "+ area3);  
                System.out.println("¿Desea calcular el área de otra figura?");
            } //Fin ejercicio 2
            
                      
            
                        
        }if (ejercicio == 3){
            
            System.out.println("Ingrese un número"); 
            int num0 = leer.nextInt();
            int cont = 1;
            boolean espar = false;
            boolean esprimo = false;
            
            while (cont < num0){    
                cont = cont + 1;
                if ((num0 % cont == 1) && (num0 % 2 == 0)){
                    esprimo = true;
                    espar = true;
                    System.out.println("Es par y primo");                                        
                }else if ((num0 % cont == 0) && (num0 % 2 == 0)){  
                    espar = true;
                    esprimo = false;
                    System.out.println("Es par y no primo");
                }else if ((num0 % cont == 0) && (num0 % 2 == 1)){
                    esprimo = false;
                    espar = false;
                    System.out.println("Es impar y no primo");
                }else if ((num0 % cont == 1) && (num0 % 2 == 1)){
                    esprimo = true;
                    espar = false;
                    System.out.println("Es impar y primo");
                }                     
                
            }  
                                                                                 

}
}
}
        




