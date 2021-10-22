/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import jugadores.Jugadores;
import java.util.Scanner;
import java.util.Set;   

/**
 *
 * @author USUARIO
 */
public class Equipo {
    
    public static void main(String[] args){
    
        Scanner entrada = new Scanner (System.in);
        
        int opcion;
        int contador = 0;
        int cantidad;
       
        
        System.out.println("Bienvenido");
        System.out.println("Digite la cantidad de jugadores a registrar");
        cantidad=entrada.nextInt();
        
        Jugadores [] jugador = new Jugadores[cantidad];
        
        do{
            System.out.println("BIENVENIDOS");
            System.out.println("");
            System.out.println("1.Agregar jugador");
            System.out.println("2.Buscar jugador por # de camiseta");
            System.out.println("3.Editar informacion ");
            System.out.println("4.Ver convocatoria total de jugadores");
            System.out.println("5.Salir");
            System.out.println("");
            System.out.println("Digite su opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
            
                case 1:
                 
                 jugador [contador]= new Jugadores();  
                
                    System.out.println("Digite el numero de camiseta: ");
                    jugador[contador].setIdCamiseta(entrada.nextInt());
                    System.out.println("Digite el nombre: ");
                    jugador[contador].setNombre(entrada.next());
                    System.out.println("Digite los apellidos: ");
                    jugador[contador].setApellidos(entrada.next());
                    System.out.println("Digite la posicion:");
                    jugador[contador].setPosicion(entrada.nextInt());
                    System.out.println("Digite la edad: ");
                    jugador[contador].setEdad(entrada.nextInt());
                    System.out.println("Digite el nombre del equipo: ");
                    jugador[contador].setEquipo(entrada.next());
                
                    contador ++;
                    
                    break;
                
                case 2:
                 
                    System.out.println("Digite el numero de la camiseta");
                    int camiseta = entrada.nextInt();
                    
                       for (int i = 0; i < contador ; i++) {
                           
                           if (camiseta==jugador[i].getIdCamiseta()){
                               
                               System.out.println("El jugador es:"+ camiseta);
                           
                           }else{
                           
                               System.out.println("No existe el jugador " + camiseta);
                           }
                        
                    }
 
                       
                       
                    break;
                
                 case 3:
                    
                       System.out.println("Digite el numero de la camiseta del jugador que desea editar: ");
                       int idCamiseta = entrada.nextInt();
                       
                       for (int i = 0; i < contador; i++) {
                        if(idCamiseta== jugador[i].getIdCamiseta()){
                            
                            jugador [contador]= new Jugadores();
                            
                                System.out.println("Digite el numero de camiseta: ");
                                jugador[contador].setIdCamiseta(entrada.nextInt());
                                System.out.println("Digite el nombre: ");
                                jugador[contador].setNombre(entrada.next());
                                System.out.println("Digite los apellidos: ");
                                jugador[contador].setApellidos(entrada.next());
                                System.out.println("Digite la posicion:");
                                jugador[contador].setPosicion(entrada.nextInt());
                                System.out.println("Digite la edad: ");
                                jugador[contador].setEdad(entrada.nextInt());
                                System.out.println("Digite el nombre del equipo: ");
                                jugador[contador].setEquipo(entrada.next());

                                contador ++;
                           
                         }else{
                            System.out.println("No existe");
                           }                        
                        
                        }
                    break;
                    
                case 4:
                    
                      for (int i = 0; i < contador; i++) {
                        System.out.println("La cantidad de jugadores son: "+jugador[i].getNombre());   
                    }
                    break;
                    
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
                    break;
                        }
            
        }while(opcion!=5);
    }
}
