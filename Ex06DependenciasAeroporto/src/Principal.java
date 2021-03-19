public class Principal {
    // Autor: Hugo Leça Ribeiro
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("Afonso", "2203920",
                35, "009282930", "45", "econômica");

        Passageiro p2 = new Passageiro("Maria", "23938301",
                42, "83838202", "55", "Executiva");
        p1.pedirBebida("Cerveja");
        p1.falar("Nossa, que voo cheio!!");
        p2.pedirBebida("Vinho");
        p2.falar("Ainda bem que está vazia na classe executiva!");


        Piloto piloto1 = new Piloto("Carlos", "413483020", 45, "RF4233423",
                2140, "GOL");

        Piloto piloto2 = new Piloto("Astolfo", "439320303", 54, "RF412044203",
                3210, "American Airlines");

        piloto1.fazerAnuncio("Teremos uma turbulência!");

        piloto2.fazerAnuncio("Este voo será tranquilo!");

        Aeronave aeronave1 = new Aeronave("America Airlines", 120, false, "44232", piloto1);
        Aeronave aeronave2 = new Aeronave("GOL", 97, false, "44103", piloto1);
        System.out.println("Piloto atual da aeronave 1:" + aeronave1.getPiloto().getNome());
        aeronave1.setPiloto(piloto2);
        System.out.println("Piloto atual da aeronave 1: " + aeronave1.getPiloto().getNome());

        System.out.println("Aeronave 2 está em voo: " + aeronave2.isEmVoo());
        aeronave2.decolar();
        System.out.println("Aeronave 2 está em voo: " + aeronave2.isEmVoo());

        Pessoa pessoa1 = new Pessoa("Hugo", "33002102940", 30);
        Pessoa pessoa2 = new Pessoa("Josefa", "438939328303", 67);
        pessoa1.andar();
        pessoa2.sentar();

        Aeroporto aeroporto1 = new Aeroporto(456, 30000, "Santos Dumont");
        Aeroporto aeroporto2 = new Aeroporto(505, 50000, "Internacional de Guarulhos");
        aeroporto1.liberarEmbarque(aeronave1);
        aeroporto2.liberarEmbarque(aeronave2);
    }
}
