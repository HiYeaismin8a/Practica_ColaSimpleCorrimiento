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
public class ColaConCorrimiento extends ColaSimple {
   /* public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
  public void inicializararreglo(){        
        cola = new char[tamaño];
    }*/

    public boolean insertar(char valor) {
        if (fin == cola.length - 1) {
            if (ini > 0) {
                int recibe = 0;
                for (int envia = ini; envia <= fin; envia++) {
                    cola[recibe] = cola[envia];
                    recibe++;
                }
                ini = 0;
                fin = recibe - 1;
                //recursividad
                return insertar(valor);
            }
            return false;
        }
        fin ++;
        cola[fin]=valor;
        if(ini ==-1 && fin ==0){
            ini ++;
        }
        return true;
    }

}
