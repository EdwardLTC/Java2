package lab6;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;

public class EdwardOclock extends Thread {
    private JButton btn;

    public EdwardOclock(JButton btn) {
        this.btn = btn;
    }

    @Override
    public void run() {
        while (true) {
            try {
                SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss aa");
                String time = format.format(new Date());
                btn.setText(time);
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }

    }
}
