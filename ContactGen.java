
package MyAgenda;

import java.util.ArrayList;
import java.util.Random;


public class ContactGen {
    
    public static ArrayList<Contacto> contactGen(int n){
         Random r=new Random();
        ArrayList<Contacto> lcontact=new ArrayList<Contacto>();
        String[]nombre={"Miguel","Rosa","Jacko","Stalyn","Joel","Vincent","Jose","Frank","Luis","Juan"};
        
         for(int i=0;i<n;i++){
             Contacto c1=new Contacto();
             c1.setNombre(nombre[r.nextInt(nombre.length)]);
             c1.setTelefon(Integer.toString((int)(Math.random()*1000000000)));
             lcontact.add(c1);
         }
    return lcontact;
    }
    
}
