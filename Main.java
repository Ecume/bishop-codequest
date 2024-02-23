
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String[] RC = input.nextLine().split(",");
                String[] r1c1 = input.nextLine().split(",");
                String[] r2c2 = input.nextLine().split(",");


                int row = Integer.parseInt(RC[0]);
                int col = Integer.parseInt(RC[1]);

                int[][] board = new int[row][col];

                int startRow = Integer.parseInt(r1c1[0]);
                int startCol = Integer.parseInt(r1c1[1]);

                int endRow = Integer.parseInt(r2c2[0]);
                int endCol = Integer.parseInt(r2c2[1]);

                int rowDiff = endRow - startRow;
                int colDiff = endCol - startCol;

                if(row < 2 || row > 1000 || col <2 || col > 1000){
                    System.out.println("No");
                }


                if((row >= 2 && row <= 1000) && (col >= 2 && col <= 1000)) {


                    if (startRow > row || endRow > row || startCol > col || endCol > col ||
                            startRow < 1 || endRow < 1 || startCol < 1 || endCol < 1) {
                        System.out.println("No");
                    } else if (rowDiff == 0 && colDiff == 0) {
                        System.out.println("No");
                    } else if (rowDiff == colDiff) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }

                }

            }

        }
    }
}
