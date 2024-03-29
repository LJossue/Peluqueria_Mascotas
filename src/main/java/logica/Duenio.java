/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author leand
 */
@Entity
public class Duenio implements Serializable {
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDuenio;
    private String nombre, celDuenio;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String celDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
}
