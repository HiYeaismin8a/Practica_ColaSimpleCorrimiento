/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author HiYeaismin 8a
 */
public class ColaSimple {
    protected char []cola;
    protected int ini= -1;
    protected int tamaño;
    protected int fin =-1;
    protected char valorEliminado;
    
  

    
    public boolean insertar (char valor ){
        if(fin == cola.length-1){
            //Está llena
            return false;
        }
        fin ++;
        cola[fin]=valor;
        //se genera un solo elemento.
        //cuando la cola está vacía y se le inserta un elemento, aumenta ini.
        //condición de un solo elemento.
        if(fin ==0 && ini==-1){
            ini++;
        }
        return true;
    }
    
    
    public boolean eliminar(){
        if(ini ==-1 && fin==-1){
            return false;
        }
        valorEliminado= cola[ini];
        if(ini ==fin && ini !=-1){
            ini=-1;
            fin=-1;
            return true;
        }
        ini ++;
        return true;
    }
    
    
    public char valorEliminador(){
        return valorEliminado;
    }
    
    
    public int valorIni(){
        return ini;
    }
    
   public int valorFin(){
       return fin;
   }
   
   public char[] contenidoCola(){
       return cola;
   }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
  public void inicializararreglo(){        
        cola = new char[tamaño];
    }
}
