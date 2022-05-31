import java.awt.EventQueue;
import javax.swing.JFrame;

public class Start extends JFrame
{
    public Start()
    {
        initUI();
    }
    private void initUI()
    {
        add(new Game());
        setResizable(false);
        pack();
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            JFrame ex = new Start();
            ex.setVisible(true);
        });
    }
}