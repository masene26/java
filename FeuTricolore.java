package tricolore;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
 abstract class FeuTricolore {
	 protected Statechart arrete;
	 protected AbstractStatechart enMarche;
	 Lampe L1,L2,L3;
         int a,b,c,d;
    FeuTricolore(int a, int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        Lampe L1=new Lampe (Color.RED,a+10,b+20,c-20,c-20);
        Lampe L2=new Lampe (Color.ORANGE,a+10,b+80,c-20,c-20);
        Lampe L3=new Lampe (Color.GREEN,a+10,b+140,c-20,c-20);
    }
  
	 abstract void init_structure();
	 abstract void init_behavior();
	 abstract void start();

	} 
 

