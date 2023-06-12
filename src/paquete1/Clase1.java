package paquete1;
//ENCAPSULAMIENTO Y METODOS ACCESORES
/*
ENCAPSULAMIENTO: oculta los atributos y metodos para que unicamente sean ocupados por METODOS de la misma clase
METODOS ACCESORES: GETTERS O SETTERS permite manipular atibutos que esten encapsulados o en PRIVATE
al estos metodos estar dentro de la misma clase en la que fue creado el atributo

SETTERS: establece un valor para el atributo
 */
public class Clase1 {
    private int edad;
    private String nombre;//para ser manipulado por metodos de otra clase se debe escribir sus set y get


    public void setEdad(int edad) {//--->con este set puedo acceder al atributo desde otra clase
        this.edad = edad;
    }

    //Metodo getter: nos permite obtener el atributo para luego mostrarlo en pantalla
    public int getEdad(){
        return edad;
    }
/*
    public void setEdad(atributo con el que se establecera la edad){
    this. atributo=atributo
  }
*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}




