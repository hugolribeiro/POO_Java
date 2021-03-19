public class Passageiro extends Pessoa{
    private String numeroPassaporte;
    private String assento;
    private String classe;

    public Passageiro(String _nome, String _cpf, int _idade, String numeroPassaporte, String assento, String classe) {
        super(_nome, _cpf, _idade);
        this.numeroPassaporte = numeroPassaporte;
        this.assento = assento;
        this.classe = classe;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void pedirBebida(String bebida){
        System.out.println("O passageiro " + this.getNome() + " pediu " + bebida);
    }
}
