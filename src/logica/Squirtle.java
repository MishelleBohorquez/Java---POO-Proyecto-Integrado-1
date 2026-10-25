package logica;

public class Squirtle extends Pokemon{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle: Ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle: Ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle: Ataque mordisco");
    }

}