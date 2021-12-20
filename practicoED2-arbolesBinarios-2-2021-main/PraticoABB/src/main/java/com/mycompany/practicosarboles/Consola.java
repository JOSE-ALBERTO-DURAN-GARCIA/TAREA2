/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicosarboles;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArbolesMVias<Integer,String> arbol=new ArbolesMVias<>(4);
        arbol.insertar(80,"1111");
        arbol.insertar(120,"222");
        arbol.insertar(200,"333");
        arbol.insertar(50,"444");
        arbol.insertar(70, "555");
        arbol.insertar(75,"666");
        arbol.insertar(72,"777");
        arbol.insertar(98,"888");
        arbol.insertar(110,"9999");
        arbol.insertar(130,"11111");
        arbol.insertar(140,"22222");
        arbol.insertar(150, "33333");
        arbol.insertar(134, "444444");
        arbol.insertar(160, "555555");
          arbol.insertar(170, "666666");
        arbol.insertar(190, "77777");
        arbol.insertar(158, "888888");
          arbol.insertar(400, "999999");
        arbol.insertar(500, "0000000");
        arbol.insertar(560, "1111122222");
        arbol.eliminarLasHojas();
        System.out.println(arbol.recorridoPorNiveles());
          //System.out.println(arbol.recorridoPorNiveles());
          
          // EL ARBOL MVIAS SE ENCUENTRA CARGADO CON LOS DATOS DE LAS CLASES DE LOS VIDEOS EXPLICATIVOS.
        Scanner entrada=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println(""); 
        System.out.println("*****************************************SELECCION UN NUMERO DE PREGUNTA**************************************** ");
        System.out.println("");
        System.out.println("");
        System.out.println("PREGUNTA 1: TODOS LOS METODOS DE LA INTERFAZ SE ENCUENTRARN IMPLEMENTADOS.");
        System.out.println("PREGUNTA 3: método recursivo que retorne la cantidad de datos no vacíos que hay en el nivel N de un árbol m-vias de búsqueda");
        System.out.println("PREGUNTA 4: método recursivo que retorne la cantidad de nodos hojas en un árbol m vías de búsqueda, pero solo después del nivel N");
        System.out.println("PREGUNTA 5: n método iterativo que retorne la cantidad de datos vacios y no vacíos en un árbol b, pero solo antes del nivel N ");
        System.out.println("PREGUNTA 6: método que retorne verdadero si solo hay hojas en el último nivel de un árbol m-vias de búsqueda. Falso en caso contrario.");
        System.out.println("PREGUNTA 7: método que retorne verdadero si un árbol m-vias esta balanceado según las reglas de un árbol B. Falso en caso contrario. ");
        System.out.println("PREGUNTA 8: método que reciba un dato como parámetro y que retorne cual sería el sucesor inorden de dicho dato, sin realizar el recorrido en inOrden.");
        System.out.println("PREGUNTA 9:  método que retorne verdadero si todos sus nodos no hojas no tienen datos vacíos, falso en caso contrario.");
      
        System.out.println("");
        System.out.println("");
        System.out.print("INGRESE EL NUMERO DE SU PREGUNTA: ");
        String pregunta=entrada.next();
         System.out.println("---------------------------------------------------------------------");
        
        switch(pregunta){
            
            case "2":                 
                 break;     
             case "3":
                 System.out.print("INGRESE EL NIVEL EN EL CUAL SE BUSCARA DATOS NO VACIOS : ");
                 Scanner m=new Scanner(System.in);
                 int n=m.nextInt();
                 System.out.print(arbol.contarDatosNoVaciosEnNivel(n) + " es la cantidad de datos no vacios en el nivel "+ n);
                 break;
             case "4":
                 System.out.print("INGRESE EL NIVEL EN EL CUAL DESEA BUSCAR LAS HOJAS : ");
                 Scanner a=new Scanner(System.in);
                 int niv=a.nextInt();
                 System.out.print(arbol. cantidadDeHojasEnUnNivel(niv) + " es la cantidad de hojas en el nivel "+ niv);
                 break;
             case "5":
                 System.out.print("INGRESE EL HASTA DONDE SE BUSCARA LOS DATOS VACIOS Y NO VACIOS : ");
                 Scanner t=new Scanner(System.in);
                 int nv=t.nextInt();
                 System.out.print(arbol.cantidadDeVaciosYNoVaciosAntesDeN(nv)+ " es la cantidad de datos vacios y no vacion en el nivel "+ nv);
                 break;
             case "6":
                 
                 System.out.print("¿Hay solo hojas al final ?;  "+ arbol. HaySoloHojasAlFinal());
                 break;
             case "7":
                 
                 break;
             case "8":
                 System.out.println("BUSCAR EL SUCESOR EN INORDEN DE :  ");
                 Scanner tt=new Scanner(System.in);
                 int clave=tt.nextInt();
                 System.out.println(arbol.sucesorInOrden(clave)+ " es el sucesor en inOrden de "+ clave);
               
                 break;
                
             case "9":
                 
                 System.out.print("¿TODOS LOS NODOS NO HOJAS NO TIENEN DATOS VACIOS?: "+  arbol.todosLosNosHojasNoTieneVacios());
                 break;
             default :
                 System.out.println("ingrese una opcion valida");
        }
                

        
        
        
        
      
       
     
    }
    
}
