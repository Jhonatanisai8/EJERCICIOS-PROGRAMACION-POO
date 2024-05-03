package Modelos;

import java.util.Random;

public class Avion {

    // atributos
    private int id;
    private String numSerie;
    private Piloto piloto;
    private MarcaAvion marcaAvion;
    private String modelo;
    private int envergadura;
    private int lontitud;
    private int autonomia;
    private Estanque estanque;
    private int altitudMaxima;
    private Cabina cabina;
    private Motor motor;
    private TipoAvion tipoAvion;

    // atributos finales
    private final int VELOCIDAD_MAXIMA = 1200;
    private static final String color = "Blanco";
    private static int ultimoiD;

    // colores constantes
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";
    private static final String COLOR_NEGRO = "Negro";

    public Avion() {
        this.numSerie = generarSerie();
        this.id = ++ultimoiD;
        this.tipoAvion = tipoAvion.COMERCIAL;
        this.envergadura = 45;
        this.lontitud = 70;
        this.autonomia = 2500;

    }

    public Avion(Piloto piloto, MarcaAvion marcaAvion, String modelo) {
        this();
        this.piloto = piloto;
        this.marcaAvion = marcaAvion;
        this.modelo = modelo;
    }

    public Avion(Piloto piloto, MarcaAvion marcaAvion, String modelo, int envergadura, int lontitud) {
        this(piloto, marcaAvion, modelo);
        this.envergadura = envergadura;
        this.lontitud = lontitud;
    }

    public Avion(Piloto piloto, MarcaAvion marcaAvion, String modelo, int envergadura, int lontitud,
            Estanque estanque) {
        this(piloto, marcaAvion, modelo, envergadura, lontitud);
        this.estanque = estanque;
    }

    public Avion(Piloto piloto, MarcaAvion marcaAvion, String modelo, int envergadura, int lontitud, Estanque estanque,
            int altitudMaxima, Cabina cabina, Motor motor, TipoAvion tipoAvion) {
        this(piloto, marcaAvion, modelo, envergadura, lontitud, estanque);
        this.altitudMaxima = altitudMaxima;
        this.cabina = cabina;
        this.motor = motor;
        this.tipoAvion = tipoAvion;
    }

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

    // getters y setters

    public int getId() {
        return id;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public MarcaAvion getMarcaAvion() {
        return marcaAvion;
    }

    public String getModelo() {
        return modelo;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public int getLontitud() {
        return lontitud;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    public Cabina getCabina() {
        return cabina;
    }

    public Motor getMotor() {
        return motor;
    }

    public TipoAvion getTipoAvion() {
        return tipoAvion;
    }

    public int getVELOCIDAD_MAXIMA() {
        return VELOCIDAD_MAXIMA;
    }

    public static String getColor() {
        return color;
    }

    public static int getUltimoiD() {
        return ultimoiD;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setMarcaAvion(MarcaAvion marcaAvion) {
        this.marcaAvion = marcaAvion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }

    public void setLontitud(int lontitud) {
        this.lontitud = lontitud;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public void setCabina(Cabina cabina) {
        this.cabina = cabina;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setTipoAvion(TipoAvion tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public static void setUltimoiD(int ultimoiD) {
        Avion.ultimoiD = ultimoiD;
    }

    public String verDetalleAvion() {
        return "Avion "
                + "\nId: " + id
                + "\nNumero de Serie: " + numSerie
                + "\nPiloto: " + getPiloto().mostrarDatos()
                + "\nMarca: " + marcaAvion
                + "\nModelo: " + modelo
                + "\nEnvergadura:" + envergadura + " m"
                + "\nLontitud: " + lontitud + " m"
                + "\nAutonomia: " + autonomia + " Km"
                + "\nEstanque: " + estanque.getCapacidad() + " Litros"
                + "\nAltitud Maxima: " + altitudMaxima + " m.s.n.m"
                + "\ncabina: " + cabina
                + "\nMotor: " + motor
                + "\ntipo de Avion: " + tipoAvion
                + "\nVELOCIDAD_MAXIMA: " + VELOCIDAD_MAXIMA;
    }

}
