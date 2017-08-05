package head_10.player;

public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        new Player("Taiger Vudo");
        System.out.println(Player.playerCount);
    }
}
