package Aula15ProjetoFinal;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto[] gafanhotos = new Gafanhoto[2];
        gafanhotos[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        gafanhotos[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        System.out.println(v[0].toString());
        System.out.println(gafanhotos[0].toString());

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(gafanhotos[0], v[2]); // Jubileu assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(gafanhotos[0], v[1]); // Jubileu assiste PHP
        vis[0].avaliar(87f);
        System.out.println(vis[0].toString());
    }
}
