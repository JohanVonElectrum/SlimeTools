package com.johanvonelectrum.slime.data;

public class Chunk {

    public int x, z, surface;

    public Chunk(int x, int z) {
        this(x, z, 0);
    }

    public Chunk(int x, int z, int surface) {
        this.x = x;
        this.z = z;
        this.surface = surface;
    }
}
