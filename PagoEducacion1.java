package Main;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class PagoEducacion1 {

    public static void main(String[] args) {
        // Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int pago = 0, recibo = 0, respuesta;
        float opcion = 0, cuenta = 0, cantidad = 0;
        // Menu de Universidades
        JOptionPane.showMessageDialog(null, "Bienvenido al cajero de pago de Educacion");
        System.out.println("Elegia la Universidad a pagar:");
        System.out.println("1.UTH\n"
                + "2.UNITEC\n"
                + "3.UNAH\n"
                + "4.CEUTEC\n"
                + "5.Universidad Metropolitana\n"
                + "6.Universidad Catolica de Honduras");
        respuesta = entrada.nextInt();

        // Uso de switch
        switch (respuesta) {

            case 1:
                System.out.println("UNIVERSIDAD TECNOLOGICA DE HONDURAS");
                System.out.println("Eliga una opciÃ³n");
                System.out.println("1.mensualidad\n"
                        + "2.matricula\n"
                        + "3.ReposiciÃ³n\n"
                        + "4.Recuperacion");

                opcion = entrada.nextInt();
                if (opcion == 1) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 2) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }

                if (opcion == 3) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                } else {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                }
                break;
            case 2:
                System.out.println("UNITEC");
                System.out.println("Eliga una opción");
                System.out.println("1.mensualidad\n"
                        + "2.matricula\n"
                        + "3.ReposiciÃ³n\n"
                        + "4.Recuperacion");
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 2) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 3) {
                    // Solicitud de datos usando JOptionPane

                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                } else {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                }
                break;
            case 3:
                System.out.println("UNIVERSIDAD NACIONAL AUTONOMA DE HONDURAS");
                System.out.println("Eliga una opción");
                System.out.println("1.mensualidad\n"
                        + "2.matricula\n"
                        + "3.ReposiciÃ³n\n"
                        + "4.Recuperacion");
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 2) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }

                if (opcion == 3) {
                    // Solicitud de datos usando JOptionPane
                    System.out.println("Ingrese numero de cuenta:");
                    cuenta = entrada.nextInt();
                    System.out.println("Ingrese la cantidad a depositar:");
                    cantidad = entrada.nextInt();
                    System.out.println("Gracas por usar nuestro cajero");
                    break;
                } else {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                }
                break;
            case 4:
                System.out.println("CEUTEC");
                System.out.println("Eliga una opción");
                System.out.println("1.mensualidad\n"
                        + "2.matricula\n"
                        + "3.ReposiciÃ³n\n"
                        + "4.Recuperacion");
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 2) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 3) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                } else {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                }
                break;
            case 5:
                System.out.println("Universidad Metropolitana");
                System.out.println("Eliga una opción");
                System.out.println("1.mensualidad\n"
                        + "2.matricula\n"
                        + "3.ReposiciÃ³n\n"
                        + "4.Recuperacion");
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 2) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 3) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                } else {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                }
                break;
            case 6:
                System.out.println("Universidad Catolica de Honduras");
                System.out.println("Eliga una opcion");
                System.out.println("1.mensualidad\n"
                        + "2.matricula\n"
                        + "3.ReposiciÃ³n\n"
                        + "4.Recuperacion");
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 2) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                }
                if (opcion == 3) {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                    break;
                } else {
                    // Solicitud de datos usando JOptionPane
                    cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta:"));

                    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));

                    JOptionPane.showMessageDialog(null, "Gracas por usar nuestro cajero");
                }
        }

    }

}
