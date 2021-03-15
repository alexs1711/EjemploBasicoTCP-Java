/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author L3X
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaramos las variables con las que vamos a trabajar*/
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
            
        final int puerto = 5000;
        
            try {
                //creamos socket de servidor
                servidor = new ServerSocket(puerto);
                System.out.println("Servidor iniciado");
                
                
                    //cuando el cliente solicita conexion
                    sc = servidor.accept();
                    System.out.println("Cliente conectado");
                    
                    //recibe el input stream del socket
                    in = new DataInputStream(sc.getInputStream());
                    out = new DataOutputStream(sc.getOutputStream());
                    
                    String mensaje=in.readUTF();
                    
                    System.out.println(mensaje);
                    
                    out.writeUTF("Servidor dice hola");
                    //cerramos la conexion del cliente
                    sc.close();
                    System.out.println("Servidor cerrado");
                     
                
                } catch (Exception e) {
            }
    }
    
}
