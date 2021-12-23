import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Graphics 
{
    protected static JComponent content;
    private static Button[] buttons = new Button[9];

    public Graphics(){}
    
    public static void Screen() throws IOException
    {
        // Base
        content = new JPanel();
        content.setBackground(Color.BLACK);
        content.setLayout(new BorderLayout());
    
        // Title
        JLabel title=new JLabel("Tic Tac Toe");
        title.setFont(new Font("title",Font.CENTER_BASELINE,78));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.ORANGE);
        content.add(title,BorderLayout.NORTH);

        // Board
        JComponent boardContent = new JPanel();
        boardContent.setBackground(Color.LIGHT_GRAY);
        boardContent.setLayout(new GridLayout(3,3));

        for(int i=0 ; i<3 ; i++)
        {
            for(int k=0 ; k<3 ; k++)
            {
                buttons[i*3+k] = new Button(i,k,"");
                boardContent.add(buttons[i*3+k]);
            }
        }
        content.add(boardContent,BorderLayout.CENTER);
    }

    public static void ResetButtons()
    {
        for(Button button : buttons)
        {
            button.setText("");
        }
    }
}

