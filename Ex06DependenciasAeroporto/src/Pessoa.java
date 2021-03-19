public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome,
                  String cpf,
                  int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void falar(String frase){
        System.out.println(getNome() + " disse: " + frase);
    }

    public void andar(){
        System.out.println(getNome() + " está andando");
    }

    public void sentar(){
        System.out.println(getNome() + " vai sentar");
    }

    public void levantar(){
        System.out.println(getNome() + " vai levantar");
    }
}
