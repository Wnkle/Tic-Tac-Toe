/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author marinaswi_sd2021
 */
public class GameController {
    char[] board = {'x','o','x','x','x','o','o','x','0'};
    char winner = check3x3Winner(board);
    

    public char check3x3Winner(char[] board) {
        //check horizontal
        if (board[0] == board[1] && board[1] == board[2]) {
            return board[2];
        }
        if (board[3] == board[4] && board[4] == board[5]) {
            return board[5];
        }
        if (board[6] == board[7] && board[7] == board[8]) {
            return board[8];
        }

        //check vertical
        if (board[0] == board[3] && board[3] == board[6]) {
            return board[6];
        }
        if (board[1] == board[4] && board[4] == board[7]) {
            return board[7];
        }
        if (board[2] == board[3] && board[5] == board[8]) {
            return board[8];
        }

        //check diagonal
        if (board[0] == board[4] && board[4] == board[8]) {
            return board[8];
        }
        if (board[2] == board[4] && board[4] == board[6]) {
            return board[6];
        } else {
            return 'w';
        }
    }

    public char check4x4Winner(char[] board) {
        //check horizontal
        if (board[0] == board[1] && board[1] == board[2] && board[2] == board[3]) {
            return board[3];
        }
        if (board[4] == board[5] && board[5] == board[6] && board[6] == board[7]) {
            return board[7];
        }
        if (board[8] == board[9] && board[9] == board[10] && board[10] == board[11]) {
            return board[11];
        }
        if (board[12] == board[13] && board[13] == board[14] && board[14] == board[15]) {
            return board[15];
        }

        //check vertical
        if (board[0] == board[4] && board[4] == board[8] && board[8] == board[12]) {
            return board[12];
        }
        if (board[1] == board[5] && board[5] == board[9] && board[9] == board[13]) {
            return board[13];
        }
        if (board[2] == board[6] && board[6] == board[10] && board[10] == board[14]) {
            return board[14];
        }
        if (board[3] == board[7] && board[7] == board[11] && board[11] == board[15]) {
            return board[15];
        }

        //check diagonal
        if (board[0] == board[5] && board[5] == board[10] && board[10] == board[15]) {
            return board[15];
        }
        if (board[3] == board[6] && board[6] == board[9] && board[9] == board[12]) {
            return board[12];
        } else {
            return 'w';
        }
    }

    public char check5x5Winner(char[] board) {
        //check horizontal
        if (board[0] == board[1] && board[1] == board[2] && board[2] == board[3] && board[3] == board[4]) {
            return board[4];
        }
        if (board[5] == board[6] && board[6] == board[7] && board[7] == board[8] && board[8] == board[9]) {
            return board[9];
        }
        if (board[10] == board[11] && board[11] == board[12] && board[12] == board[13] && board[13] == board[14]) {
            return board[14];
        }
        if (board[15] == board[16] && board[16] == board[17] && board[17] == board[18] && board[18] == board[19]) {
            return board[19];
        }
        if (board[20] == board[21] && board[21] == board[22] && board[22] == board[23] && board[23] == board[24]) {
            return board[24];
        }
        //check vertical
        if (board[0] == board[5] && board[5] == board[10] && board[10] == board[15] && board[15] == board[20]) {
            return board[20];
        }
        if (board[1] == board[6] && board[6] == board[11] && board[11] == board[16] && board[16] == board[21]) {
            return board[21];
        }
        if (board[2] == board[7] && board[7] == board[12] && board[11] == board[17] && board[17] == board[22]) {
            return board[22];
        }
        if (board[3] == board[8] && board[8] == board[13] && board[13] == board[18] && board[18] == board[23]) {
            return board[23];
        }
        if (board[4] == board[9] && board[9] == board[14] && board[14] == board[19] && board[19] == board[24]) {
            return board[24];
        }

        //check diagonal
        if (board[0] == board[6] && board[6] == board[12] && board[12] == board[18] && board[18] == board[24]) {
            return board[24];
        }
        if (board[4] == board[8] && board[8] == board[12] && board[12] == board[16] && board[16] == board[20]) {
            return board[20];
        } else {
            return 'w';
        }
    }
}
