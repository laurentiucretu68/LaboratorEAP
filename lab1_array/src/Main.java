public class Main {
    public static void main(String[] args) {
        int[] x1 = new int[10];

        int [] x2 = {1,2,3,4};
        int [] x3 = new int[]{1,2,3,4};

        System.out.println(x1.length);

        int [][] m = new int[3][];
        m[0] = new int[10];
        m[1] = new int[4];

        int c = 0;

        for (int i=0; i<m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                c++;
                m[i][j] = c;
            }
        }


        for (int[] mle : m){
            for (int el: mle){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
