public class Granola extends AcaiDecorator {

    public Granola(Acai acai){
        super(acai);
    }

    public float getPrecoAdicional(){
        return 2.0f;
    }

    public String getNomeComponente(){
        return "Granola";
    }
}
