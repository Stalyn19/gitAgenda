/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyAgenda;

/**
 *
 * @author Stalyn Rosario
 */
public class Contacto {
   
private String nombre; 
private String telefono; 

public Contacto(String nom, String tel){ 
nombre=nom; 
telefono=tel; 
} 
public Contacto(){ 
} 
//Metodos Setter y Getters 

public void setNombre(String nom){ 
this.nombre=nom;
} 

public void setTelefon(String tel){
this.telefono=tel;
} 

public String getNombre(){ 
return this.nombre;
} 
public String getTelefon(){
return this.telefono;
} 

//Metodo toString

public void imprime(){
    System.out.println("Nombre: "+this.getNombre()+" Telefono: "+this.getTelefon());
   
}
  
}
