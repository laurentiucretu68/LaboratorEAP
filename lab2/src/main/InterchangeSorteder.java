package main;

public class InterchangeSorteder implements Sorter{
    @Override
    public int[] sort(int[] list) {
        for (int i=0; i<list.length - 1; i++)
            for (int j=i+1; j<list.length; j++)
                if (list[i] > list[j]){
                    int x = list[i];
                    list[i] = list[j];
                    list[j] = x;
                }
        return list;
    }
}
