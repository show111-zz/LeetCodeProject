package ArrayChapter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Hannah Li on 2021-09-04
 * Project name: LeetcodeProject
 * LeetCode NO.: 54
 */
public class SpiralMatrix54 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},};
        System.out.println(spiralOrder(matrix));
    }

    /**
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     * Input: matrix = [
     * [1,2,3],
     * [4,5,6],
     * [7,8,9]
     * ]
     * Output: [1,2,3,6,9,8,7,4,5]
     * <p>
     * time : O(n * m)     n * m : 总元素个数
     * space : O(n * m)
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // step 1: from left to right. row不变，col变大
            for (int i = colBegin; i <= colEnd; i++) {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            // step 2: from top to bottom. col不变，row变大
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            // step 3: from right to left. row不变，col变小
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            // step 4: from bottom to top. col不变，row变小
            if (colBegin <= rowEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
}
