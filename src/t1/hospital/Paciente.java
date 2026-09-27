/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1.hospital;

/**
 *
 * @author JHEY
 */
public class Paciente {
    private String tipo_Doc;
    private String nro_Doc;
    private String nombre;
    private String apellido_Paterno;
    private String apellido_Materno;
    private int nro_celular;
    private String correo;
    private String fecha_nacimiento;
    private String alergias;

    public Paciente(String tipo_Doc, String nro_Doc, String nombre, String apellido_Paterno, String apellido_Materno, int nro_celular, String correo, String fecha_nacimiento, String alergias) {
        this.tipo_Doc = tipo_Doc;
        this.nro_Doc = nro_Doc;
        this.nombre = nombre;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.nro_celular = nro_celular;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.alergias = alergias;
    }
    
    
    

    public String getTipo_Doc() {
        return tipo_Doc;
    }

    public void setTipo_Doc(String tipo_Doc) {
        this.tipo_Doc = tipo_Doc;
    }

    public String getNro_Doc() {
        return nro_Doc;
    }

    public void setNro_Doc(String nro_Doc) {
        this.nro_Doc = nro_Doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

    public int getNro_celular() {
        return nro_celular;
    }

    public void setNro_celular(int nro_celular) {
        this.nro_celular = nro_celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    
}
