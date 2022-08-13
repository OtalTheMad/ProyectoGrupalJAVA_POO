package Main;

import javax.swing.JOptionPane;

public class Transacciones
{
    boolean procesado = false;

    public int ConsultaSaldo(int saldo)
    {
        JOptionPane.showMessageDialog(null, "Su saldo es: $" + saldo, "Consulta", JOptionPane.INFORMATION_MESSAGE);
        
        return saldo;
    }

    public int menuMostrarOpciones(String user, int opcion)
    {
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
        + "2. Deposito de Efectivo \n"
        + "3. Pago de Agua \n"
        + "4. Pago de Educación\n"));

        return opcion;
    }

    public int retiroSaldo(int monto)
    {
        try
        {
            do
            {
                monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de dinero a retirar", "Retiro de Saldo", JOptionPane.INFORMATION_MESSAGE));

                if (monto < 100)
                {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser igual o mayor a $100", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            while (monto < 100);
            
            JOptionPane.showMessageDialog(null, "Transaccion realizada exitosamente", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ArithmeticException quantityZero)
        {
            JOptionPane.showMessageDialog(null,"Operacion Aritmetica no valida.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return monto;
    }

    public int depositoSaldo(int monto)
    {
        long numCuenta;
        
        try
        {
            do
            {
                numCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de cuenta a depositar", "Deposito de Saldo", JOptionPane.INFORMATION_MESSAGE));
                monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de dinero a depositar", "Deposito de Saldo", JOptionPane.INFORMATION_MESSAGE));

                if (numCuenta < 7000)
                {
                    JOptionPane.showMessageDialog(null, "El numero de cuenta debe ser mayor a 7000", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (monto < 100)
                {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a $100", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            while (numCuenta < 7000 || monto < 100);
            
            JOptionPane.showMessageDialog(null, "Transaccion realizada exitosamente a cuenta: " + numCuenta, "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ArithmeticException quantityZero)
        {
            JOptionPane.showMessageDialog(null,"Operacion Aritmetica no valida." + quantityZero, "Error", JOptionPane.WARNING_MESSAGE);
        }
        return monto;
    }

    public int pagoAgua(int monto)
    {
        monto = 85; //Saldo a pagar.

        try
        {
            JOptionPane.showMessageDialog(null, "Saldo a pagar: $" + monto, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ArithmeticException quantityZero)
        {
            JOptionPane.showMessageDialog(null,"Operacion Aritmetica no valida." + quantityZero, "Error", JOptionPane.WARNING_MESSAGE);
        }
        return monto;
    }

    public int pagoEducacion(int monto)
    {
        monto = 3800;
        int opcion; //Control del menu de la función

        try
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una universidad a realizar pago \n"
            + "1. UNAH \n"
            + "2. UNITEC \n"
            + "3. UPNFM \n"
            + "4. USAP \n"
            + "5. UTH \n", "Seleccion", JOptionPane.INFORMATION_MESSAGE));

            switch(opcion)
            {
                case 1:
                {
                    if (JOptionPane.showConfirmDialog(null, "Su pago sera de: $" + monto, "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "Procesando pago...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Pago cancelado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;
                
                case 2:
                {
                    if (JOptionPane.showConfirmDialog(null, "Su pago sera de: $" + monto, "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "Procesando pago...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Pago cancelado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;

                case 3:
                {
                    if (JOptionPane.showConfirmDialog(null, "Su pago sera de: $" + monto, "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "Procesando pago...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Pago cancelado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;

                case 4:
                {
                    if (JOptionPane.showConfirmDialog(null, "Su pago sera de: $" + monto, "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "Procesando pago...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Pago cancelado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;

                case 5:
                {
                    if (JOptionPane.showConfirmDialog(null, "Su pago sera de: $" + monto, "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "Procesando pago...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Pago cancelado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;

                default:
                {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. Por favor, verifique el numero ingresado.", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }

        }
        catch (ArithmeticException quantityZero)
        {
            JOptionPane.showMessageDialog(null,"Operacion Numerica no valida." + quantityZero, "Error", JOptionPane.WARNING_MESSAGE);
        }

        return monto;
    }
}