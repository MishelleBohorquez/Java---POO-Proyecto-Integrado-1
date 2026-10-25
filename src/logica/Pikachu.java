package logica;

public class Pikachu extends Pokemon{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu: Ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu: Ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu: Ataque mordisco");
    }

}