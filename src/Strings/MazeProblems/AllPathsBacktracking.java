package Strings.MazeProblems;

// BACKTRACKING - found a potential answer, later realised not the correct answer,
// so revert the changes made by below functions, up to that point


import java.util.Arrays;

public class AllPathsBacktracking {
    public static void main(String[] args) {
        boolean[][] maze = {                   // false means obstacle
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        allPath("", maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("", maze, 0, 0, path, 1);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] == false) return;   // if obstacle or visited, return

        //considering, this path, so set this cell as false (visited)
        maze[r][c] = false;

        if (c < maze[0].length - 1) {
            allPath(p + "R", maze, r, c + 1);
        }
        if (r < maze.length - 1) {
            allPath(p + "D", maze, r + 1, c);
        }
        if (c > 0) {
            allPath(p + "L", maze, r, c - 1);
        }
        if (r > 0) {
            allPath(p + "U", maze, r - 1, c);
        }

        // this is the point where function will be over,
        // so before the function gets removed, revert the changes made in the function
        maze[r][c] = true;

    }


    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (maze[r][c] == false) return;   // if obstacle or visited, return

        //considering, this path, so set this cell as false (visited)
        maze[r][c] = false;
        path[r][c] = step;

        if (c < maze[0].length - 1) {
            allPathPrint(p + "R", maze, r, c + 1, path, step+1);
        }
        if (r < maze.length - 1) {
            allPathPrint(p + "D", maze, r + 1, c, path, step+1);
        }
        if (c > 0) {
            allPathPrint(p + "L", maze, r, c - 1, path, step+1);
        }
        if (r > 0) {
            allPathPrint(p + "U", maze, r - 1, c, path, step+1);
        }

        // this is the point where function will be over,
        // so before the function gets removed, revert the changes made in the function
        maze[r][c] = true;
        path[r][c] = 0;

    }
}