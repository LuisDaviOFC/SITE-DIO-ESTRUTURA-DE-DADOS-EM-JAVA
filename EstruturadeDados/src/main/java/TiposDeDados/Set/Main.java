package TiposDeDados.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> setCarros = new HashSet<>();
        setCarros.add(new Carro("Ford"));
        setCarros.add(new Carro("Chevrolet"));
        setCarros.add(new Carro("Volkswagen"));
        
        System.out.println(setCarros);
        
        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Volkswagen"));
        
        System.out.println(treeSetCarros);
    }
}
