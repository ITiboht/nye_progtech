package hu.nye.progtech.sudoku.service.map.reader.impl;

import hu.nye.progtech.sudoku.Main;
import hu.nye.progtech.sudoku.service.exception.MapReadException;
import hu.nye.progtech.sudoku.service.map.reader.MapReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MapReaderImpl implements MapReader {

    @Override
    public List<String> readMap() throws MapReadException {

        InputStream inputStream = MapReaderImpl.class.getClassLoader().getResourceAsStream("map/beginner.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        List<String> result = new ArrayList<>();

        try {
            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            throw new MapReadException("Failed to read map");
        }

        return null;
    }



}
