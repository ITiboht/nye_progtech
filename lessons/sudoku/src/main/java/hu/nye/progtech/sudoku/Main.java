package hu.nye.progtech.sudoku;

import hu.nye.progtech.sudoku.model.MapVO;
import hu.nye.progtech.sudoku.service.exception.MapReadException;
import hu.nye.progtech.sudoku.service.map.reader.MapReader;
import hu.nye.progtech.sudoku.service.map.reader.impl.MapReaderImpl;

public class Main {

    public static void main(String[] args) {

        int [][] map = {
                {0,1},
                {2,3}
        };
        boolean[][] fixed = {
                {false,true},
                {true,true}
        };
        MapVO mapVO = new MapVO(2, 2, map, fixed);
        System.out.println(mapVO);

        MapReader mapReader = new MapReaderImpl();
        try {
            mapReader.readMap();
        } catch (MapReadException e) {
            e.printStackTrace();
        }

    }
}
