public class Aeroporto {
    private int funcionarios;
    public float metrosQuadrados;
    public String nome;

    public Aeroporto(int func, float metrosQ, String n){
        this.funcionarios = func;
        this.metrosQuadrados = metrosQ;
        this.nome = n;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    public float getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(float metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void liberarEmbarque(Aeronave aeronave)
    {
        System.out.println("O embarque para a aeronave de ID " + aeronave.getNumeroId() + " está liberado");
    }
}
