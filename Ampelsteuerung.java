

import java.awt.*;

public class Ampelsteuerung
{
    Zeichenfenster hZf;
    Ampel hAmpel1;
    Ampel hAmpel2;
    Ampel hAmpel3;
    Ampel hAmpel4;
    Rechteck hHaus1, hHaus2, hHaus3, hHaus4;

    public Ampelsteuerung()
    {
    }

    public void neuesZeichenfenster() {
       hZf = new Zeichenfenster();
       hZf.setVisible (true); 
    }
    
    public void allesZeichnen()
    {
        hHaus1 = new Rechteck (hZf, 0, 100, 150, 100, Color.orange);
        hHaus1.zeichnen();
        hHaus2 = new Rechteck (hZf, 0, 270, 150, 125, Color.orange);
        hHaus2.zeichnen();
        hHaus3 = new Rechteck (hZf, 230, 100, 170, 100, Color.orange);
        hHaus3.zeichnen();
        hHaus4 = new Rechteck (hZf, 230, 270, 170, 125, Color.orange);
        hHaus4.zeichnen();
        
        hAmpel1 = new Ampel (hZf, 120, 40, 20);
        hAmpel1.zeichnen1();
        hAmpel2 = new Ampel (hZf, 240, 170, 20);
        hAmpel2.zeichnen1();
        hAmpel3 = new Ampel (hZf, 120, 170, 20);
        hAmpel3.zeichnen2();
        hAmpel4 = new Ampel (hZf, 240, 40, 20);
        hAmpel4.zeichnen2();
    }
    
    public void ausSchalten()
    {
        hAmpel1.ausschalten();
        hAmpel2.ausschalten();
        hAmpel3.ausschalten();
        hAmpel4.ausschalten();
    }
    
    
    public void AmpelSchalten()
    {
        
        hAmpel1.addIndex();
        hAmpel1.paint();
        hAmpel2.addIndex();
        hAmpel2.paint();
        hAmpel3.addIndex();
        hAmpel3.paint();
        hAmpel4.addIndex();
        hAmpel4.paint();
    }
    
    public void ampelZyklus() 
    {
        AmpelSchalten();
        try {
            Thread.sleep (5000);
        }
        catch (Exception e) {}
        
        AmpelSchalten();
        try {
            Thread.sleep (2000);
        }
        catch (Exception e) {}
        
        AmpelSchalten();
        try {
            Thread.sleep (1000);
        }
        catch (Exception e) {}
        
        AmpelSchalten();
        try {
            Thread.sleep (5000);
        }
        catch (Exception e) {}
        
        AmpelSchalten();
        try {
            Thread.sleep (2000);
        }
        catch (Exception e) {}
        
        AmpelSchalten();
        try {
            Thread.sleep (1000);
        }
        catch (Exception e) {}
    }
    
    public void fünfZyklen()
    {
        int i;
        for (i=1; i<=10; i=i+1) {
            ampelZyklus();
        }
    }
    
    public void blinken()
    {
        hAmpel1.gelbSchalten();
        hAmpel2.gelbSchalten();
        hAmpel3.gelbSchalten();
        hAmpel4.gelbSchalten();
        try {
            Thread.sleep (1000);
        }
        catch (Exception e) {}
        hAmpel1.ausschalten();
        hAmpel2.ausschalten();
        hAmpel3.ausschalten();
        hAmpel4.ausschalten();
        try {
            Thread.sleep (1000);
        }
        catch (Exception e) {}
        
    }    
    
    public void blinkModus()
    {
        int i;
        for (i=1; i<=10; i=i+1) {
            blinken();
        }
    }
}
