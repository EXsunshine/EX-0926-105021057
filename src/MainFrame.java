import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Timer;

public class MainFrame extends Frame {
    private Button but1= new Button("ADD");
    private Button but2= new Button("SUB");
    private Label lab1 = new Label("_(:312)_");
    int x = 0;int lbx=100;int lby=100;
    private Timer tim ;
    public MainFrame(){
        initComp();
    }
    private void initComp(){

    this.setBounds(100,100,500,400);
    addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
        System.exit(0);
        }
    });
    this.setLayout(null);
    but1.setBounds(50,50,50,40);
    but2.setBounds(100,50,50,40);
    this.add(but1);
    this.add(but2);
    lab1.setBounds(lbx,lby,80,60);
    this.add(lab1);
        MainFrame.this.setTitle("030");
    but1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
     //       lab1.setText(Integer.toString(++x));
      //      MainFrame.this.setTitle(Integer.toString(x));
            tim.start();
        }
    });
    but2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lab1.setText(Integer.toString(--x));
            MainFrame.this.setTitle(Integer.toString(x));
        }
    });
    tim = new Timer(20, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(lbx<=MainFrame.this.getWidth()-100){
                lbx+=50;
                lab1.setLocation(lbx,lby);
            }else{
                    lbx-=100;

            }



        }
    });

    }
}
