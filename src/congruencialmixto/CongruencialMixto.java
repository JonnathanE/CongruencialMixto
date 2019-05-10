/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congruencialmixto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jonnathan
 */
public class CongruencialMixto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, k = 0; // multiplicador
        int c; // Constante aditiva
        int x = 0; // Semilla
        int m, g; // modulo

        int opcion = 0;
        boolean verificacion = true;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Eliga una Opcion\n"
                    + "1    Congruencial Mixto, Calculando: Multiplicador(a) y el modulo(m)\n"
                    + "2    Congruencial Mixto con valores establecidos\n"
                    + "3    Salir", null, JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1: // LA OPCION 1: CALCULA LOS VALORES DE a Y m, MEDIANTE SUS CORRESPONDIENTES FORMULAS
                    x = semilla(); // Se llama al metodo para pedir el valor de la semilla
                    a = multiplicador(); // se llama al metodo para pedir el valor del multiplicador
                    c = constante_aditiva(); // se llama al metodo para pedir el valor de la constante aditiva
                    m = modulo(); // se llama al metodo para pedir el valor sel modulo
                    calcular(x, a, c, m); // se llama el metodo para calcular la congruencia
                    break;
                case 2: // LA OPCION 2: SE DEBE DE INGRESAR LOS VALORES FINALES DE m Y a.
                    x = semilla();
                    a = multiplicadorOp2(); // se llama al metodo para pedir el valor final de 'a'
                    c = constante_aditiva(); 
                    m = moduloOp2(); // se llama al metodo para pedir el valor final de 'm'
                    calcular(x, a, c, m);
                    break;
                case 3: // LA OPCION 3: SIRVE PARA SALIR DEL PROGRAMA
                    verificacion = false;
                    break;
                default:
            }
        } while (verificacion);

    }

    /*
     Metodo para calcular el valor de X0
    */
    public static int semilla() {
        int x = 0;
        boolean entero = false;
        do {
            try {
                x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la semilla ( X0 ):", null, JOptionPane.INFORMATION_MESSAGE));
                entero = true;
                if (x == JOptionPane.CANCEL_OPTION) {
                    entero = false;
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe se entero");
            }
        } while (!entero);
        return x;
    }

    /*
    Metodo para calcular 'a' mediante la formula 'a = 1 + 4K'
    */
    public static int multiplicador() {
        int a = 0;
        int k = 0;
        boolean entero = false;
        do {
            try {
                k = Integer.parseInt(JOptionPane.showInputDialog(null, "Para calcular el multiplicador (a), "
                        + "se debe ingresar el valor K, deacuerdo a la siguiente Formula:\n"
                        + "Formula:  a = 1 + 4K", null, JOptionPane.INFORMATION_MESSAGE));
                if (k > 0) {
                    a = 1 + 4 * k;
                    entero = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe se entero");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe se entero");
            }
        } while (!entero);
        return a;
    }

    /*
    Metodo para calcular 'c'
    */
    public static int constante_aditiva() {
        int c = 0;
        boolean entero = false;
        do {
            try {
                c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la constante aditiva (c). Recuerde que debe ser un numero impar:", null, JOptionPane.INFORMATION_MESSAGE));
                if (c % 2 == 1) {
                    entero = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe se entero impar");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe se entero impar");
            }
        } while (!entero);
        return c;
    }

    /*
    Metodo para calcular 'm', mediante la formula 'm = 2^g'
    */
    public static int modulo() {
        int m = 0, g = 0;
        boolean entero = false;
        do {
            try {
                g = Integer.parseInt(JOptionPane.showInputDialog(null, "Para calcular el modulo (m), ingrese un numero entero 'g' "
                        + ", de acuerdo a la FORUMLA:\n"
                        + "Formula: m = 2^g", null, JOptionPane.INFORMATION_MESSAGE));
                if (g > 0) {
                    m = (int) Math.pow(2, g);
                    entero = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe se entero");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe se entero");
            }
        } while (!entero);
        return m;
    }

    /*
    Metodo para calcular 'a' en donde se ingresa el valor final
    */
    public static int multiplicadorOp2() {
        int a = 0;
        boolean entero = false;
        do {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del multiplicador (a)", null, JOptionPane.INFORMATION_MESSAGE));
                if (a > 0 && a % 2 == 1) {
                    return a;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe se entero impar");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe se entero entero Impar");
            }
        } while (!entero);
        return a;
    }

    /*
    Metodo para calcular 'm' en donde se ingresa el valor final
    */
    public static int moduloOp2() {
        int m = 0;
        boolean entero = false;
        do {
            try {
                m = Integer.parseInt(JOptionPane.showInputDialog(null, "Para calcular el modulo (m)", null, JOptionPane.INFORMATION_MESSAGE));
                if (m > 0) {
                    return m;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe se entero");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe se entero");
            }
        } while (!entero);
        return m;
    }

    /*
    Metodo para calcular el Congurencial
    */
    public static void calcular(int x, int a, int c, int m) {
        int r = 0; // Resultado
        int i = 0; // Contador
        int x2 = x;
        double aux1, aux2;
        System.out.println("n\tX\t(ax + c)/m\tXn\tNumerosUniformes");
        while (r != x2) {
            r = (a * x + c) % m;
            aux1 = (a * x + c) / m;
            aux2 = r % m;
            System.out.println(i + "\t" + x + "\t" + (int) aux1 + "+" + (int) aux2 + "/" + (int) m + "\t\t" + (int) r + "\t" + (double) r / m);
            x = (int) r;
            i++;
        }
    }
}
