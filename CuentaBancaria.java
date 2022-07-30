package Main;

import java.util.*;
import javax.swing.JOptionPane;

public class CuentaBancaria {
    public String nombre;
    public String nrocuenta;
    public String dni;
    public double saldo;

    // Constructor de la clase cuenta bancaria
    public CuentaBancaria(String cuentanum, String Nombre, String id, double saldo_disponible) {
        this.nrocuenta = cuentanum;
        this.nombre = Nombre;
        this.dni = id;
        this.saldo = saldo_disponible;
    }

    // Metodos obtener(get)

    public String getCuenta() {
        return nrocuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos a realizar

    public void retirar(double monto) {
        if (monto < getSaldo()) {
            saldo = getSaldo() - monto;
            System.out.println("Su retiro fue un exito!!");
            ConsultaSaldo();
            // Con JOptionPane
            /*
             * JOptionPane.showMessageDialog(null, "Su retiro fue un exito");
             * 
             */
        } else {
            System.out.println("Transaccion no permitida, monto insuficiente para este retiro");
            // Con JOptionPane
            /*
             * JOptionPane.showMessageDialog(null,
             * "Transaccion no permitida,monto insuficiente para este retiro, favor consulta su saldo disponible"
             * );
             */
        }

    }

    public void deposito(double monto) {
        saldo += monto;
        System.out.println("Su deposito se realizo con exito!!!");

        // Con JOptionPane
        // JOptionPane.showMessageDialog(null, "Su deposito se realizo con exito!!");
        ConsultaSaldo();
    }

    public void ConsultaSaldo() {
        System.out.println("************ESTADO DE CUENTA************\n");
        System.out.println("Nombre :  " + getNombre() + "\n" + "Cuenta Numero :  " + getCuenta() + "\n");
        System.out.print("Saldo disponible : Lps.  " + getSaldo() + "\n");

        // Con JOptionPane
        /*
         * JOptionPane.showMessageDialog(null, "\t\t\tESTADO DE CUENTA\n" + "Nombre :  "
         * + getNombre() + "\n");
         * JOptionPane.showMessageDialog(null, "Cuenta Numero :  " + getCuenta() + "\n"
         * + "Saldo disponible : Lps.  " + getSaldo() + "\n");
         */
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Nombre = "Juan Robando Hernandez";
        String cuenta, dni;
        double Saldo = 25000.00;
        int transaccion;
        System.out.println("Deme su DNI porfavor : ");
        dni = entrada.nextLine();
        System.out.println("Deme su numero de cuenta porfavor : ");
        cuenta = entrada.nextLine();
        System.out.println(
                "Bienvenido " + Nombre + " diga que desea realizar\n 1. Deposito\n 2.Retiro\n3.Consultar saldo");
        transaccion = entrada.nextInt();
        CuentaBancaria cuenta1 = new CuentaBancaria(cuenta, Nombre, dni, Saldo);
        if (transaccion == 1) {
            System.out.println("Monto a depositar (> 0)");
            double monto = entrada.nextDouble();
            if (monto > 0) {
                cuenta1.deposito(monto);
                // cuenta1.ConsultaSaldo();
            } else
                System.out.println("Cantidad no valida");
        } else if (transaccion == 2) {
            System.out.println("Monto a retirar");
            double monto = entrada.nextDouble();
            if (monto > 0) {
                cuenta1.retirar(monto);
            } else
                System.out.println("Cantidad no valida");
        } else if (transaccion == 3) {
            cuenta1.ConsultaSaldo();
        } else
            System.out.println("Dato no valido, favor ingrese una opcion correcta");

        //
    }

}
