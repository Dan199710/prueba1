/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Narvaez
 */
public class asignatura {
       
    private String nombre;
    private int numerohoras;
    private String codigo;
    private String tipo;

    public asignatura(String nombre, int numerohoras, String codigo, String tipo) {
        this.nombre = nombre;
        this.numerohoras = numerohoras;
        this.codigo = codigo;
        this.tipo = tipo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnumerohoras () {
        return numerohoras;
    }

    public void setnumerohoras (int numerohoras ) {
        this.numerohoras = numerohoras;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo ) {
        this.codigo = codigo;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String posicion) {
        this.tipo = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", cedula=" + numerohoras 
                + ", disciplina=" + codigo + ", posicion=" + tipo+ '}';
    }
   }
