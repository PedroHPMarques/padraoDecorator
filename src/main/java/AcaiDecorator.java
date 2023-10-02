public abstract class AcaiDecorator implements Acai {
    private Acai acai;

    public AcaiDecorator(Acai acai){
        this.acai = acai;
    }

    public Acai getAcai() {
        return acai;
    }

    public void setAcai(Acai acai) {
        this.acai = acai;
    }

    public abstract float getPrecoAdicional();

    public float getPreco(){
        return this.acai.getPreco() + this.getPrecoAdicional();
    }
    public abstract String getNomeComponente();

    public String getComponente() {
        return this.acai.getComponente() + " + " + this.getNomeComponente();
    }
}
