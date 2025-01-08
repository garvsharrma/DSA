public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,300},
                {2,3,4},
                {12,3,5,8,0},
                {34,5,5,8},
                {50+3}
        };
        System.out.println("Max wealth is: "+calcMax(arr));
    }

    static int calcMax(int[][] arr){
        int Max = 0;
        int Maximum = 0;
        for (int row = 0; row < arr.length; row++) {
            Max = 0;
            for (int col = 0; col < arr[row].length; col++) {
                Max += arr[row][col];
            }Maximum = Math.max(Max,Maximum);
        }return Maximum;
    }

}
