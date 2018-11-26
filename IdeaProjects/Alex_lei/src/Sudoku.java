
public class Sudoku {
    private int[][] matrix;

    public Sudoku(int[][] matrix) {
        this.matrix = matrix;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {7, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 6, 0, 0, 0, 0, 0},
                {0, 6, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}};
        Sudoku s = new Sudoku(sudoku);
        s.backTrace(0, 0);
    }

    /**
     * 数独算法
     *
     * @param i 行号
     * @param j 列号
     */
    private void backTrace(int i, int j) {
        if (i == 8 && j == 9) {
            System.out.println("获取正确解");
            printArray();
            return;
        }
        if (j == 9) {
            i++;
            j = 0;
        }


        if (matrix[i][j] == 0) {
            for (int k = 1; k <= 9; k++) {
                if (check(i, j, k)) {
                    matrix[i][j] = k;
                    backTrace(i, j + 1);
                    matrix[i][j] = 0;
                }
            }
        } else {
            backTrace(i, j + 1);
        }
    }

    /**
     * 判断给某行某列赋值是否符合规则
     *
     * @param row    被赋值的行号
     * @param line   被赋值的列号
     * @param number 赋的值
     * @return
     */
    private boolean check(int row, int line, int number) {
        for (int i = 0; i < 9; i++) {
            if (matrix[row][i] == number || matrix[i][line] == number) {
                return false;
            }
        }
        int tempRow = row / 3;
        int tempLine = line / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[tempRow * 3 + i][tempLine * 3 + j] == number) {
                    return false;
                }
            }
        }

        return true;
    }


     // 打印矩阵

    public void printArray() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}