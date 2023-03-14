package No;

public class Aula {
    public static void main(String[] args) {
        No no1 = new No("Conteudo no1");
        No no2 = new No("Conteudo no2");
        no1.setProximoNo(no2);
        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);
        No no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);
        System.out.println(no1); //Conteudo no1.
        System.out.println(no1.getProximoNo()); //Conteudo no2.
        System.out.println(no4.getProximoNo()); //null.
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); //Conteudo no4
    }
}
