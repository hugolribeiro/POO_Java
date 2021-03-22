package Aula10Heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    // Métodos abstratos

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Métodos especiais
    public void receberAum(float aum){
        this.setSalario(this.getSalario() + aum);
    }
}
