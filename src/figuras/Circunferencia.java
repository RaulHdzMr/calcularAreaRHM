package figuras;

/**
 * Clase Circunferencia con propiedades radio y color
 * Proporciona métodos para la obtención y modificación del radio y el cálculo
 * de las propiedades relacionadas
 */
public class Circunferencia {
    private double radio;
    private String color;

    /**
     * Constructor de la clase Circunferencia
     * @param radio incial del objeto Circunferencia
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Imprime las propiedades del objeto Circunferencia
     * El metodo transforma el color del objeto Circunferencia a rojo
     * Calcula y enseña el diámetro, color y área del objeto Circunferencia
     * La fórmula utilizada para calcular el área es 2 * π * radio²
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * Confirma si el valor del parámetro "otro" es igual al radio del objeto Circunferencia
     * @param conDecimales True si hay que tener en cuenta los decimales, False si no
     * @param otro Objeto de tipo circunferencia con un radio propio
     * @return True si son iguales, False si no.
     */
    public boolean esIgual(boolean conDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRad();
        if (conDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

    /**
     * Obtiene el radio de la circunferencia
     * @return Valor actual de radio
     */
    public double getRad() {
        return radio;
    }

    /**
     * Establece nuevo valor para el radio de la circunferncia
     * @param radio Nuevo valor de radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

