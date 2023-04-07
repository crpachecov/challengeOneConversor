import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Object[] options = {"Convertir Divisas", "Convertir Temperaturas", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "Elige una opción",
                "Conversor One", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        //Cuando desee continuar que regrese al menu principal

        switch (elige) {
            case 0:
                String[] opcionesDivisas = {"Pesos a Dólares", "Pesos a Euros",
                        "Pesos a Libras", "Pesos a Yen", "Pesos a Won"};
                Conversion conversionDivisas;
                boolean continuarPrograma = true;
                while (continuarPrograma) {
                    int cambio = JOptionPane.showOptionDialog(null, "Elige una opción",
                            "Conversor de Divisas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, opcionesDivisas, opcionesDivisas[0]);

                    String input = JOptionPane.showInputDialog("Introduce la cantidad de pesos a convertir");
                    double pesos = 0;

                    try {
                        pesos = Double.parseDouble(input);
                        conversionDivisas = new Conversion(cambio);

                        JOptionPane.showMessageDialog(null, "La cantidad de pesos en " + opcionesDivisas[cambio] +
                                " es: " + conversionDivisas.calcularDivisa(pesos));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Introduce un número válido");
                    }

                    int confirma = JOptionPane.showConfirmDialog(null,
                            "¿Desea continuar con el programa?", "Confirmar",
                            JOptionPane.YES_NO_CANCEL_OPTION);

                    if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                        continuarPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                }
                break;
            case 1:
                String[] opcionesTemperaturas = {"Celsius a Fahrenheit", "Celsius a Kelvin",
                        "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius",
                        "Kelvin a Fahrenheit"};
                Conversion conversionTemperaturas;
                boolean continuarPrograma2 = true;
                while (continuarPrograma2) {
                    int cambio = JOptionPane.showOptionDialog(null, "Elige una opción",
                            "Conversor de Temperaturas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, opcionesTemperaturas, opcionesTemperaturas[0]);

                    String input = JOptionPane.showInputDialog("Introduce la cantidad de grados a convertir");
                    double grados = 0;

                    try {
                        grados = Double.parseDouble(input);
                        conversionTemperaturas = new Conversion(cambio);

                        JOptionPane.showMessageDialog(null, "La cantidad de grados en " + opcionesTemperaturas[cambio] +
                                " es: " + conversionTemperaturas.calcularTemperatura(grados));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Introduce un número válido");
                    }

                    int confirma = JOptionPane.showConfirmDialog(null,
                            "¿Desea continuar con el programa?", "Confirmar",
                            JOptionPane.YES_NO_CANCEL_OPTION);

                    if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                        continuarPrograma2 = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                }
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                System.exit(0);
                break;

        }

    }
}