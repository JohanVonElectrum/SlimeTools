package com.johanvonelectrum.slime;

import com.johanvonelectrum.slime.data.Chunk;

public class SlimeFinder {

    public static void main(String[] args) {
        for (Chunk chunk: Pattern.search()) {
            System.out.printf("(%s, %s): %s\n", chunk.x, chunk.z, chunk.percent);
        }
    }

}
