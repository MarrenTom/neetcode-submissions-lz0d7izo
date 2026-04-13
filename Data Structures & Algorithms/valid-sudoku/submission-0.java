class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int x = 0; x < 9; x++) {
            for (int i = 0; i < 9; i++) {
                for (int j = i + 1; j < 9; j++) {
                    if (board[x][i] != '.' && board[x][i] == board[x][j]) {
                        return false;
                    }
                }
            }
            for (int i = 0; i < 9; i++) {
                for (int j = i + 1; j < 9; j++) {
                    if (board[i][x] != '.' && board[i][x] == board[j][x]) {
                        return false;
                    }
                }
            }
        }
        for (int square = 0; square < 9; square++) {
            for (int i = 0; i < 9; i++) {
                for (int j = i + 1; j < 9; j++) {
                    int a1 = (square/3)*3+i/3;
                    int b1 = (square%3)*3+i%3;
                    int a2 = (square/3)*3+j/3;
                    int b2 = (square%3)*3+j%3;

                    if (board[a1][b1] != '.' && board[a1][b1] == board[a2][b2]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
