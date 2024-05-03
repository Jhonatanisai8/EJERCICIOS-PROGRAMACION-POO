package Modelos;

public enum TipoAvion {
    COMERCIAL("Comercial", "Avion que puede variar de tamaño. Transporta pasajeros y carga en vuelos comerciales"),
    CARGA("Carga", "Diseñado para transpotar cargar en lugar de pasajeros"),
    MILITAR("Militar", "Diseñados para misiones militares"),
    ENTRENAMIENTO("Entretenimiento", "Utilizado para entrenar a pilotos"),
    NEGOCIOS("Negocios", "Conocidos como aviones ejecutivos"),
    HELICE("Helice", "Se utilizan para vuelos de corta distancia"),
    REACCION("Reaccion", "Son comunes en la aviacion comercial y militar"),
    ANFIBIOS8("Anfibios", "Puede despejar tanto en agua como en tierra");

    private final String nombre;
    private final String discripcion;

    private TipoAvion(String nombre, String discripcion) {
        this.nombre = nombre;
        this.discripcion = discripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscripcion() {
        return discripcion;
    }

}
