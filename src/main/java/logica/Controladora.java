/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.List;
import persistencia.ControladoraPersistencia;
/**
 *
 * @author leand
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String animal, String raza, String color, String alergico, String atencionEspecial, String observaciones, String nombreDuenio, String celDuenio) {
     
           //creamos el dueño y le asignamos valores

   Duenio duenio = new Duenio();
   duenio.setCelDuenio(celDuenio);
   duenio.setNombre(nombreDuenio);
   
   //creamos la mascota y le asignamos valores
      Mascota masco = new Mascota();
   masco.setNombre(nombreMasco);
   masco.setAnimal(animal);
   masco.setRaza(raza);
   masco.setColor(color);
   masco.setAlergico(alergico);
   masco.setAtencionEspecial(atencionEspecial);
   masco.setObservaciones(observaciones);
    masco.setDuenio(duenio);
    
    controlPersis.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();

    }

    public void eliminarMascota(int numCliente) {
controlPersis.eliminarMascota(numCliente);
    }

 

    public Mascota traerMascota(int numCliente) {
        return controlPersis.traerMascota(numCliente);
    }

    public void editarMascota(Mascota masco, String nombreMasco, String animal, String raza, String color, String alergico, String atencionEspecial, String observaciones, String nombreDuenio, String celDuenio) {
masco.setNombre(nombreMasco);
masco.setAnimal(animal);
masco.setRaza(raza);
masco.setColor(color);
masco.setAlergico(alergico);
masco.setAtencionEspecial(atencionEspecial);
masco.setObservaciones(observaciones);

//modifico la mascota
controlPersis.editarMascota(masco);

//seteo los nuevos valores del dueño
Duenio dueno = this.buscarDuenio(masco.getDuenio().getIdDuenio());
dueno.setCelDuenio(celDuenio);
dueno.setNombre(nombreDuenio);

//llamar al modificar dueño
this.editarDuenio(dueno);
    }

    private Duenio buscarDuenio(int idDuenio) {
return controlPersis.traerDuenio(idDuenio); 

    }

    private void editarDuenio(Duenio dueno) {
        controlPersis.editarDuenio(dueno);
    }
}
