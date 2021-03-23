package com.johanvonelectrum.slime;

import com.johanvonelectrum.slime.data.Chunk;

public class SlimeFinder {

    public static void main(String[] args) {
        float b = 0;
        Chunk[] chunks = Pattern.search();
        for (Chunk chunk: chunks) {
            System.out.printf("(%s, %s): %s\n", chunk.x, chunk.z, chunk.surface);
            b += chunk.surface;
        }
        System.out.println("Spawn surface: " + b);
        System.out.println("Spawn efficiency: " + b / (chunks.length << 8));
    }

}
