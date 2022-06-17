/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import modelo.asignatura;
import servicio.asignaturaServicio;

/**
 *
 * @author Daniel Narvaez
 */
public class asignatura_control {
    private final asignaturaServicio asignaturaservicio = new asignaturaServicio();
    
    public asignatura crear(String[]args){
        var asignatura= new asignatura(args[0],Integer.valueOf(args[1]),args[2],args[3]);
        this.asignaturaservicio.crear(asignatura);
        return asignatura;
    }
    
    public List<asignatura>listar(){
        return this.asignaturaservicio.listar();
    }
    
}
