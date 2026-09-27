/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1.hospital;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author JHEY
 */
public class T1Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Paciente p1 = new Paciente ();
        
        String rpta= ("si");
        PacienteControler control = new PacienteControler();
        while(rpta.equalsIgnoreCase("si")){
            
            
            System.out.println("INGRESAR TIPO DE DOCUMENTO");
            String tipo =sc.nextLine();
            p1.setTipo_Doc(tipo);
        
            System.out.println("INGRESAR NUMERO DE DOCUMENTO");
            String  nro =sc.nextLine();
            p1.setNro_Doc(nro);
        
            System.out.println("INGRESAR NOMBRE");
            String  nom =sc.nextLine();
            p1.setNombre(nom);
        
            System.out.println("INGRESAR APELLIDO PATERNO");
            String  pat =sc.nextLine();
            p1.setApellido_Paterno(pat);
        
            System.out.println("INGRESAR APELLIDO MATERNO");
            String  mat =sc.nextLine();
            p1.setApellido_Materno(mat);
            
            
            System.out.println("INGRESAR NUMERO DE CELULAR");
            String  cel =sc.nextLine();
            p1.setNro_celular(0);
            
            System.out.println("INGRESAR CORREO");
            String  correo =sc.nextLine();
            p1.setCorreo(correo);
            
            System.out.println("INGRESAR FECHA DE NACIMINETO");
            //para escribir ya 
            String  fecha =sc.nextLine();
            p1.setFecha_nacimiento(LocalDate.parse(fecha));
            
            System.out.println("INGRESAR ALERGIAS");
            //para escribir ya 
            String  alergias =sc.nextLine();
            p1.setAlergias(alergias);
        
            control.agregarpersona(p1);
                System.out.println("desea ingresar otra persona: si/no");
                rpta=sc.nextLine();

        }
         control.listar(); 
    }
        
}
