import java.awt.*;
import java.applet.*;

public class SampleBanner extends Applet implements Runnable
{
String st=" Hello World";
Thread t;
boolean b;

public void init()
{
setBackground(Color.green);
setForeground(Color.black);
}

public void start()
{
t=new Thread(this);
b=false;
t.start();
}

public void run()
{
char ch;
for( ; ;)
 {
try{
repaint();
Thread.sleep(250);
ch=st.charAt(0);
st=st.substring(1,st.length());
st=st+ch;
 }
catch(InterruptedException e)
{}
}
}

public void paint(Graphics g)
{
g.drawRect(1,1,300,150);
g.setColor(Color.yellow);
g.fillRect(1,1,300,150);
g.setColor(Color.red);
g.drawString(st,1,150);
}

}
