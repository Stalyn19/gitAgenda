
package MyAgenda;


import java.util.Scanner;

public class MyAgenda {

  
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);    
        
            
            Agenda c1=new Agenda();
      
 
 
int opt = 0;
 do{
     c1.menu();
     
 
 
         opt =sc.nextInt();
    

 switch(opt){
     case 1://Agregar contacto
         System.out.println("Agregar contacto\n");
         System.out.println("Ingresa Nombre");
         String n=sc.next();
         System.out.println("Ingresa Telefono");
         String t=sc.next();
         
          
         System.out.println(c1.agregarContacto(n,t));
    
         
         break;
     case 2://Borrar Contacto
         System.out.println("Ingresa Nombre");
         String n1=sc.next();
         
         
         
         System.out.println(c1.eliminarContacto(n1));
         break;
     case 3://Buscar contacto
         
         System.out.println("Ingresa Nombre");
         String n2=sc.next();
         c1.buscarContacto(n2);
         break;    
     case 4://Mostrar Lista
         c1.showContactos();
         break;
     case 5://Borrar lista
         c1.borrarLista();
         break; 
         
    case 6://Salida del programa
        
        System.out.println("Escribe nombre");
            String nom=sc.next();
    
            c1.editarContacto(nom);
         break; 
        
        case 7: //Metodo auxiliar
            System.out.println("La agenda se ha cerrado");
        opt=7;
        
         break;
         
         case 8: //Metodo auxiliar
            System.out.println("La agenda se ha cerrado");
        c1.generar(50);
        
         break; 
     default:
         System.out.println("Numero incorrecto intentan de nuevo");
 }
 }while(opt!=7);
 
       
    }
    
}
