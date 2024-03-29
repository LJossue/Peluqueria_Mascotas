/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Duenio;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author leand
 */
public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        //crear en la BD el dueño
        duenioJpa.create(duenio);

//crear en la BD la mascota
        mascotaJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {

        return mascotaJpa.findMascotaEntities();
    }

    public void eliminarMascota(int numCliente) {
        try {
            mascotaJpa.destroy(numCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int numCliente) {
        return mascotaJpa.findMascota(numCliente);
    }

    public void editarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int idDuenio) {
return duenioJpa.findDuenio(idDuenio);
    }

    public void editarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
