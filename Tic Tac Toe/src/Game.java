import javax.swing.JFrame;
import javax.swing.JComponent;

public class Game 
{
    protected static JFrame frame;
    
    public Game(JComponent content)
    {  
        frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.revalidate();
        frame.setContentPane(content);
        frame.setVisible(true);      
    }
    
    public static void main(String[] args) throws Exception 
    {
        Graphics.Screen();
        new Game(Graphics.content);
    }
}
