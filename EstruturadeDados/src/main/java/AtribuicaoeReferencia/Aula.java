package AtribuicaoeReferencia;

public class Aula {
    public static void main(String[] args) {
        /*Neste exemplo mostra que quando o atributo não é um objeto, o valor que foi inserido para modificar o valor do objeto A, 
        não vai modificar os outros atributos.*/
        System.out.println("---------------Exemplo-1--------------------");
        int intA = 1;
        int intB = intA;
        
        System.out.println("intA: " + intA + " intB: " + intB);
        intA = 2;
        System.out.println("intA: " + intA + " intB: " + intB);
        System.out.println("--------------------------------------------");
        
        /*Neste exemplo mostra que quando o atributo é um objeto, o valor que foi inserido para modificar o valor do objeto A, 
        , vai ser mudado no demais objetos.*/
        System.out.println("---------------Exemplo-2--------------------");
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("objA: " + objA + " objB: " + objB);   
        objA.setNum(2);
        System.out.println("objA: " + objA + " objB: " + objB);
        System.out.println("---------------------------------------------");
    }
}
