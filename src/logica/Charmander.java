package logica;

public class Charmander extends Pokemon{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander: Ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander: Ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander: Ataque mordisco");
    }

}