package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = List.of("poezie_1.txt", "poezie_2.txt");
        List<WordsReaderThread> wordsReaderThreadList = new ArrayList<>();

        for (String fileName : list){
            WordsReaderThread wordsReaderThread = new WordsReaderThread(fileName);
            wordsReaderThread.start();
            wordsReaderThreadList.add(wordsReaderThread);
        }

        try{
            for (WordsReaderThread wordsReaderThread : wordsReaderThreadList) {
                wordsReaderThread.join();  // asteptam dupa fiecare fir de executie sa se termine
            }

            Set<String> words = new HashSet<>();
            for (WordsReaderThread wordsReaderThread : wordsReaderThreadList) {
                var result = wordsReaderThread.getResult().orElse(List.of());
                words.addAll(result);
            }

            System.out.println(words);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
