
package MyAgenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Agenda extends Contacto{
    private ArrayList<Contacto> contactos; 

    public Agenda(){ 
contactos=new ArrayList<>(); 
} 

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }


public void buscarContacto(String nom){ //Reparado
    Iterator<Contacto> it= contactos.iterator();
        
      while(it.hasNext()){
       Contacto c=it.next();
       
      if(c.getNombre().compareTo(nom)==0){
            c.imprime();
      }
      
       }
        if(this.encontrado(nom)==false){
            System.out.println("No se Encuentra el Contacto");
        }
}


public boolean encontrado(String nom){ //Ya funciona con el iterator


     Iterator <Contacto> it= contactos.iterator(); 
     
     while(it.hasNext()){
         if(it.next().getNombre().compareTo(nom)==0){
             return true;
           }
     }
    return false;
} 


public String agregarContacto(String nom, String tel){ //Resuelto

 Iterator<Contacto> it= contactos.iterator();
       
       Contacto c=new Contacto(nom,tel);
        while(it.hasNext()&&this.encontrado(nom)==true){
        return "Contacto Existe";
        
       }
      
      contactos.add(c);
      return "Contacto Agregado";
          
}

        
public String eliminarContacto(String nom){ //No esta funcionando solo elimina el 1ro de la lista
   
     Iterator<Contacto> it= contactos.iterator();
        
      while(it.hasNext()){
       Contacto c=it.next();
       
      if(c.getNombre().compareTo(nom)==0){
            contactos.remove(c);
      return "Contacto Eliminado";}     
       }
      return "Contacto no Existe";
} 

public void showContactos(){ //Funciona

   
    Iterator <Contacto> it= contactos.iterator();   
    
    while(it.hasNext()){
       it.next().imprime();
    }
    if(contactos.isEmpty()){
        System.out.println("Esta lista esta vacia");
    }
    


}

public void borrarLista(){//funciona
    contactos.clear();
    
    if(contactos.isEmpty()){
        System.out.println("Esta lista Esta vacia");
    }
}

public void editarContacto(String nom){//Funciona: destruye el anterior y crea uno nuevo
       Scanner sc=new Scanner(System.in);
       
       
        if(this.encontrado(nom)==true){
         this.eliminarContacto(nom);
          System.out.println("Nuevo Nombre");
        String nombre=sc.next();
        System.out.println("Nuevo Telefono");
        String telefono=sc.next();
         Contacto c=new Contacto(nombre,telefono);
         System.out.println("El contacto ha sido actualizado");
         contactos.add(c);
      
       }else{
         
        

            System.out.println("Contacto No existe");}
    }

public void menu(){
    System.out.println("|----------------------|");
    System.out.println("|Bienvenido a tu AGENDA|");
    System.out.println("|1- Agreegar Contacto  |");
    System.out.println("|2-Borrar Contacto     |");
    System.out.println("|3-Buscar Contacto     |");
    System.out.println("|4-Ver Lista           |");
    System.out.println("|5-Borrar Lista        |");
    System.out.println("|6-Editar Contacto     |");
    System.out.println("|7-Salir               |");
    System.out.println("|----------------------|");
}

public ArrayList<Contacto> generar(int i){
return contactos=ContactGen.contactGen(i);
}
}

