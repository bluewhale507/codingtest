package programers.safe_zone;

import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int[][] copyBoard = new int[board.length][board[0].length];
        int tempIndex = 0;
        int answer = 0;

        //결과를 출력할 배열 생성
        for(int[] rows : board) {
            copyBoard[tempIndex] = Arrays.copyOf(rows,board[tempIndex].length);
            tempIndex++;
        }

        //지뢰 인덱스 찾아서 위험지역 설정
        for(int i=0;i<board.length;i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 1)
                    setDangerArea(copyBoard,i,j);
            }
        }

        //안전지대 합산
        for(int[]rows : copyBoard) {
            for(int i : rows) {
                System.out.print(i);
                if(i == 0) answer++;
            }
            System.out.println();
        }
        System.out.println();
        return answer;
    }
    //위혐지역 설정
    private void setDangerArea(int[][] copyBoard, int row, int col) {

        for(int r=row-1; r<=row+1; r++) {
            if(r>copyBoard.length-1 || r<0) continue;

            for(int c=col-1; c<=col+1; c++) {
                if(c>copyBoard.length-1 || c<0) continue;
                copyBoard[r][c] = 1;
            }
        }
    }
}

class SolutionEx {
    public static void main(String[] args) {
        int[][] test1 = {{0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        Solution sol = new Solution();

        System.out.println(sol.solution(test1));
    }
}
