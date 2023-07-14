/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CASO_2;

/**
 *
 * @author sebas
 */
public class Plataforma {
    public int dinero;
    public String nombre;

    public int getDinero() {
        return dinero;
    }
    public String getNombre() {
        return nombre;
    }
    public void transaction(){
        Facade.purchase(this);
    }
    public void otherOperation(){
        ////////////////
    }
    
    public class Web extends Plataforma{
    
    }
    public class Móvil extends Plataforma{
    
    }
    public class Telefónica extends Plataforma{
    
    }
    
}
