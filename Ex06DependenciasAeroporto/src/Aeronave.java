public class Aeronave {
    private Piloto Piloto;
    public String companhiaAerea;
    public int qtdAssentos;
    private boolean emVoo;
    private String numeroId;

    public Aeronave(String cAerea,
                    int qtAssentos,
                    boolean voo,
                    String numeroId,
                    Piloto pilAtual){
        this.companhiaAerea = cAerea;
        this.qtdAssentos = qtAssentos;
        this.emVoo = voo;
        this.numeroId = numeroId;
        this.Piloto = pilAtual;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public String getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(String numeroId) {
        this.numeroId = numeroId;
    }

    public Piloto getPiloto() {
        return Piloto;
    }

    public void setPiloto(Piloto piloto){
        this.Piloto = piloto;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void aterrissar(){
        if (this.emVoo){
            System.out.println("Aterrissando...");
            emVoo = false;
        }
        else{
            System.out.println("Aeronave já está em solo.");
        }
    }
    public void decolar(){
        if (!this.emVoo){
            System.out.println("Aeronave decolando...");
            emVoo = true;
        }
        else{
            System.out.println("A aeronave já está em voo");
        }
    }
}
