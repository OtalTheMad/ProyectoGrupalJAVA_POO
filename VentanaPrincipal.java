package Main;

import javax.swing.JOptionPane;

public class VentanaPrincipal
{
    static boolean login = false; //Declaración para ciclar el login de manera correcta.
    int total;
    static int limite[] = new int[3]; //Limitador de transacciones dentro de una sola operacion.


    public static void main(String[] args)
    {
        String user = "admin", password = "Password01"; //Variable de control del usuario y la contraseña correctos.
        String loginUser, loginPassword; //Variables controladoras de las credenciales ingresadas.
        int total, saldo = 2836, opcion = 0, monto = 0; //Variables controladoras
        boolean reiniciar = true;

            try //try-Catch para evitar cualquier tipo de error en la depuración, ejecución y compilación del programa.
            {
                JOptionPane.showMessageDialog(null, "Ingrese sus credenciales para acceder al cajero", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                while (!login) //Si el login es falso, el programa no continuará el flujo normal.
                {
                    Transacciones mostrarMenu = new Transacciones();

                    loginUser = JOptionPane.showInputDialog(null, "Ingrese su usuario", "Login", JOptionPane.INFORMATION_MESSAGE);
                    loginPassword = JOptionPane.showInputDialog(null, "Ingrese su contraseña", "Login", JOptionPane.INFORMATION_MESSAGE);
                
                    if (loginUser.equals(user) && (loginPassword.equals(password))) //Validación del usuario y contraseña, de lo contrario mostrará un error con credenciales incorrectas.
                    {
                        login = true; //Variable cambia a verdadero para poder detener el ciclo infinito.
                        
                        do //Controlador del reinicio del ciclo para operar tantas veces sea necesario para el usuario.
                        {
                            opcion = mostrarMenu.menuMostrarOpciones(user, opcion); //Método con parámetros de usuario y la opción elegida en el mismo para juzgar hacia dónde irá el programa.

                            switch (opcion)
                            {
                                case 1:
                                {                            
                                    Transacciones mostrarSaldo = new Transacciones();

                                    saldo = mostrarSaldo.ConsultaSaldo(saldo); //Asignación del nuevo valor a la variable 'saldo'.
                                }
                                break;

                                case 2:
                                {
                                    Transacciones menuTransacciones = new Transacciones();

                                    opcion = menuTransacciones.menuMostrarTransacciones(opcion); //Asignación de valor a la variable 'opcion'.

                                    for (int i = 0; i < limite.length;) //Controlador del limite de transacciones que el usuario puede realizar antes de bloquearlas por seguridad.
                                    {
                                        limite[i]++; //Incremento del arreglo 'limite' que previene más transacciones de usuario, por seguridad.

                                        switch (opcion) //Opciones internas para el retiro o deposito de saldo de usuario.
                                        {
                                            case 1: //Retiro de Saldo de la cuenta principal.
                                            {
                                                if (limite[i] >= 3)
                                                {
                                                    JOptionPane.showMessageDialog(null, "Limite de transacciones alcanzado.", "Alerta", JOptionPane.WARNING_MESSAGE);
                                                }
                                                else
                                                {
                                                    Transacciones retirarSaldo = new Transacciones();

                                                    monto = retirarSaldo.retiroSaldo(monto);
                                                    total = saldo - monto;
                                                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + total, "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                                                    saldo = total;
                                                }
                                            }
                                            break;

                                            case 2: //Deposito de Saldo a cuenta principal.
                                            {
                                                if (limite[i] >= 3)
                                                {
                                                    JOptionPane.showMessageDialog(null, "Limite de transacciones alcanzado.", "Alerta", JOptionPane.WARNING_MESSAGE);
                                                }
                                                else
                                                {
                                                    Transacciones depositarSaldo = new Transacciones();
                                                
                                                    monto = depositarSaldo.depositoSaldo(monto);
                                                    total = saldo + monto;
                                                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + total, "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                                                    saldo = total;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                }
                                break;
                                
                                case 3:
                                {
                                    JOptionPane.showMessageDialog(null, "Ha salido exitosamente.", "Salida", JOptionPane.INFORMATION_MESSAGE);
                                    reiniciar = false; //Cierre del reinicio del programa. No ejecutará una nueva ventana para reiniciar.
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