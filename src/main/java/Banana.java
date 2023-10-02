public class Banana extends AcaiDecorator {

    public Banana(Acai acai){
        super(acai);
    }

    public float getPrecoAdicional(){
        return 3.0f;
    }

    public String getNomeComponente(){
        return "Banana";
    }
}
