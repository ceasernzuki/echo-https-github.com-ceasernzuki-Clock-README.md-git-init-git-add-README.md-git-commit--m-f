import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;

    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;

    JLabel dateLabel;

    String day;


    String time;

    String date;



    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TIME IS RUNNING");
        this.setLayout(new FlowLayout());
        this.setSize(320, 200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a ");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd yyyy" );

        // four E spells out the whole day of week
        // one E only the abbreviation
        // 5 Ms showing the whole Month


        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,40));
        timeLabel.setForeground(new Color(0x00ff00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana", Font.PLAIN,35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana", Font.PLAIN,25));


        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);
        this.add(dateLabel);

        setTime();

    }

    public void setTime() {

        while (true) {

            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}