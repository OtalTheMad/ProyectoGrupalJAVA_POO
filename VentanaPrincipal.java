package Main;

import javax.swing.JOptionPane;

public class VentanaPrincipal
{
    static boolean login = false; //Declaración para ciclar el login de manera correcta.
    int total;

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
        JOptionPane.showMessageDialog(null, "Digite el numero de cuenta a depositar", "Deposito de Saldo", JOptionPane.INFORMATION_MESSAGE);
        monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de dinero a depositar", "Deposito de Saldo", JOptionPane.INFORMATION_MESSAGE));

        return monto;
    }

    public static void main(String[] args)
    {
        String user = "admin", password = "Password01"; //Variable de control de la contraseña.
        String loginUser, loginPassword;
        int total, saldo = 2836, opcion = 0, monto = 0; //Variables controladoras
        boolean reiniciar = true;

            try //try-Catch para evitar cualquier tipo de error en la depuración, ejecución y compilación del programa.
            {
                JOptionPane.showMessageDialog(null, "Ingrese sus credenciales para acceder al cajero", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                while (!login)
                {
                    VentanaPrincipal mostrarMenu = new VentanaPrincipal();

                    loginUser = JOptionPane.showInputDialog(null, "Ingrese su usuario", "Login", JOptionPane.INFORMATION_MESSAGE);
                    loginPassword = JOptionPane.showInputDialog(null, "Ingrese su contraseña", "Login", JOptionPane.INFORMATION_MESSAGE);
                
                    if (loginUser.equals(user) && (loginPassword.equals(password))) //Ejecución del menú donde se realiza toda la acción del programa.
                    {
                        login = true; //Variable cambia a verdadero wpara poder detener el ciclo infinito.
                        
                        do //Controlador del reinicio del ciclo para operar tantas veces sea necesario para el usuario.
                        {
                            opcion = mostrarMenu.menuMostrarOpciones(user, opcion);

                            switch (opcion)
                            {
                                case 1:
                                {                            
                                    VentanaPrincipal mostrarSaldo = new VentanaPrincipal();

                                    saldo = mostrarSaldo.ConsultaSaldo(saldo);
                                }
                                break;

                                case 2:
                                {
                                    VentanaPrincipal menuTransacciones = new VentanaPrincipal();

                                    opcion = menuTransacciones.menuMostrarTransacciones(opcion);

                                    switch (opcion) //Opciones internas para el retiro o deposito de saldo de usuario.
                                    {
                                        case 1: //Retiro de Saldo
                                        {
                                            VentanaPrincipal retirarSaldo = new VentanaPrincipal();

                                            monto = retirarSaldo.retiroSaldo(monto);
                                            total = saldo - monto;
                                            JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + total, "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                                            saldo = total;
                                        }
                                        break;

                                        case 2: //Deposito de Saldo
                                        {
                                            VentanaPrincipal depositarSaldo = new VentanaPrincipal();

                                            monto = depositarSaldo.depositoSaldo(monto);
                                            total = saldo - monto;
                                            JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + total, "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                                            saldo = total;
                                        }
                                        break;
                                    }
                                }
                                break;
                                
                                case 3:
                                {
                                    JOptionPane.showMessageDialog(null, "Ha salido exitosamente.", "Salida", JOptionPane.INFORMATION_MESSAGE);
                                    reiniciar = false;
                                }
                                break;

                                default:
                                {
                                    JOptionPane.showMessageDialog(null, "Opcion no valida.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        while(reiniciar); //Mientras reiniciar sea verdadero, se reiniciará el ciclo del menú.
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
                        login = false;
                    }
                }

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error durante la operacion. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
}