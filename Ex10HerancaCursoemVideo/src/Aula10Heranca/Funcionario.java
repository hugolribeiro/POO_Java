package Aula10Heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    // Métodos abstratos

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // Métodos Especiais
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }


}
