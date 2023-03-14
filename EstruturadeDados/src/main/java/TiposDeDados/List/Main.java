package TiposDeDados.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Volkswagen"));
        
        System.out.println(listCarros);
        System.out.println("-----------------------------------");
        System.out.println(listCarros.isEmpty());
        System.out.println("------------------------------------");
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}
