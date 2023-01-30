
import java.awt.*;

public class Rechteck {
    
    // Attribute
  
    Zeichenfenster kZf;
    Graphics kLw;
    int zX, zY, zB, zH;
    Color zFarbe;
    boolean zSichtbar;

    // Konstruktoren
  
    /** Konstruktor */
    public Rechteck (Zeichenfenster Zf, int pXPos, int pYPos, int pBreite, int pHoehe, Color pFarbe)
    {    
        // Instanzvariable initialisieren
        kZf = Zf;
        kLw = kZf.getGraphics();  // Leinwand = Zeichenflaeche
        zX = pXPos + kZf.getInsets().left;
        zY = pYPos + kZf.getInsets().top;
        zB = pBreite;
        zH = pHoehe;
        zFarbe = pFarbe;
        zSichtbar = false;
     }

   // Methoden
   
    /** zeichnet die Figur */
    public void zeichnen() {
        Color farbeAlt;
        farbeAlt = kLw.getColor();
        kLw.setColor (zFarbe);
        kLw.fillRect (zX, zY-zH, zB, zH);
        kLw.setColor (Color.black);
        kLw.drawRect (zX, zY-zH, zB, zH);
        kLw.setColor (farbeAlt);
        zSichtbar = true;
    }
 
    /** übermalt die Figur mit weißer Farbe */
    public void loeschen() {
        Color farbeAlt;
        farbeAlt = kLw.getColor();
        kLw.setColor (Color.white);
        kLw.fillRect (zX, zY-zH, zB, zH);
        // kLw.setColor (Color.white);
        kLw.drawRect (zX, zY-zH, zB, zH);
        kLw.setColor (farbeAlt);
        zSichtbar = false;
    }
    
    /** Farbe ... */
    public void setzeFarbe (Color pFarbe) {
        zFarbe = pFarbe;
        if (zSichtbar)
           zeichnen();
    }
    
    /** Bezugspunkt: Ecke unten links */
    public void setzePosition (int pXPos, int pYPos) {
       if (zSichtbar) {
          
          zX = pXPos; zY = pYPos;
          
        }
        else {
          zX = pXPos; zY = pYPos;   
        }    
    }
    
    /** liefert die x-Koordinate der Figur */
    public int liesXPosition() {
        return zX;
    }
    
    /** liefert die y-Koordinate der Figur */
    public int liesYPosition() {
        return zY;
    }
    
} // class