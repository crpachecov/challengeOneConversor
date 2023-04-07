import java.text.DecimalFormat;

public class Conversion {
    private int tipoConversion;
    private DecimalFormat formatear = new DecimalFormat("#.##");

    public Conversion() {
    }

    public Conversion(int tipoConversion) {
        this.tipoConversion = tipoConversion;
    }

    public String calcularDivisa(double cantidad) {
        String resultado = "";
        switch (tipoConversion) {
            case 0:
                resultado = formatear.format(cantidad / 19.5);
                break;
            case 1:
                resultado = formatear.format(cantidad / 22.5);
                break;
            case 2:
                resultado = formatear.format(cantidad / 26.5);
                break;
            case 3:
                resultado = formatear.format(cantidad / 0.18);
                break;
            case 4:
                resultado = formatear.format(cantidad / 0.016);
                break;
        }
        return resultado;
    }

    public String calcularTemperatura(double cantidad) {
        String resultado = "";
        switch (tipoConversion) {
            case 0:
                resultado = formatear.format((cantidad * 1.8) + 32);
                break;
            case 1:
                resultado = formatear.format(cantidad + 273.15);
                break;
            case 2:
                resultado = formatear.format((cantidad - 32) / 1.8);
                break;
            case 3:
                resultado = formatear.format((cantidad - 32) / 1.8 + 273.15);
                break;
            case 4:
                resultado = formatear.format(cantidad - 273.15);
                break;
            case 5:
                resultado = formatear.format((cantidad - 273.15) * 1.8 + 32);
                break;
        }
        return resultado;
    }
}
