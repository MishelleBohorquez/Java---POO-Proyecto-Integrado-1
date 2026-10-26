package logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

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

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Pikachu: Ataque impacto de trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu: Ataque puñi de trueno");
    }
}