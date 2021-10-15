package hu.nye.progtech.sudoku.model;

import java.util.Arrays;
import java.util.Objects;

public final class MapVO {

    private final int numberofRows;
    private final int numberofColumns;
    private final int[][] map;
    private final boolean[][] fixed;

    public MapVO(int numberofRows, int numberofColumns, int[][] map, boolean[][] fixed) {
        this.numberofRows = numberofRows;
        this.numberofColumns = numberofColumns;
        this.map = deepCopy(map);
        this.fixed = deepCopy(fixed);
    }

    public int getNumberofRows() {
        return numberofRows;
    }

    public int getNumberofColumns() {
        return numberofColumns;
    }

    public int[][] getMap() {
        return deepCopy(this.map);
    }

    public boolean[][] getFixed() {
        return deepCopy(this.fixed);
    }

    private int[][] deepCopy(int [][] map) {
        int [][] result = new int[map.length][];

        for(int i=0; i<map.length; i++) {
            result[i] = new int[map[i].length];
            for (int j=0; j < map[i].length; j++){
                result [i][j] = map[i][j];
            }
        }

        return result;
    }

    private boolean[][] deepCopy(boolean [][] map) {
        boolean [][] result = new boolean[map.length][];

        for(int i=0; i<map.length; i++) {
            result[i] = new boolean[map[i].length];
            for (int j=0; j < map[i].length; j++){
                result [i][j] = map[i][j];
            }
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapVO mapVO = (MapVO) o;
        return numberofRows == mapVO.numberofRows && numberofColumns == mapVO.numberofColumns && Arrays.deepEquals(map, mapVO.map) && Arrays.deepEquals(fixed, mapVO.fixed);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numberofRows, numberofColumns);
        result = 31 * result + Arrays.deepHashCode(map);
        result = 31 * result + Arrays.deepHashCode(fixed);
        return result;
    }

    @Override
    public String toString() {
        return "MapVO{" +
                "numberofRows=" + numberofRows +
                ", numberofColumns=" + numberofColumns +
                ", map=" + Arrays.deepToString(map) +
                ", fixed=" + Arrays.deepToString(fixed) +
                '}';
    }
}
