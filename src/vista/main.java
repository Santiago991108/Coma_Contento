/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Control;
import logica.DAO.EncargadoDAO;
import logica.DTO.EncargadoDTO;
import persistencia.conexion;

/**
 *
 * @author bastian
 */
public class main {

    public static void main(String[] args) {
        Control con = new Control();
        con.iniciar();
    }

}