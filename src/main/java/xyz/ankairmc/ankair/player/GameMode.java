package xyz.ankairmc.ankair.player;

public enum GameMode {
    SURVIVAL(0),
    CREATIVE(1),
    ADVENTURE(2),
    SPECTATOR(3);

    public final int id;

    GameMode(int id) {
        this.id = id;
    }
}
