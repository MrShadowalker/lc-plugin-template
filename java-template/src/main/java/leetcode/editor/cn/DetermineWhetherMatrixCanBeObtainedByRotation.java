package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {

            for (int i = 0; i < 4; i++) {
                rotate(mat);
                if (mat == target) {
                    return true;
                }
            }
            return false;
        }

        private void rotate(int[][] matrix) {
            int n = matrix.length;
            // 先沿对角线反转二维矩阵
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }

            // 然后反转二维矩阵的每一行
            for (int[] row : matrix) {
                reverse(row);
            }
        }

        // 反转一维数组
        private void reverse(int[] arr) {
            int i = 0, j = arr.length - 1;
            while (j > i) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new DetermineWhetherMatrixCanBeObtainedByRotation().new Solution();
        // put your test code here
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        System.out.println(solution.findRotation(mat, target));
    }
}