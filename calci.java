import java.util.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class calci extends Frame{
    public calci(){
        setSize(500, 500);
        setTitle("COLCULATOR");
        Color clr=new Color(80,80,80);
        setBackground(clr);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        Button b=new Button("+");
        Button b1=new Button("-");
        Button b2=new Button("*");
        Button b3=new Button("=");
        Button b5=new Button("/");
        Button b6=new Button(".");
        Button b7=new Button("1");
        Button b8=new Button("2");
        Button b9=new Button("3");
        Button b11=new Button("4");
        Button b12=new Button("5");
        Button b13=new Button("6");
        Button b14=new Button("7");
        Button b15=new Button("8");
        Button b16=new Button("9");
        Button b17=new Button("0");


        Color cl=Color.CYAN;
        Color cln=Color.red;
        Color cul=Color.darkGray;
        Font myFont = new Font("Courier", Font.BOLD,25);       
        

        //++
        b.setBounds(385, 110, 30, 30);
        b.setBackground(cl);
        b.setForeground(cln);
        b.setFont(myFont);
        add(b);  
        

        //--
        b1.setBounds(350, 110, 30, 30);
        b1.setBackground(cl);
        b1.setForeground(cln);
        b1.setFont(myFont);
        add(b1);
        //* *
        b2.setBounds(350,75,30,30);
        b2.setBackground(cl);
        b2.setForeground(cln);
        b2.setFont(myFont);
        add(b2);
        //==
        b3.setBounds(385, 75, 30,30);
        b3.setBackground(cl);
        b3.setForeground(cln);
        b3.setFont(myFont);
        add(b3);
        
        ///
        b5.setBounds(420, 75, 30, 30);
        b5.setBackground(cl);
        b5.setForeground(cln);
        b5.setFont(myFont);
        add(b5);
        //..
        b6.setBounds(420, 110, 30, 30);
        b6.setBackground(cl);
        b6.setForeground(cln);
        b6.setFont(myFont);
        add(b6);
        //1
        b7.setBounds(400, 400, 70, 70);
        b7.setBackground(cl);
        b7.setForeground(cln);
        b7.setFont(myFont);
        add(b7);
        //2
        b8.setBounds(330, 400, 70, 70);
        b8.setBackground(cl);
        b8.setForeground(cln);
        b8.setFont(myFont);
        add(b8);
        //3
        b9.setBounds(260, 400, 70, 70);
        b9.setBackground(cl);
        b9.setForeground(cln);
        b9.setFont(myFont);
        add(b9);
        //4
        b11.setBounds(400, 330, 70, 70);
        b11.setBackground(cl);
        b11.setForeground(cln);
        b11.setFont(myFont);
        add(b11);
        //5
        b12.setBounds(330, 330, 70, 70);
        b12.setBackground(cl);
        b12.setForeground(cln);
        b12.setFont(myFont);
        add(b12);
        //6
        b13.setBounds(260, 330, 70, 70);
        b13.setBackground(cl);
        b13.setForeground(cln);
        b13.setFont(myFont);
        add(b13);
        //7
        b14.setBounds(400, 260, 70, 70);
        b14.setBackground(cl);
        b14.setForeground(cln);
        b14.setFont(myFont);
        add(b14);
        //8
        b15.setBounds(330, 260, 70, 70);
        b15.setBackground(cl);
        b15.setForeground(cln);
        b15.setFont(myFont);
        add(b15);
        //9
        b16.setBounds(260, 260, 70, 70);
        b16.setBackground(cl);
        b16.setForeground(cln);
        b16.setFont(myFont);
        add(b16);
        //0
        b17.setBounds(260, 220, 210, 40);
        Color color2=Color.GRAY;
        b17.setForeground(cln);
        b17.setBackground(color2);
        b17.setFont(myFont);
        add(b17);

        Label l=new Label("YOUR ANSWER-");
        Label a= new Label(" NUMBER 1 - ");
        Label c= new Label("NUMBER 2 - ");
        Label d= new Label("NUMBER 3 - ");

        l.setBackground(cul);
        l.setForeground(cln);
        l.setBounds(40, 50, 110, 25);
        add(l);

        a.setBounds(40, 80, 110, 25);
        a.setBackground(cul);
        a.setForeground(cln);
        add(a);

        c.setBounds(40, 110, 110, 25);
        c.setBackground(cul);
        c.setForeground(cln);
        add(c);

        d.setBounds(40, 140, 110, 25);
        d.setBackground(cul);
        d.setForeground(cln);
        add(d);

        Label e= new Label("FOR NUMBER 1 - ");
        Label f= new Label("FOR NUMBER 3 - ");
        
        f.setBounds(45, 190, 210,25);
        f.setBackground(cul);
        f.setForeground(cln);
        add(f);

        e.setBounds(260, 190, 210,25);
        e.setBackground(cul);
        e.setForeground(cln);
        add(e);


        TextField tr=new TextField();
        TextField tr1=new TextField();
        TextField tr2=new TextField();

        tr.setBounds(150, 50,150, 25);
        add(tr);
        tr1.setBounds(150, 80,150, 25);
        add(tr1);
        tr2.setBounds(150, 110,150, 25);
        add(tr2);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr2.setText("+");
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr2.setText("-");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr2.setText("*");
            }
        });
        //=/.
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // tr2.setText("=");
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr2.setText("/");
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr2.setText(".");
            }
        });
        

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("1");
            }
        });

         b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("2");
            }
        });

         b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("3");
            }
        });

         b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("4");
            }
        });

         b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("5");
            }
        });

         b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("6");
            }
        });

         b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("7");
            }
        });

         b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("8");
            }
        });

         b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("9");
            }
        });

         b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr1.setText("0");
            }
        }); 
 
        TextField tr3=new TextField();
        tr3.setBounds(150, 140,150, 25);
        add(tr3);

        Button b19=new Button("1");
        Button b20=new Button("2");
        Button b21=new Button("3");
        Button b22=new Button("4");
        Button b23=new Button("5");
        Button b24=new Button("6");
        Button b25=new Button("7");
        Button b26=new Button("8");
        Button b27=new Button("9");
        Button b28=new Button("0");

         //1
        b19.setBounds(186, 400, 70, 70);
        b19.setBackground(cl);
        b19.setForeground(cln);
        b19.setFont(myFont);
        add(b19);
        //2
        b20.setBounds(115, 400, 70, 70);
        b20.setBackground(cl);
        b20.setForeground(cln);
        b20.setFont(myFont);
        add(b20);
        //3
        b21.setBounds(45, 400, 70, 70);
        b21.setBackground(cl);
        b21.setForeground(cln);
        b21.setFont(myFont);
        add(b21);
        //4
        b22.setBounds(186, 330, 70, 70);
        b22.setBackground(cl);
        b22.setForeground(cln);
        b22.setFont(myFont);
        add(b22);
        //5
        b23.setBounds(115, 330, 70, 70);
        b23.setBackground(cl);
        b23.setForeground(cln);
        b23.setFont(myFont);
        add(b23);
        //6
        b24.setBounds(45, 330, 70, 70);
        b24.setBackground(cl);
        b24.setForeground(cln);
        b24.setFont(myFont);
        add(b24);
        //7
        b25.setBounds(186, 260, 70, 70);
        b25.setBackground(cl);
        b25.setForeground(cln);
        b25.setFont(myFont);
        add(b25);
        //8
        b26.setBounds(115, 260, 70, 70);
        b26.setBackground(cl);
        b26.setForeground(cln);
        b26.setFont(myFont);
        add(b26);
        //9
        b27.setBounds(45, 260, 70, 70);
        b27.setBackground(cl);
        b27.setForeground(cln);
        b27.setFont(myFont);
        add(b27);
        //0
        b28.setBounds(45, 220, 210, 40);
        Color color3=Color.GRAY;
        b28.setForeground(cln);
        b28.setBackground(color3);
        b28.setFont(myFont);
        add(b28);

        b28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("0");
            }
        });

        b27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("9");
            }
        });

        b26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("8");
            }
        });

        b25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("7");
            }
        });

        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("6");
            }
        });

        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("5");
            }
        });

        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("4");
            }
        });

        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("3");
                
            }
        });

        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("2");
            }
        });

        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tr3.setText("1");
            }
        });
        
    }
    public static void main(String args[]){
        new calci();
    }
}    