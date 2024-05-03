package Modelos;

public class Piloto {

    private String nombre;
    private String apellido;
    private TipoPiloto tipoPiloto;

    public Piloto(String nombre, String apellido, TipoPiloto tipoPiloto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoPiloto = tipoPiloto;
    }

    public String mostrarDatos() {
        String mensaje = "Piloto de la Aeronave." +
                "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nTipo de Pilo: " + tipoPiloto;

        return mensaje;
    }
}
