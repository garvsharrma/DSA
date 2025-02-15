package Strings.MazeProblems;

public class FindPathInMatrix {
    public static void main(String[] args) {
        System.out.println(find(0,0));       // returns number of paths
        findPath("", 0,0);                // returns paths

        boolean[][] maze = {                   // false means obstacle
                {true, true, false},
                {true, false, true},
                {false, true, true},
        };

        findPathWithObstacles("",maze, 0,0);
    }

    static int find(int r, int c){
        if(r == 2 || c == 2) return 1;
        int left = 0;
        int right = 0;
        left += find(r+1, c);
        right += find(r, c+1);
        return left + right;
    }

    static void findPath(String p, int r, int c){
        if(r==2 && c==2) {
            System.out.println(p);
            return;
        }
        if(r < 2 && c<2){
            findPath(p + "D", r+1, c+1);
        }
        if(c < 2){
            findPath(p + "H", r, c+1);
        }
        if(r < 2){
            findPath(p + "V", r+1, c);
        }
    }

    static void findPathWithObstacles(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(maze[r][c]==false) return;   // if obstacle, return

        if(r < maze.length-1 && c<maze[0].length-1){
            findPathWithObstacles(p + "D", maze, r+1, c+1);
        }
        if(c < maze[0].length-1){
            findPathWithObstacles(p + "H", maze, r, c+1);
        }
        if(r < maze.length-1){
            findPathWithObstacles(p + "V", maze, r+1, c);
        }
    }
}
