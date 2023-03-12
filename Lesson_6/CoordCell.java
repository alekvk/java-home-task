package Lesson_6;

public class CoordCell  {
    int x, y;

    public CoordCell (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("ячейка x: %d  y: %d", x, y);
    }
}
