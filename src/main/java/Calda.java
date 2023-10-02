public class Calda extends AcaiDecorator {

    public Calda(Acai acai){
        super(acai);
    }

    public float getPrecoAdicional(){
        return 1.0f;
    }

    public String getNomeComponente(){
        return "Calda";
    }
}
