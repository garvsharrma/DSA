package Recursion;

public class FindPathInMatrix {
    public static void main(String[] args) {
        System.out.println(find(3,3));
        findPath("", 3,3);
    }

    static int find(int r, int c){
        if(r == 1 || c == 1) return 1;
        int left = 0;
        int right = 0;
        left += find(r-1, c);
        right += find(r, c-1);
        return left + right;
    }

    static void findPath(String p, int r, int c){
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }
        if(r > 1 && c>1){
            findPath(p + "Dia", r-1, c-1);
        }
        if(c > 1){
            findPath(p + "R", r, c-1);
        }
        if(r > 1){
            findPath(p + "D", r-1, c);
        }
    }

}
