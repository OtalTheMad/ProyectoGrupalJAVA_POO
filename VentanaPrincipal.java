package Main;

import javax.swing.JOptionPane;

public class VentanaPrincipal
{
    public int ConsultaSaldo(int saldo)
    {
        JOptionPane.showMessageDialog(null, "Su saldo es: $" + saldo, "Consulta", JOptionPane.INFORMATION_MESSAGE);
        
        return saldo;
    }
    public int menuMostrar(String user, int opcion)
    {
        JOptionPane.showMessageDialog(null, "Bienvenido usuario: " + user, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opcion para ejecutar \n" + "1. Consulta de Saldo \n" + "2. Retiro o Deposito \n" + "3. Pago de Educacion \n" + "4. Pago de Agua \n", "Menu", JOptionPane.INFORMATION_MESSAGE));

        return opcion;
    }

    public static void main(String[] args)
    {
        String user = "admin"; //Usuario predeterminado.
        int password = 15042022; //Variable de control de la contraseña.
        int saldo = 2836, opcion = 0; //Variables controladoras de las opciones del menú

            try //Try-Catch para evitar cualquier tipo de error en la depuración, ejecución y compilación del programa.
            {
                JOptionPane.showMessageDialog(null, "Ingrese sus credenciales para acceder al cajero", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                user = JOptionPane.showInputDialog(null, "Ingrese su usuario", "Login", JOptionPane.INFORMATION_MESSAGE);
                password = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su contraseña", "Login", JOptionPane.INFORMATION_MESSAGE));
            
                if (user.equals("admin") && password == 15042022) //Ejecución del menú donde se realiza toda la acción del programa.
                {
                    VentanaPrincipal mostrarMenu = new VentanaPrincipal();

                    opcion = mostrarMenu.menuMostrar(user, opcion);

                    switch (opcion)
                    {
                        case 1:
                        {                            
                            VentanaPrincipal mostrarSaldo = new VentanaPrincipal();

                            saldo = mostrarSaldo.ConsultaSaldo(saldo);
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error durante la operacion.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
}
