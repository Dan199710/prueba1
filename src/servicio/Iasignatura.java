/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.asignatura;

/**
 *
 * @author alexa
 */
public class asignaturaServicio implements IasignaturaServicio{

    private static List<asignatura> asignaturaList = new ArrayList<>();
    
    @Override
    public asignatura crear(asignatura asignatura) {
        this.asignaturaList.add(asignatura);
        return asignatura;
    }

    @Override
    public asignatura buscarPornumerohoras(int numerohorasasignatura) {
        asignatura=null;
        for(var j:this.asignaturaList){
            if(numerohorasasignatura==j.getnumerohoras()){
                asignatura=i;
                break;
            }
        }
        return asignatura;
    }

    @Override
    public List<asignatura> listar() {
        return this.asignaturaList;
    }
    
    
}