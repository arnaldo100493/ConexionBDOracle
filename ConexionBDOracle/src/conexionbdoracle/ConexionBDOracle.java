package conexionbdoracle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abarrime
 */
public class ConexionBDOracle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controlador controlador = new Controlador();
        String n_linea = args[0];
        System.out.println(controlador.consultarCuentas(n_linea));
    }

}
