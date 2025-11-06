import java.applet.Applet;

import java.awt.Graphics;

public class SumApplet extends Applet {

int num1, num2, sum;

public void init() {

String s1=getParameter("a");

String s2=getParameter("b");

num1 =Integer.parseInt(s1);

num2 =Integer.parseInt(s2);

sum = num1 + num2;

}

public void paint(Graphics g) {

g.drawString("First Number : "+ num1, 20, 40);

g.drawString("Second Number: "+ num2, 20, 60);

g.drawString("Sum = "+ sum, 20, 80);

}

}

html 

 

<html>

<body>

<appletcode="SumApplet.class"width="300"height="200">

<paramname="a"value="25">

<paramname="b"value="15">

</applet>

</body>

</html>
