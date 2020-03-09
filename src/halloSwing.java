import javax.swing.*;

public class halloSwing extends JFrame{
    private JPanel Greeting;
    public halloSwing(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setContentPane(Greeting);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new halloSwing("Greeting");
        frame.setVisible(true);
    }
}
