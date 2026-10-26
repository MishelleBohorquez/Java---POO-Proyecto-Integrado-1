package logica;

public class Charmander extends Pokemon implements IFuego{

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

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander: Ataque puño de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander: Ataque laza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander: Ataque ascuas");
    }
}