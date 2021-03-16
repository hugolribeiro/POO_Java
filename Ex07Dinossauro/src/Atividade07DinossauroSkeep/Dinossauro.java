package Atividade07DinossauroSkeep;

//Autor: Hugo Leça Ribeiro

public class Dinossauro {
    // Atributos
    private String nome;
    private int energia;
    private int velocidade;
    private String temperatura;
    private String humor;

    // Métodos especiais
    public Dinossauro(String nome){
        this.setNome(nome);
        this.energia = 5;
        this.velocidade = 5;
        this.setTemperatura("Regular");
        this.setHumor("Feliz");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        int pontosGanhos = 0;
        if (velocidade > this.getVelocidade()){
            pontosGanhos = velocidade - this.getVelocidade();
        }
        if (this.getVelocidade() == 10){
            System.out.println(this.getNome() + " já possui o máximo de velocidade.");
        }
        else{
            this.velocidade = velocidade;
            this.setEnergia(this.getEnergia() - pontosGanhos);
        }
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
            this.humor = humor;
    }

    // Métodos abstratos

    public void pular(){
        this.setEnergia(this.getEnergia() - 1);
        this.setHumor("Feliz");
    }
    public void correr(){
        this.setEnergia(this.getEnergia() - 1);
        this.setHumor("Feliz");
    }
    public void comer(){
        if (this.getEnergia() < 10){
            this.setEnergia(this.getEnergia() + 1);
        }
        this.setHumor("Feliz");
    }
    public void brincar(){
        this.setEnergia(this.getEnergia() - 1);
        this.setHumor("Feliz");
    }

    public void tomarSol(){
        this.setVelocidade(this.getVelocidade() + 1);
        this.setTemperatura("Quente");
        this.setHumor("Feliz");
    }
    public void ficarNaSombra(){
        if (this.getEnergia() < 10){
            this.setEnergia(this.getEnergia() + 1);
        }
        this.setTemperatura("Regular");
        this.setHumor("Triste");
    }

    public void status(){
        System.out.println("------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Energia: " + this.getEnergia());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Temperatura: " + this.getTemperatura());
        System.out.println("Humor: " + this.getHumor());
        System.out.println("               __\n" +
                           "              / _)\n" +
                           "     _.----._/ /\n" +
                           "    /         /\n" +
                           " __/ (  | (  |\n" +
                           "/__.-'|_|--|_|");
        System.out.println("------------------");
    }
}
