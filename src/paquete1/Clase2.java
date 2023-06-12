package paquete1;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

        //objeto1.edad=-5; -->no existe una edad -5. Encapsulamiento permite que los datos de una clase NO SEAN MODIFICADOS

        objeto1.setEdad(10);//-->con set se puede establecer una edad a pesar de que el atributo este en privado

        //System.out.println("La edad es: "+edad);--->como edad es un atributo encapsulado, no pude ser llamado desde otro metodo de otra clase

        System.out.println("La edad es: " + objeto1.getEdad());//--->pero si se puede mandar a llamar el metodo get

        objeto1.setNombre("pepito");
        System.out.println("El nombre es: "+objeto1.getNombre());
        //
    }
}
