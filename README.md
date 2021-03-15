# EjemploBasicoTCP-Java
Son dos clases Java que se conectan mediante el método TCP, el cual podría ser extendido a conexiones remotas pero por el momento solo trabaja con el localhost

Lo primero seria explicar las caracteristicas del metodo TCP, un metodo de transmision de datos que envia ordenadamente cada dato:
  -Confirma que los datos lleguen en el mismo orden en el que han sido enviados.
  -Confirma que todos los datos hayan sido recibidos, de lo contrario nos da un error.
  -Requiere que una de las partes de la conexion este siempre a la escucha.
  -Es mas lento que UDP debido a la necesidad de confirmacion de conexión y el envio ordenado de paquetes.
  
 Por lo tanto lo que se va a mostrar en este pequeño ejemplo java es como enviar un texto desde un hilo java a otro hilo java.
