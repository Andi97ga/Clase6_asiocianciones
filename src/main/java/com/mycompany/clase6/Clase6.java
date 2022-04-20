/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase6;

/**
 *
 * @author User
 */
public class Clase6 {

    public static void main(String[] args) {
        var propietario = new Persona();
        propietario.cedula="0105069706";
        propietario.nombre="Juan";
        propietario.fechaNacimiento=1997;
        var Operadora = new OperadoraTelefonica();
        Operadora.codigo=252948;
        Operadora.descripcion="Tuenti";
        Operadora.paginaWeb="www.tuamigofiel.com";
        System.out.println("Dueño de la linea :"+propietario.nombre);
        System.out.println("Con numero de cedula :"+propietario.cedula);
        var linea = new Telefono();
        linea.numero="0981675703";
        linea.tipo="Movil";
        System.out.println("Numero :"+linea.numero+" operadora "+ Operadora.descripcion);
       
    }
}
