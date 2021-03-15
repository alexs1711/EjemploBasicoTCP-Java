/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L3X
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El cliente necesita saber la localizacion del servidor*/
        final String HOST="127.0.0.1";
        final int PUERTO =5000;
        /*Declaramos dos variables con las que vamos a enviar y recibir datos*/
        DataInputStream in;
        DataOutputStream out;
             
        try {
            /*TCP trabaja con sockets*/
            Socket sc = new Socket(HOST,PUERTO);
             
            /*Recibimos/enviamos los flujos de datos al socket servidor*/
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            /*escribimos un texto en el outputstream el cual es enviado al servidor/recibido por el servidor*/
            out.writeUTF("Hola desde el cliente");
            /*Guardamos en una variable String el valor enviado por el servidor/recibido por el cliente*/
            String mensaje = in.readUTF();
            /*Vemos el texto en la consola*/
            System.out.println(mensaje);
            /*Cerramos la conexion*/
            sc.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
