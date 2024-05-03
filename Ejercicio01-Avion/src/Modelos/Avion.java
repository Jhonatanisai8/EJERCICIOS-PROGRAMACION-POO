package Modelos;

import java.util.Random;

public class Avion {
    private int numSerie;
    private TipoMotor tipoMotor;
    private int envergadura;
    private int lontitud;
    private int capacidadCarga;
    private int autonomia;
    private int altitudMaxima;
    private Cabina cabina;
    // atributos finales
    private final int VELOCIDAD_MAXIMA = 1200;
    private static final String color = "Blanco";

    // METODO PARA GENERAR UN NUMERO DE SERIE AL AVION CREADO
    private String generarSerie() {
        String letras = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
        String numeros = "1234567890";

        Random random = new Random();

        // generamos 3 letras aleatorias
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(letras.charAt(random.nextInt(letras.length())));
        }

        // generamos los 3 numeros aleatorios
        for (int i = 0; i < 4; i++) {
            sb.append(numeros.charAt(random.nextInt(numeros.length())));
        }

        return sb.toString();
    }
}
