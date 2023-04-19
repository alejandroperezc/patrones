import javax.swing.*;

class AlterDialog{
    String title, text, yesButtonText, noButtonText;

    public AlterDialog(String title, String text, String yesButtonText, String noButtonText) {
        this.title = title;
        this.text = text;
        this.yesButtonText = yesButtonText;
        this.noButtonText = noButtonText;


        AlterDialog setYes()   // establece el yesButtonText a "Ok"
        AlterDialog setNo()   // establece el yesButtonText a "Cancel"

        void show(){
            AlertDialog alertDialog = build();

            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.PAGE_AXIS));
            jPanel.add(new JLabel(alertDialog.text));
            if (alertDialog.yesButtonText != null)
                jPanel.add(new JButton(alertDialog.yesButtonText));
            if (alertDialog.noButtonText != null)
                jPanel.add(new JButton(alertDialog.noButtonText));


            JFrame jFrame = new JFrame(title);
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jFrame.add(jPanel);
            jFrame.pack();
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        AlterDialog alterDialog = new AlertDialog.Builder("Suscribirse", "Desea suscribirse a mi canal?")
                .setYes("Sí, suscribeme ahora mismo")
                .setNo("No, otro día")
                .show();

    }
}