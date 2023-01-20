import javax.swing.JOptionPane;
public class GuiIntro {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name: ");
        JOptionPane.showMessageDialog(null, "hello " + name);
    }
}
