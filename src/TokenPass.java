public class TokenPass {

    private int[] board;
    private int currentPlayer;

    /** Creates the board array to be of size playerCount and fills it with
     * random integer values from 1 to 10, inclusive. Initializes currentPlayer to a
     * random integer value in the range between 0 and playerCount-1, inclusive.
     * @param playerCount the number of players
     */
    public TokenPass(int playerCount) {

        board = new int[playerCount];

        for(int count=0;count<board.length;count++)
            board[count] = (int)(Math.random() * 10);
            currentPlayer = (int)(Math.random()*(playerCount - 1));
    }

    /** Distributes the tokens from the current player's position one at a time to each player in
     * the game. Distribution begins with the next position and continues until all the tokens
     * have been distributed. If there are still tokens to distribute when the player at the
     * highest position is reached, the next token will be distributed to the player at position 0.
     * Precondition: the current player has at least one token.
     * Postcondition: the current player has not changed.
     */
    public void distributeCurrentPlayerTokens() {

        int token = board[currentPlayer];
        int spot = currentPlayer+1;
        board[currentPlayer] = 0;

        while (token!=0){
            if (spot>= board.length){
                spot=0;
            }
            token--;
            board[spot]++;
            spot++;
        }
    }
    public void setBoard(int[]board){
        this.board=board;
    }
    public int[] getBoard() {
        return board;
    }
    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    public int getCurrentPlayer() {
        return currentPlayer;
    }
}
