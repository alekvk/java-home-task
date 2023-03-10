package Lesson_5;

import java.util.*;

public class program {
    public static void main(String[] args) {
       

        int [][] map = new int [][] 
        {
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

        System.out.println("Исходная карта: ");
        System.out.println("");
        System.out.println(mapToView(map));
        
        int[] startCell = getCoordPoint(1,1);

        WaveTracing(map, startCell);

        System.out.println("Карта после трассировки: ");
        System.out.println("");
        System.out.println(mapToView(map));
       
    }    

    public static int[] getCoordPoint  (int x, int y) {
            return new int[] {x, y};
    }
    
    public static String mapToView (int[][] map) {
            StringBuilder  sb = new StringBuilder();

            for (int row = 0; row < map.length; row++) {
                for (int col = 0; col < map[row].length; col++) {
                    sb.append(String.format("%3d",map[row][col]));
                }
                sb.append("\n");
            }
            return sb.toString();
    } 

    public static void WaveTracing(int[][] map, int[] startCell) {
            Queue<int[]> q = new LinkedList<int[]>();
            q.add(startCell);
            map[ startCell[0] ][ startCell[1] ] = 1;

            while (q.size() != 0) {
                int[] currentPos = q.poll();
                int x = currentPos[0];
                int y = currentPos[1];

                if(map[x - 1][y] == 0) {
                    int[] temp = new int[] { x - 1, y };
                    q.add(temp);
                    map[x - 1] [ y ] = map[x][y] + 1;
                }

                if (map[x][y - 1] == 0) {
                    int[] temp = new int[] { x, y - 1 };
                    q.add(temp);
                    map[x][y - 1] = map[x][y] + 1;
                } 

                if (map[x + 1][y] == 0) {
                    int[] temp = new int[] { x + 1, y };
                    q.add(temp);
                    map[x + 1][y] = map[x][y] + 1;
                } 
                
                if (map[x][y + 1] == 0) {
                    int[] temp = new int[] { x, y + 1 };
                    q.add(temp);
                    map[x][y + 1] = map[x][y] + 1;
                }
            }
    }
}

            


    

