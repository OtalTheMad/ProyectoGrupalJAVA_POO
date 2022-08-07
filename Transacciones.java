package Main;

import javax.swing.JOptionPane;

public class Transacciones
{
    public int ConsultaSaldo(int saldo)
    {
        JOptionPane.showMessageDialog(null, "Su saldo es: $" + saldo, "Consulta", JOptionPane.INFORMATION_MESSAGE);
        
        return saldo;
    }
    public int menuMostrarOpciones(String user, int opcion)
    {
        JOptionPane.showMessageDialog(null, "Bienvenido usuario: " + user, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opcion para iniciar \n" 
        + "1. Consulta de Saldo \n" 
        + "2. Retiro o Deposito \n" 
        + "3. Salir \n", "Menu", JOptionPane.INFORMATION_MESSAGE));

        return opcion;
    }
    public int menuMostrarTransacciones(int opcion)
    {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opcion \n" 
        + "1. Retiro de Efectivo \n" 
        + "2. Deposito de Efectivo"));

        return opcion;
    }
    public int retiroSaldo(int monto)
    {
        monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de dinero a retirar", "Retiro de Saldo", JOptionPane.INFORMATION_MESSAGE));

        return monto;
    }
    public int depositoSaldo(int monto)
    {
        long numCuenta;

        numCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de cuenta a depositar", "Deposito de Saldo", JOptionPane.INFORMATION_MESSAGE));
        monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de dinero a depositar", "Deposito de Saldo", JOptionPane.INFORMATION_MESSAGE));

        return monto;
    }
}