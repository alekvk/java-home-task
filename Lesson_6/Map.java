package Lesson_6;

public class Map {
    int[][] map;

    public void getStartMap() {
        int[][] map = {
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 00, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, -1, -1 },
            { -1, 00, -1, 00, -1, -1, -1, 00, 00, -1 },
            { -1, 00, -1, 00, -1, -1, -1, 00, 00, -1 },
            { -1, -1, -1, 00, -1, -1, -1, 00, -1, -1 },
            { -1, 00, 00, 00, -1, -1, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, -1, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, 00, -1 },
            { -1, 00, 00, -1, -1, 00, -1, 00, 00, -1 },
            { -1, 00, -1, -1, 00, 00, 00, -1, -1, -1 },
            { -1, 00, 00, 00, 00, -1, 00, 00, 00, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };

        this.map = map;
    }

    public int[][] getMap() {
        return map;
    }
}    

