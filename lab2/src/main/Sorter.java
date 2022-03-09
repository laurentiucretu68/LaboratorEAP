package main;

public interface Sorter {

    int[] sort(int[] list);

    static Sorter create(SorterType type){
        // Sintaxa de java 16 - de folosit la examen
        return switch (type){
            case BUBBLE -> new BubbleSorter();
            case INTER -> new InterchangeSorteder();
        };
    }

    enum SorterType{
        BUBBLE, INTER
    }
}
