import java.awt.*;

public class Kreis
{

    Zeichenfenster kZf;
    Graphics kLw;
    int zX, zY, zR;
    Color zFarbe;
    boolean zSichtbar;
    
    public Kreis (Zeichenfenster zf, int pX, int pY, int pRadius, Color pFarbe) {
    
        // Instanzvariable initialisieren
        kZf = zf;
        kLw= kZf.getGraphics();  // Leinwand = Zeichenflaeche
        zX = pX + kZf.getInsets().left;
        zY = pY + kZf.getInsets().top;
        zR = pRadius;
        zFarbe = pFarbe;
        zSichtbar = false;
    }

    public void zeichnen() {
      Color farbeAlt;
      farbeAlt = kLw.getColor();
      kLw.setColor (zFarbe);
      kLw.fillOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.setColor (Color.black);
      kLw.drawOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.setColor (farbeAlt);
      zSichtbar = true;
    }

    public void loeschen() {
      Color farbeAlt;
      farbeAlt = kLw.getColor();
      kLw.setColor (Color.white);
      kLw.fillOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.drawOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.setColor (farbeAlt);
      zSichtbar = false;
    }    
    
    public void setzeFarbe (Color pFarbe) {
        zFarbe = pFarbe;
        if (zSichtbar)
           zeichnen();
    }
    
    public void setzePosition (int pX, int pY) {
        if (zSichtbar) {
           loeschen();
           zX = pX; zY = pY;
           zeichnen();
        } 
        else {
           zX = pX; zY = pY; 
        }

    }
    
    public int liesXPosition() {
      return zX;
    } 
    
    public int liesYPosition() {
      return zY;
    }    
}
