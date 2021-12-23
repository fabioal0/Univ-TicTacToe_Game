public class Logic 
{
    private int [][] board; 
    private int[] result;
    private int currentaPlayer;
    private int round;
    private String winner;

    public Logic() 
    {
        this.board = new int[3][3];
        this.result = new int[8];
        this.currentaPlayer = 1;
        this.round = 0;
        this.winner = "Draw";
    }
    
    public boolean play(int column, int line) 
    {
        if (board[column][line] == 0) 
        {
            round ++;
            board[column][line] = currentaPlayer;
            result[column] += currentaPlayer;
            result[3+line] += currentaPlayer;

            if(column==line) 
            {
                result[6] += currentaPlayer;

                if(column==1)
                {
                    result[7] += currentaPlayer;
                }
            }
            else if(column+line==2)
            {
                result[7] += currentaPlayer;
            }

            if(currentaPlayer==1) 
            {
                currentaPlayer = 10;
            }
            else
            {
                currentaPlayer = 1;
            }
            return true;
        } 
        return false;
    }

    public boolean isFinished() 
    {
        for (int pos : result) 
        {
            if (pos == 3) 
            {
                winner = "Player 1 win";
                return true;
            } 
            else if (pos == 30) 
            {
                winner = "Player 2 win";
                return true;
            } 
            else if (round == 9) 
            {
                return true;
            }
        }
        return false;
    }

    public int getcCurrentaPlayer()
    {
        return this.currentaPlayer;
    }

    public String getWinner() 
    {
        return this.winner;
    }

    public void resetLogic()
    {
        this.board = new int[3][3];
        this.result = new int[8];
        this.currentaPlayer = 1;
        this.round = 0;
        this.winner = "Draw";
    }
}
