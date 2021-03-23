package com.johanvonelectrum.slime.data;

public class Chunk {

    public int x, z;
    public float percent;

    public Chunk(int x, int z) {
        this(x, z, 0);
    }

    public Chunk(int x, int z, float percent) {
        this.x = x;
        this.z = z;
        this.percent = percent;
    }
}
