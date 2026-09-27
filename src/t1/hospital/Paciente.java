/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1.hospital;

import java.time.LocalDate;

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
    private LocalDate fecha_nacimiento;
    private String alergias;

    public Paciente(String tipo_Doc, String nro_Doc, String nombre, String apellido_Paterno, String apellido_Materno, int nro_celular, String correo, String fecha_nacimiento, String alergias) {
        this.tipo_Doc = tipo_Doc;
        this.nro_Doc = nro_Doc;
        this.nombre = nombre;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.nro_celular = nro_celular;
        this.correo = correo;
        //this.fecha_nacimiento = fecha_nacimiento;
        this.alergias = alergias;
    }

    public Paciente() {
    }
    
    
    

    public String getTipo_Doc() {
        return tipo_Doc;
    }

    public void setTipo_Doc(String tipo_Doc) {
        if (tipo_Doc == null) {
            throw new IllegalArgumentException("El tipo de documento no puede ser nulo.");
        }
        String tipoNorm = tipo_Doc.trim().toUpperCase();
        if (!tipoNorm.equals("DNI") && !tipoNorm.equals("CE")) {
            throw new IllegalArgumentException("Tipo de documento inválido. Debe ser 'DNI' o 'CE'.");
        }
        this.tipo_Doc = tipoNorm;
    }

    public String getNro_Doc() {
        return nro_Doc;
    }

    public void setNro_Doc(String nro_Doc) {
        if (nro_Doc == null || this.tipo_Doc == null) {
            throw new IllegalArgumentException("Primero define el tipo de documento antes de asignar el número.");
        }
        
        String docClean = nro_Doc.trim();

        if (this.tipo_Doc.equals("DNI")) {
            if (!docClean.matches("\\d{8}")) {
                throw new IllegalArgumentException("El DNI debe tener exactamente 8 dígitos numéricos.");
            }
        } else if (this.tipo_Doc.equals("CE")) {
            if (!docClean.matches("[a-zA-Z0-0]{9,12}")) {
                throw new IllegalArgumentException("El CE debe tener entre 9 y 12 caracteres alfanuméricos.");
            }
        }
        
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
        if (nro_celular == null || !nro_celular.matches("\\d{9}")) {
            throw new IllegalArgumentException("El número de celular debe tener exactamente 9 dígitos.");
        }
        this.nro_celular = nro_celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || !correo.contains("@") || !correo.toLowerCase().endsWith(".com")) {
            throw new IllegalArgumentException("El correo debe incluir '@' y terminar en '.com'.");
        }
        this.correo = correo;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    public void verDatos(){
        System.out.println("TIPO DOCUMENTO: "+this.tipo_Doc+ 
                "NUMERO DOCUMENTO: "+this.nro_Doc+
                "NOMBRE: "+this.nombre+
                "APELLIDO PATERNO: "+this.apellido_Paterno+
                "APELLIDO MATERNO: "+this.apellido_Materno+
                "NUMERO CELULAR: "+this.nro_celular+
                "CORREO: "+this.correo+
                "FECHA NACIMIENTO: "+this.fecha_nacimiento+
                "ALERGIAS: "+this.alergias);
    }
}
