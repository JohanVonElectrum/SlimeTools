package com.johanvonelectrum.slime;

import com.johanvonelectrum.slime.data.Chunk;

public class Pattern {

    public static boolean test(int ox, int oz, int cx, int cz) {
        int tx = (cx << 4) + 8;
        int tz = (cz << 4) + 8;
        int dx = tx - ox;
        int dz = tz - oz;
        return dx * dx + dz * dz < 0x4000;
    }

    public static Chunk[] count(int ox, int oz) {
        Chunk[] result = new Chunk[208];
        int i = 0;
        for (int cx = -8; cx < 9; cx++) {
            for (int cz = -8; cz < 9; cz++) {
                if (test(ox, oz, cx, cz))
                    result[i++] = new Chunk(cx, cz);
            }
        }
        return result;
    }

    public static Chunk[] search() {
        Chunk[] chunks = count(0, 0);
        for (Chunk chunk: chunks) {
            for (int x = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {
                    int tx = (chunk.x << 4) + x;
                    int tz = (chunk.z << 4) + z;
                    if (tx * tx + tz * tz < 0x4000)
                        chunk.percent++;
                }
            }
            chunk.percent = chunk.percent / 256;
        }
        return chunks;
    }

}
