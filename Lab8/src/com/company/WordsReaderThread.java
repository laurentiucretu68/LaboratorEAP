package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WordsReaderThread extends Thread{

    private final Path path;
    private Optional<List<String>>  result;

    public WordsReaderThread(String pathString) {
        this.path = Paths.get(pathString);
        this.result = Optional.empty();
    }

    public Optional<List<String>> getResult() {
        return this.result;
    }

    @Override
    public void run() {
        try {
            var content = Files.readString(path);
            var words = content.split("\\s+");  // unu sau mai multe spatii
            result = Optional.of(Arrays.asList(words));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
