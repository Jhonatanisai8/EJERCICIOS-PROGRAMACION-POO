package Modelos;

public class Motor {

    private int numMotores;
    private TipoMotor tipoMotor;

    public Motor() {

    }

    public Motor(int numMotores, TipoMotor tipoMotor) {
        this.numMotores = numMotores;
        this.tipoMotor = tipoMotor;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    

}
