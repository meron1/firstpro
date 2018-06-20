
/**
 * Beschreiben Sie hier die Klasse Hotel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hotel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private   <ArrayList> Zimmer zimmerliste();
    

    /**
     * Konstruktor für Objekte der Klasse Hotel
     */
    public Hotel()
    {
        // Instanzvariable initialisieren
        zimmerliste = new <ArrayList> Zimmer();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void  zimmerHinzufuegen()
    {
        // tragen Sie hier den Code ein
        for ( Zimmer zimmer : zimmerListe)
        {
            zimmerliste.add(zimmer);
            
        }
    }
     public int  gibAnzahlZimmer()
    {
        // tragen Sie hier den Code ein
        for ( Zimmer zimmer : zimmerListe)
        {
            zimmerliste.size(zimmer);
            
        }
    }
     public int  gibanzahlBetten()
    {
        // tragen Sie hier den Code ein
        return betten.size();
    }
    public int  gibFreiezimmer()
    {
        // tragen Sie hier den Code ein
        for ( Zimmer zimmer : zimmerListe)
        {
            if (zimmer.istFrei  != null)
            {
                return zimmerliste;
            }
            
        }
    }
    
    
    
    
}
