package Lesson_6;

import java.util.*;

class WaveAlgorithm {
    int[][] map;

    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public void WaveTracing(CoordCell  startCell) {
        Queue<CoordCell > q = new LinkedList<CoordCell>();
        q.add(startCell);
        map[startCell.x][startCell.y] = 1;

        while (q.size() != 0) {
            CoordCell  cell = q.poll();

            if (map[cell.x - 1][cell.y] == 0) {
                q.add(new CoordCell (cell.x - 1, cell.y));
                map[cell.x - 1][cell.y] = map[cell.x][cell.y] + 1;
            }
            if (map[cell.x][cell.y - 1] == 0) {
                q.add(new CoordCell (cell.x, cell.y - 1));
                map[cell.x][cell.y - 1] = map[cell.x][cell.y] + 1;
            }
            if (map[cell.x + 1][cell.y] == 0) {
                q.add(new CoordCell (cell.x + 1, cell.y));
                map[cell.x + 1][cell.y] = map[cell.x][cell.y] + 1;
            }
            if (map[cell.x][cell.y + 1] == 0) {
                q.add(new CoordCell (cell.x, cell.y + 1));
                map[cell.x][cell.y + 1] = map[cell.x][cell.y] + 1;
            }
        }
    }

    public ArrayList<CoordCell> getRoad(CoordCell  end, CoordCell  start, int[][] map) {
        ArrayList<CoordCell > path = new ArrayList<>();
        if (map[end.x][end.y] != 0 && map[end.x][end.y]!=-1) {
            CoordCell  currentPos = end;
            path.add(new CoordCell (currentPos.x, currentPos.y));

            System.out.println("Минимальный путь в графе");

            while (map[currentPos.x][currentPos.y] != map[start.x][start.y]) {

                if (map[currentPos.x - 1][currentPos.y] == map[currentPos.x][currentPos.y] - 1) {
                    currentPos.x = currentPos.x - 1;
                    path.add(new CoordCell (currentPos.x, currentPos.y));
                }

                else if (map[currentPos.x][currentPos.y - 1] == map[currentPos.x][currentPos.y] - 1) {
                    currentPos.y = currentPos.y - 1;
                    path.add(new CoordCell (currentPos.x, currentPos.y));
                }

                else if (map[currentPos.x + 1][currentPos.y] == map[currentPos.x][currentPos.y] - 1) {
                    currentPos.x = currentPos.x + 1;
                    path.add(new CoordCell (currentPos.x, currentPos.y));
                }

                else if (map[currentPos.x][currentPos.y + 1] == map[currentPos.x][currentPos.y] - 1) {
                    currentPos.y = currentPos.y + 1;
                    path.add(new CoordCell (currentPos.x, currentPos.y));
                }
            }

        } else {
            System.out.println("Путь не найден");
        }
        return path;
    }
}


