import javax.swing.*;

public class MainFrame extends JFrame{
    private JPanel Greeting;
    private JLabel textLabel;

    public MainFrame(String title){
        super(title);
        setSize(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Greeting);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new MainFrame("Greeting");
        frame.setVisible(true);
    }
}
