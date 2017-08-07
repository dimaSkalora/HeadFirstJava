package head_14.exercise;

import java.io.Serializable;

public class DungeonGame implements Serializable{
    private int x=3;
    transient long y=4;
    private short z=5;

    public int getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public short getZ() {
        return z;
    }
}
