/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadores;



public class Jugadores {

    private int idCamiseta;
    private String nombre;
    private String apellidos;
    private int posicion;
    private int edad;
    private String equipo;
    
    
   public Jugadores() {
   }
   
    public Jugadores(int idCamiseta, String nombre, String apellidos, int posicion, int edad, String equipo) {
       this.idCamiseta = idCamiseta;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.posicion = posicion;
       this.edad = edad;
       this.equipo = equipo;
    }
    
       public int getIdCamiseta() {
        return idCamiseta;
    }

    public void setIdCamiseta(int idCamiseta) {
        this.idCamiseta = idCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

}
//</editor-fold>

