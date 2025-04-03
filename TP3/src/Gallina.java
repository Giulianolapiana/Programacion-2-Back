public class Gallina {
    private int id;
    private  int edad;
    private int huevosPuestos;

    public Gallina(int id, int edad, int huevosPuestos) {
        this.id = id;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(){
        huevosPuestos += 1;
    }
    public void envejecer(){
        edad += 1;
    }
    public void mostarEstado(){
        System.out.println(id+" "+edad+" "+huevosPuestos);
    }

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1,22,5);
        Gallina gallina2 = new Gallina(2,33,10);
        gallina1.mostarEstado();
        gallina2.mostarEstado();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.mostarEstado();
        gallina2.mostarEstado();

    }
}
