import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // ROWS sathi
        for (int r = 0; r < 9; r++) {

            HashSet<Character> row = new HashSet<>();

            for (int c = 0; c < 9; c++) {

                char cell = board[r][c];

                if (cell == '.') {
                    continue;
                }

                if (row.contains(cell)) {
                    return false;
                }

                row.add(cell);
            }
        }

        // COLUMNS
        for (int c = 0; c < 9; c++) {

            HashSet<Character> col = new HashSet<>();

            for (int r = 0; r < 9; r++) {

                char cell = board[r][c];

                if (cell == '.') {
                    continue;
                }

                if (col.contains(cell)) {
                    return false;
                }

                col.add(cell);
            }
        }

        // 3 x 3 BOXES
        for (int row = 0; row < 9; row += 3) {

            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> box = new HashSet<>();

                for (int r = row; r < row + 3; r++) {

                    for (int c = col; c < col + 3; c++) {

                        char cell = board[r][c];

                        if (cell == '.') {
                            continue;
                        }

                        if (box.contains(cell)) {
                            return false;
                        }

                        box.add(cell);
                    }
                }
            }
        }

        return true;
    }
}