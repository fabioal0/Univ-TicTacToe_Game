import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Button extends JButton implements ActionListener 
{
    private static Logic Game = new Logic();
    private final int line;
    private final int column;

    public Button(int line, int column, String title)
    {
        super(title);
 
        this.line = line;
        this.column = column;
    
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {    
        if(Game.getcCurrentaPlayer() == 1)
        { 
            this.setText("X");
        }
        else
        { 
            this.setText("O");
        }

        Game.play(this.line, this.column);

        if(Game.isFinished())
        {
            JOptionPane.showMessageDialog(null, Game.getWinner(), "Game Ended", 1);
        
            Graphics.ResetButtons();
            Game.resetLogic();
        }
    }
}
