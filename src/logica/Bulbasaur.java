package logica;

public class Bulbasaur extends Pokemon{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur: Ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur: Ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur: Ataque mordisco");
    }

}