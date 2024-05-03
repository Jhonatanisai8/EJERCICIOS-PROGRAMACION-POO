package Modelos;

public class Cabina {
    private int numAsientos;
    private SistemaNavegacion sistemaNavegacion;
    private EquipajeEmergencia equipajeEmergencia;

    public Cabina(int numAsientos, SistemaNavegacion sistemaNavegacion, EquipajeEmergencia equipajeEmergencia) {
        this.numAsientos = numAsientos;
        this.sistemaNavegacion = sistemaNavegacion;
        this.equipajeEmergencia = equipajeEmergencia;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public SistemaNavegacion getSistemaNavegacion() {
        return sistemaNavegacion;
    }

    public void setSistemaNavegacion(SistemaNavegacion sistemaNavegacion) {
        this.sistemaNavegacion = sistemaNavegacion;
    }

    public EquipajeEmergencia getEquipajeEmergencia() {
        return equipajeEmergencia;
    }

    public void setEquipajeEmergencia(EquipajeEmergencia equipajeEmergencia) {
        this.equipajeEmergencia = equipajeEmergencia;
    }

    @Override
    public String toString() {
        return "\nNº de Asientos: " + numAsientos
                + "\nSistema de Navegacion: " + sistemaNavegacion
                + "\nEquipaje de Emergencia: " + equipajeEmergencia;
    }

}
