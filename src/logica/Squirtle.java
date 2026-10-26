package logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

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

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle: Ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle: Ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle: Ataque pistola de agua");
    }
}