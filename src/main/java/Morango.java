public class Morango extends AcaiDecorator {

    public Morango(Acai acai){
        super(acai);
    }

    public float getPrecoAdicional(){
        return 5.0f;
    }

    public String getNomeComponente(){
        return "Morango";
    }
}
