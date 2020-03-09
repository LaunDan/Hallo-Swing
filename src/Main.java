import javax.swing.*;

public class Main extends JFrame{
    private JPanel Greeting;
    public Main(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setContentPane(Greeting);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new Main("Greeting");
        frame.setVisible(true);
    }
}
