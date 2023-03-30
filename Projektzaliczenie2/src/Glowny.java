import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager; import
javax.swing.UnsupportedLookAndFeelException; import
javax.swing.plaf.nimbus.NimbusLookAndFeel;

class Glowny {
    public static void main(String[] args) {
        Logowanie logowanie = new Logowanie();
         try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Logowanie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}