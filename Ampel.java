
import java.awt.*;

public class Ampel
{
    Zeichenfenster kZf;
    
    Kreis hLicht1;
    Kreis hLicht2;
    Kreis hLicht3;
    Kreis hLicht4;
    Kreis hLicht5;
    Kreis hLicht6;
    
    Rechteck hGehäuse;
    
    int zX, zY, zBreite;
    
    int i;

    public Ampel(Zeichenfenster pZf, int pX, int pY, int pBreite)
    {
        kZf = pZf;
        zX = pX;
        zY = pY;
        zBreite = pBreite;
        
        hGehäuse = new Rechteck (kZf, zX, zY + zBreite * 7/3, zBreite, zBreite*8/3, Color.black);
        hLicht1 = new Kreis (kZf, zX + zBreite * 1/2, zY + zBreite * 1/3, zBreite * 1/3, Color.lightGray);
        hLicht2 = new Kreis (kZf, zX + zBreite * 1/2, zY + zBreite, zBreite * 1/3, Color.lightGray);
        hLicht3 = new Kreis (kZf, zX + zBreite * 1/2, zY + zBreite * 5/3, zBreite * 1/3, Color.lightGray);
        
        hLicht4 = new Kreis (kZf, zX + zBreite * 1/2, zY + zBreite * 1/3, zBreite * 1/3, Color.lightGray);
        hLicht5 = new Kreis (kZf, zX + zBreite * 1/2, zY + zBreite, zBreite * 1/3, Color.lightGray);
        hLicht6 = new Kreis (kZf, zX + zBreite * 1/2, zY + zBreite * 5/3, zBreite * 1/3, Color.lightGray);
        
        i = 0;
    }

    public void zeichnen1()
    {
        hGehäuse.zeichnen();
        hLicht1.zeichnen();
        hLicht2.zeichnen();
        hLicht3.zeichnen();
    }
    
    public void zeichnen2()
    {
        hGehäuse.zeichnen();
        hLicht4.zeichnen();
        hLicht5.zeichnen();
        hLicht6.zeichnen();
    }    
    
    public void ausschalten()
    {
        hLicht1.setzeFarbe(Color.lightGray);
        hLicht2.setzeFarbe(Color.lightGray);
        hLicht3.setzeFarbe(Color.lightGray);
        hLicht4.setzeFarbe(Color.lightGray);
        hLicht5.setzeFarbe(Color.lightGray);
        hLicht6.setzeFarbe(Color.lightGray);
        i = 0;
    }
    
    public void gelbSchalten()
    {
        hLicht2.setzeFarbe(Color.yellow);
        hLicht5.setzeFarbe(Color.yellow);
    }
        
    public void Licht1Schalten()
    {
        hLicht1.setzeFarbe(Color.red);
    }
    
    public void Licht2Schalten()
    {
        hLicht2.setzeFarbe(Color.yellow);
    }
    
    public void Licht3Schalten()
    {
        hLicht3.setzeFarbe(Color.green);
    }
    
    public void addIndex()
    {
        i++;
    }
    
    public boolean fehlfunktion()
    {
        return false;
    }
    
    public void blinken(boolean fehlfunktion)
    {
        
        if (fehlfunktion() == true) 
        {
            hLicht2.setzeFarbe(Color.yellow);
            fehlfunktion = false;
        }
        if (fehlfunktion() == false) 
        {
            hLicht2.setzeFarbe(Color.lightGray);
            fehlfunktion = true;
        }
    }        
    
    
    public void paint()
    {
        hLicht1.setzeFarbe(Color.lightGray);
        hLicht2.setzeFarbe(Color.lightGray);
        hLicht3.setzeFarbe(Color.lightGray);
        hLicht4.setzeFarbe(Color.lightGray);
        hLicht5.setzeFarbe(Color.lightGray);
        hLicht6.setzeFarbe(Color.lightGray);
        if (i==1){
            hLicht1.setzeFarbe(Color.red);
            hLicht6.setzeFarbe(Color.green);
            } 
            if (i==2){
                hLicht5.setzeFarbe(Color.yellow);
                hLicht1.setzeFarbe(Color.red);
            }
                if (i==3) {
                    hLicht1.setzeFarbe(Color.red);
                    hLicht2.setzeFarbe(Color.yellow);
                    hLicht4.setzeFarbe(Color.red);
                    }
                    if (i==4) {
                        hLicht3.setzeFarbe(Color.green);
                        hLicht4.setzeFarbe(Color.red);
                        }
                        if (i==5) {
                            hLicht2.setzeFarbe(Color.yellow);
                            hLicht4.setzeFarbe(Color.red);
                            }
                            if (i==6) {
                                hLicht1.setzeFarbe(Color.red);
                                hLicht4.setzeFarbe(Color.red);
                                hLicht5.setzeFarbe(Color.yellow);
                                i = 0;
                            }
    }
    
}