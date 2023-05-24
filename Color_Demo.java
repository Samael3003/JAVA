import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Color_Demo extends Frame
{
     Label lbl1,lbl2,lbl3,lbl4,lbl5;
     public Color_Demo()
     {
          lbl1 = new Label("All The Best");
          lbl1.setForeground(Color.red);
          add(lbl1);
          lbl2 = new Label("All The Best");
          lbl2.setForeground(Color.magenta);
          add(lbl2);
          lbl3 = new Label("All The Best");
          lbl3.setForeground(Color.blue);
          add(lbl3);
          lbl4 = new Label("All The Best");
          lbl4.setForeground(Color.green);
          add(lbl4);
          lbl5 = new Label("All The Best");
          lbl5.setForeground(Color.cyan);
          add(lbl5);
          setVisible(true);
          setSize(400, 300);
          setLayout(new FlowLayout());
          setBackground(Color.gray);
     }
     public void paint(Graphics g)
     {
          g.setColor(Color.magenta);
          g.drawString("All The Best",100,100);
          g.setColor(Color.cyan);
          g.drawString("All The Best",150,150);
          g.setColor(Color.red);
          g.drawString("All The Best",200,200);
          g.setColor(Color.black);
          g.drawString("All The Best",250,250);
    }
     public static void main(String[] args)
     {
          new Color_Demo();
     }
}
