package Main;

import java.io.IOException;

import javax.swing.JOptionPane;

public class VentanaPrincipal
{
    static boolean login = false; //Declaración para ciclar el login de manera correcta.
    static int limite[] = new int[10]; //Limitador de transacciones dentro de una sola operacion.
    //V1.1 - Se actualizó el límite de transacciones de 3 a 10.
    //- Se eliminó la variable global "int total".


    public static void main(String[] args) throws IOException
    {
        String user = "admin", password = "Password01"; //Variable de control del usuario y la contraseña correctos.
        String loginUser, loginPassword; //Variables controladoras de las credenciales ingresadas.
        int total, saldo = 3500, opcion = 0, monto = 0; //Variables controladoras
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
                        
                        JOptionPane.showMessageDialog(null, "Bienvenido usuario: " + user, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        //V1.1 Se añadió el mensaje de bienvenida al usuario al main en lugar del archivo 'Transacciones'.
                        
                        do //Controlador del reinicio del ciclo para operar tantas veces sea necesario para el usuario.
                        {
                            opcion = mostrarMenu.menuMostrarOpciones(user, opcion); //Método con parámetros de usuario y la opción elegida en el mismo para juzgar hacia dónde irá el programa.

                            switch (opcion) //Cicla las opciones del menú principal.
                            {
                                case 1: //Selección de la consulta de saldo del usuario.
                                {                            
                                    Transacciones mostrarSaldo = new Transacciones();

                                    saldo = mostrarSaldo.ConsultaSaldo(saldo); //Asignación del nuevo valor a la variable 'saldo'.
                                }
                                break;

                                case 2: //Selección de las posibles transacciones que el usuario puede efectuar.
                                {
                                    Transacciones menuTransacciones = new Transacciones();

                                    opcion = menuTransacciones.menuMostrarTransacciones(opcion); //Asignación de valor a la variable 'opcion'.

                                    for (int i = 0; i <= limite.length;) //Controlador del limite de transacciones que el usuario puede realizar antes de bloquearlas por seguridad.
                                    {
                                        limite[i]++; //Incremento del arreglo 'limite' que previene más transacciones de usuario, por seguridad.

                                        switch (opcion) //Opciones internas para el retiro o deposito de saldo de usuario.
                                        //V1.1 - Añadido módulo de pago de agua y pago de educación en el case 3 y 4.
                                        {
                                            case 1: //Retiro de Saldo de la cuenta principal.
                                            {
                                                if (limite[i] >= limite.length) //V1.1 - Actualizado de '3' a '.length' para no cambiar manualmente todos los valores incorporados.
                                                {
                                                    JOptionPane.showMessageDialog(null, "Limite de transacciones alcanzado.", "Alerta", JOptionPane.WARNING_MESSAGE);
                                                    //Limite establecido para las transacciones, el cual es 10 y no permitirá más transacciones durante la operación.
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
                                                if (limite[i] >= limite.length) //V1.1 - Actualizado de '3' a '.length' para no cambiar manualmente todos los valores incorporados.
                                                {
                                                    JOptionPane.showMessageDialog(null, "Limite de transacciones alcanzado.", "Alerta", JOptionPane.WARNING_MESSAGE);
                                                }
                                                else
                                                {
                                                    Transacciones depositarSaldo = new Transacciones();
                                                    
                                                    monto = depositarSaldo.depositoSaldo(monto);
                                                    total = saldo - monto;
                                                    
                                                    if (saldo < monto)
                                                    {
                                                        JOptionPane.showMessageDialog(null, "No tiene fondos suficientes.", "Error", JOptionPane.WARNING_MESSAGE);
                                                    }
                                                    else
                                                    {
                                                        JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + total, "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                                                        saldo = total;
                                                    }
                                                }
                                            }
                                            break;

                                            case 3: //V1.1 - No se limita el pago a servicios por razones obvias.
                                            {
                                                Transacciones fun_pagoAgua = new Transacciones();
                                
                                                monto = fun_pagoAgua.pagoAgua(monto);
                                                total = saldo - monto;

                                                if (saldo < monto) //Si el saldo actual es menor al monto que se está cobrando, entonces no se efectua la condición 2 y se regresa al menú principal.
                                                {
                                                    JOptionPane.showMessageDialog(null, "No tiene fondos suficientes.", "Error", JOptionPane.WARNING_MESSAGE);
                                                }
                                                else
                                                {
                                                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + total, "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                                                    saldo = total;
                                                }
                                            }
                                            break;

                                            case 4: //V1.1 - No se limita el pago a servicios por razones obvias.
                                            {
                                                Transacciones fun_pagoEducacion = new Transacciones();

                                                monto = fun_pagoEducacion.pagoEducacion(monto);
                                                total = saldo - monto;

                                                if (saldo < monto) //Si el saldo actual es menor al monto que se está cobrando, entonces no se efectua la condición 2 y se regresa al menú principal.
                                                {
                                                    JOptionPane.showMessageDialog(null, "No tiene fondos suficientes.", "Error", JOptionPane.WARNING_MESSAGE);
                                                }
                                                else
                                                {
                                                    JOptionPane.showMessageDialog(null, "Pago completado. Su nuevo saldo es: $" + total, "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                                                    saldo = total;
                                                }
                                            }
                                            break;

                                            default:
                                            {
                                                JOptionPane.showMessageDialog(null, "Opcion no valida.", "Error", JOptionPane.WARNING_MESSAGE);
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                }
                                break;
                                
                                case 3: //Salida del programa.
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
                reiniciar = true;
            }
    }
}