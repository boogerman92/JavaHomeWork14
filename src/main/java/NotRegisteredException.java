public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName) {
        super("Игрок с ником " + playerName + " не найден");
    }
}
