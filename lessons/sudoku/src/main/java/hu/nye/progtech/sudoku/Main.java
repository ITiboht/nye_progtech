package hu.nye.progtech.sudoku;

import hu.nye.progtech.sudoku.model.MapVO;

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

    }
}
