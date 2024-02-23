public class ShapeFactory {
    //Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
    public static Shape getShape(TipoForma type) {
        return switch (type) {
            case RETTANGOLO -> new Rettangolo(); // Restituisce un nuovo cerchio
            case TRIANGOLO -> new Triangolo(); // Restituisce un nuovo rettangolo
            default -> throw new IllegalArgumentException("Tipo di forma non supportato: " + type);
        };
    }
}
