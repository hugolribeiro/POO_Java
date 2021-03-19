public class Piloto extends Pessoa {
    private String registroFuncional;
    private int horasDeVoo;
    private String companhiaAerea;

    public Piloto(String _nome, String _cpf, int _idade,
                  String registroFuncional, int horasDeVoo, String companhiaAerea) {
        super(_nome, _cpf, _idade);
        this.registroFuncional = registroFuncional;
        this.horasDeVoo = horasDeVoo;
        this.companhiaAerea = companhiaAerea;
    }

    public String getRegistroFuncional() {
        return registroFuncional;
    }

    public void setRegistroFuncional(String registroFuncional) {
        this.registroFuncional = registroFuncional;
    }

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public void fazerAnuncio(String mensagem){
        System.out.println("----------------------------------------");
        System.out.println("Atenção, senhores passageiros. O piloto irá se manifestar.\n" +
                           mensagem);
        System.out.println("----------------------------------------");
    }
}
