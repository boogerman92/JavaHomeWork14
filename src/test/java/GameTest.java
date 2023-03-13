import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void firstStrongPlayer() {
        Game game = new Game();
        Player alex = new Player(1, "alex", 10);
        Player rock = new Player(2, "rock", 5);

        game.register(alex);
        game.register(rock);

        int actual = game.round("alex", "rock");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondStrongPlayer() {
        Game game = new Game();
        Player alex = new Player(1, "alex", 10);
        Player rock = new Player(2, "rock", 25);

        game.register(alex);
        game.register(rock);

        int actual = game.round("alex", "rock");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DrawsPlayer() {
        Game game = new Game();
        Player alex = new Player(1, "alex", 10);
        Player rock = new Player(2, "rock", 10);

        game.register(alex);
        game.register(rock);

        int actual = game.round("alex", "rock");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notRegisteredPlayer() {
        Game game = new Game();
        Player alex = new Player(1, "alex", 10);
        Player rock = new Player(2, "rock", 10);

        game.register(alex);
        game.register(rock);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("pibo", "rock"));
    }

    @Test
    public void notRegisteredPlayer2() {
        Game game = new Game();
        Player alex = new Player(1, "alex", 10);
        Player rock = new Player(2, "rock", 10);

        game.register(alex);
        game.register(rock);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("alex", "pibo"));
    }

}
