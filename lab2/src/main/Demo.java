package main;

public class Demo {

    Sorter sorter;

    public Demo(Sorter sorter) {
        this.sorter = sorter;
    }

    public void demo(int[] list){
        list = sorter.sort(list);

        for (int x : list){
            System.out.print(x + " ");
        }
    }
}
