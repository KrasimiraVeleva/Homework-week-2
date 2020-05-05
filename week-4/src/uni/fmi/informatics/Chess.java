package uni.fmi.informatics;

import java.util.Scanner;

public class Chess {

    static final int LOWEST_INPUT = 1;
    static final int GREATEST_INPUT = 6;

    static final int PLAYER_WHITE = 1;
    static final int PLAYER_BLACK = 2;

    public static void Main(String[] args) {

        boolean isGameOver = false;
        boolean isGameRunning = true;
        int activePlayer = 1;

        int[][] gameBoard = new int[GREATEST_INPUT][GREATEST_INPUT];

        Scanner gameInputScanner = new Scanner(System.in);

        renderGameBoard(gameBoard);

        while (isGameRunning) {

            System.out.println("Input row:");
            int pieceRowPositionInput = gameInputScanner.nextInt();

            if (isGameBoardInputInvalid(pieceRowPositionInput)) {
                System.out.println("Incorrect input! Please try again with data between 1 and 6");
                continue;
            }

            System.out.println("Input col:");
            int pieceColPositionInput = gameInputScanner.nextInt();

            if (isGameBoardInputInvalid(pieceColPositionInput)) {
                System.out.println("Incorrect input! Please try again with data between 1 and 6");
                continue;
            }

            int piecePositionRow = pieceRowPositionInput - 1;
            int piecePositionCol = pieceColPositionInput - 1;

        }
    }

    public static int getActivePlayer(int current) {

        return (current == PLAYER_WHITE) ? PLAYER_BLACK :
                PLAYER_WHITE;
    }

    public static boolean isGameBoardInputInvalid(int inputData) {
        return inputData < LOWEST_INPUT ||
                inputData > GREATEST_INPUT;
    }

    public static int getGameBoardPlayer(int[][] gameBoard, int row, int col) {
        return gameBoard[row][col];
    }

    public static String getGameBoardMark(int[][] gameBoard, int row, int col) {

        int player = getGameBoardPlayer(gameBoard, row, col);

        if (player == PLAYER_WHITE) return " ";
        if (player == PLAYER_BLACK) return " ";
        return " ";
    }

    public static void renderGameBoard(int[][] gameBoard) {

        for (int row = 0; row < GREATEST_INPUT; row++) {
            for (int col = 0; col < GREATEST_INPUT; col++) {
                System.out.print(getGameBoardMark(gameBoard, row, col));
            }
            System.out.println();
        }
    }
}






