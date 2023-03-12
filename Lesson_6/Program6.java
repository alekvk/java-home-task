package Lesson_6;
import java.util.*;


public class Program6 {
    public static void main(String[] args) {
    
        Map map = new Map();
        map.getStartMap();
        MapToView startMap = new MapToView();
        System.out.println("Исходная карта: ");
        System.out.println(startMap.mapToString(map.getMap()));

        WaveAlgorithm lee = new WaveAlgorithm(map.getMap());
        CoordCell startCell = new CoordCell (1, 1);
        lee.WaveTracing(startCell);
        
        MapToView tracingMap = new MapToView();
        System.out.println("Карта после трассировки: ");
        System.out.println(tracingMap.mapToString(map.getMap()));

        CoordCell endCell = new CoordCell (10, 2);
        ArrayList<CoordCell>  minWay = lee.getRoad(endCell, startCell, map.getMap());
        
        for (CoordCell item : minWay) {
            System.out.println(item);
          
        }
        
    }

}
