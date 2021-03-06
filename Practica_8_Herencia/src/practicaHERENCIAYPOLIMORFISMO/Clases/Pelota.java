package practicaHERENCIAYPOLIMORFISMO.Clases;

public class Pelota extends Objeto {
    //Atributos
    private static final double PI = 3.14;
    private float radio;

    //Constructores
    public Pelota(int posY, int posX, float peso, float radio) {
        super(posY, posX, peso);
        this.radio = radio;
    }

    //Metodos sobrescritos
    @Override
    public String toString() {
        return("\nEL OBJETO ES UNA PELOTA"+
                super.toString()+"\n"+
                "RADIO: "+radio+"\n"+
                "VOLUMEN: "+calculaVolumen());
    }

    //Metodos añadidos
    public double calculaVolumen(){
        return ((4 * PI * (radio * radio * radio)) / 3);
    }
}
