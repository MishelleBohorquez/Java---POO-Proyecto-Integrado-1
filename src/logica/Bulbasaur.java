package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

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

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur: Ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur: Ataque paralizar");
    }
}