import Modelos.Avion;
import Modelos.Cabina;
import Modelos.EquipajeEmergencia;
import Modelos.Estanque;
import Modelos.MarcaAvion;
import Modelos.Motor;
import Modelos.Piloto;
import Modelos.SistemaNavegacion;
import Modelos.TipoAvion;
import Modelos.TipoMotor;
import Modelos.TipoPiloto;

public class App {
    public static void main(String[] args) throws Exception {
        ejemploAirbus();
    }

    public static void ejemploAirbus() {
        Avion airbus_A380;
        airbus_A380 = new Avion(new Piloto("Daniel Eli", "Ojeda Sanchez", TipoPiloto.PRIVADO), MarcaAvion.AIRBUS,
                "Airbus-A380", 70, 120, new Estanque(2300), 100000,
                new Cabina(5, SistemaNavegacion.RADAR, EquipajeEmergencia.CHALECOS_SALVAVIDAS),
                new Motor(4, TipoMotor.Tubohelices), TipoAvion.NEGOCIOS);
        System.out.println(airbus_A380.verDetalleAvion());
    }

    public static void ejemploBoing() {
        Avion boeing747;
        boeing747 = new Avion();
        Piloto pilotoBoing747;
        pilotoBoing747 = new Piloto("Jhonatan", "Ojeda", TipoPiloto.COMERCIAL);
        boeing747.setPiloto(pilotoBoing747);
        boeing747.setMarcaAvion(MarcaAvion.BOEING);
        boeing747.setModelo("Boeing-747");
        boeing747.setAltitudMaxima(9000);
        boeing747.setCabina(new Cabina(5, SistemaNavegacion.GPS, EquipajeEmergencia.MASCARAS_OXIGENO));
        boeing747.setMotor(new Motor(4, TipoMotor.Turbofan));
        System.out.println(boeing747.verDetalleAvion());

    }
}
