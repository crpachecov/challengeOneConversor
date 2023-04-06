import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Object[] options = {"Convertir Divisas", "Convertir Temperaturas", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "Elige una opción",
                "Conversor One", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
            System.exit(0);
        }

        if (elige == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;

            while (continuarPrograma) {
                String[] opcionesDivisas = {"Pesos a Dólares", "Pesos a Euros",
                        "Pesos a Libras", "Pesos a Yen", "Pesos a Won"};
                String cambio = (String) JOptionPane.showInputDialog(null,
                        "Elige una opción", "Conversor de Divisas",
                        JOptionPane.QUESTION_MESSAGE, null, opcionesDivisas, opcionesDivisas[0]);

                String input = JOptionPane.showInputDialog("Introduce la cantidad de pesos a convertir");
                double pesos = 0;

                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Introduce un número válido");
                }

                if (cambio == "Pesos a Dólares") {
                    double dolares = pesos / 19.5;
                    JOptionPane.showMessageDialog(null, "La cantidad de pesos en dólares es: " + formatearDivisa.format(dolares));
                } else if (cambio == "Pesos a Euros") {
                    double euros = pesos / 22.5;
                    JOptionPane.showMessageDialog(null, "La cantidad de pesos en euros es: " + formatearDivisa.format(euros));
                } else if (cambio == "Pesos a Libras") {
                    double libras = pesos / 26.5;
                    JOptionPane.showMessageDialog(null, "La cantidad de pesos en libras es: " + formatearDivisa.format(libras));
                } else if (cambio == "Pesos a Yen") {
                    double yen = pesos / 0.18;
                    JOptionPane.showMessageDialog(null, "La cantidad de pesos en yen es: " + formatearDivisa.format(yen));
                } else if (cambio == "Pesos a Won") {
                    double won = pesos / 0.016;
                    JOptionPane.showMessageDialog(null, "La cantidad de pesos en won es: " + formatearDivisa.format(won));
                }

                int confirma = JOptionPane.showConfirmDialog(null,
                        "¿Desea continuar con el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }

        if (elige == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opcionesTemperaturas = {"Celsius a Fahrenheit", "Celsius a Kelvin",
                        "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius",
                        "Kelvin a Fahrenheit"};
                String cambio = (String) JOptionPane.showInputDialog(null,
                        "Elige una opción", "Conversor de Temperaturas",
                        JOptionPane.QUESTION_MESSAGE, null, opcionesTemperaturas, opcionesTemperaturas[0]);

                String input = JOptionPane.showInputDialog("Introduce la cantidad de grados a convertir");
                double grados = 0;

                try {
                    grados = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Introduce un número válido");
                }

                if (cambio == "Celsius a Fahrenheit") {
                    double fahrenheit = (grados * 1.8) + 32;
                    JOptionPane.showMessageDialog(null, "La cantidad de grados Celsius en Fahrenheit es: " + fahrenheit);
                } else if (cambio == "Celsius a Kelvin") {
                    double kelvin = grados + 273.15;
                    JOptionPane.showMessageDialog(null, "La cantidad de grados Celsius en Kelvin es: " + kelvin);
                } else if (cambio == "Fahrenheit a Celsius") {
                    double celsius = (grados - 32) / 1.8;
                    JOptionPane.showMessageDialog(null, "La cantidad de grados Fahrenheit en Celsius es: " + celsius);
                } else if (cambio == "Fahrenheit a Kelvin") {
                    double kelvin = (grados + 459.67) * 5 / 9;
                    JOptionPane.showMessageDialog(null, "La cantidad de grados Fahrenheit en Kelvin es: " + kelvin);
                } else if (cambio == "Kelvin a Celsius") {
                    double celsius = grados - 273.15;
                    JOptionPane.showMessageDialog(null, "La cantidad de grados Kelvin en Celsius es: " + celsius);
                } else if (cambio == "Kelvin a Fahrenheit") {
                    double fahrenheit = (grados * 1.8) - 459.67;
                    JOptionPane.showMessageDialog(null, "La cantidad de grados Kelvin en Fahrenheit es: " + fahrenheit);
                }

                int confirma = JOptionPane.showConfirmDialog(null,
                        "¿Desea continuar con el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }

    }
}