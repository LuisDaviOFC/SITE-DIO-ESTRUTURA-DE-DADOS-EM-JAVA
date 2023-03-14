package TiposDeDados.List;

import java.util.Objects;

public class Carro {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + '}';
    }
    
}
