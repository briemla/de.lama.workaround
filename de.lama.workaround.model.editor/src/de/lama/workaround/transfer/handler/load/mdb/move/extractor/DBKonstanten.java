package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

/**
 * @author Lars
 */
public abstract class DBKonstanten
{

    // Tabellennamen:
    /** Tabellenname: tblArbeit */
    public static final String tblArbeit = "tblArbeit";
    /** Tabellenname: tblArbeitFahrzeug */
    public static final String tblArbeitFahrzeug = "tblArbeitFahrzeug";
    /** Tabellenname: tblArbeitGer�t */
    public static final String tblArbeitGeraet = "tblArbeitGer�t";
    /** Tabellenname: tblArbeitPerson */
    public static final String tblArbeitPerson = "tblArbeitPerson";
    /** Tabellenname: tblArbeitSaatgut */
    public static final String tblArbeitSaatgut = "tblArbeitSaatgut";
    /** Tabellenname: tblArbeitsvorgang */
    public static final String TBL_ARBEITSVORGANG = "tblArbeitsvorgang";
    /** Tabellenname: tblEinsaat */
    public static final String tblEinsaat = "tblEinsaat";
    /** Tabellenname: tblEinsaatSaatgut */
    public static final String tblEinsaatSaatgut = "tblEinsaatSaatgut";
    /** Tabellenname: tblFahrzeug */
    public static final String TBL_FAHRZEUG = "tblFahrzeug";
    /** Tabellenname: tblFl�che */
    public static final String TBL_FLAECHE = "tblFl�che";
    /** Tabellenname: tblFlurgrundst�ck */
    public static final String tblFlurgrundstueck = "tblFlurgrundst�ck";
    /** Tabellenname: tblGer�t */
    public static final String TBL_GERAET = "tblGer�t";
    /** Tabellenname: tblPerson */
    public static final String TBL_PERSON = "tblPerson";
    /** Tabellenname: tblPr�parat */
    public static final String TBL_PRAEPARAT = "tblPr�parat";
    /** Tabellenname: tblSaatgut */
    public static final String tblSaatgut = "tblSaatgut";
    /** Tabellenname: tblS�maschineneEinstellung */
    public static final String tblSaemaschinenEinstellung = "tblS�maschinenEinstellung";
    /** Tabellenname: tblThunElement */
    public static final String tblThunElement = "tblThunElement";
    /** Tabellenname: tblThunFruchtorganImpuls */
    public static final String tblThunFruchtorganImpuls = "tblThunFruchtorganImpuls";
    /** Tabellenname: tblThunSternbild */
    public static final String tblThunSternbild = "tblThunSternbild";

    /*
     * Feldnamen:
     */

    // tblArbeit
    /** ArbID Arbeit ID */
    public static final String COLUMN_ARBID = "ArbID";
    /** StartFahrdatum */
    public static final String COLUMN_STARTFAHRDATUM = "StartFahrdatum";
    /** EndeFahrdatum */
    public static final String COLUMN_ENDFAHRDATUM = "EndeFahrdatum";
    /** Pr�paratEins */
    public static final String praeparatEins = "Pr�paratEins";
    /** Pr�paratZwei */
    public static final String praeparatZwei = "Pr�paratZwei";
    /** Pr�paratDrei */
    public static final String praeparatDrei = "Pr�paratDrei";
    /** Bemerkung */
    public static final String COLUMN_BEMERKUNG = "Bemerkung";
    /** MaschinenArbeit */
    public static final String maschinenArbeit = "MaschinenArbeit";

    // tblArbeitsvorgang
    /** ArbvID */
    public static final String COLUMN_ARBVID = "ArbvID";
    /** T�tigkeit */
    public static final String COLUMN_TAETIGKEIT = "T�tigkeit";

    // tblEinsaat
    /** EID Einsaat ID */
    public static final String eid = "EID";

    // tblEinsaatSaatgut
    /** Menge */
    public static final String menge = "Menge";

    // tblFahrzeug
    /** FZID Fahrzeug ID */
    public static final String COLUMN_FZID = "FZID";
    /** Bezeichnung */
    public static final String COLUMN_BEZEICHNUNG = "Bezeichnung";
    /** Kennzeichen */
    public static final String COLUMN_KENNZEICHEN = "Kennzeichen";

    // tblFl�che
    /** FLID Fl�che/Flurgrundst�cks ID */
    public static final String COLUMN_FLID = "FLID";
    /** Fl�chenname */
    public static final String COLUMN_NAME = "Name";
    /** Gemarkung */
    public static final String COLUMN_GEMARKUNG = "Gemarkung";
    /** Schlagnummer */
    public static final String COLUMN_SCHLAGNUMMER = "Schlagnummer";

    // tblFlurgrundst�ck
    /** Flurst�cksnummer */
    public static final String flurstuecksNummer = "Flurst�cksNummer";
    /** Unternummer */
    public static final String unterNummer = "UnterNummer";
    /** Katasterfl�che */
    public static final String katasterFlaeche = "KatasterFl�che";
    /** Nettofl�che */
    public static final String nettoFlaeche = "NettoFl�che";

    // tblGer�t
    /** GID Ger�te ID */
    public static final String COLUMN_GID = "GID";

    // tblPerson
    /** PID Personen ID */
    public static final String COLUMN_PID = "PID";
    /** Nachname */
    public static final String COLUMN_NACHNAME = "Nachname";
    /** Vorname */
    public static final String COLUMN_VORNAME = "Vorname";
    /** PLZ */
    public static final String plz = "PLZ";
    /** Geburtstag */
    public static final String geburtstag = "Geburtstag";
    /** Stra�e */
    public static final String strasse = "Stra�e";
    /** hausNummer */
    public static final String hausNummer = "Hausnummer";
    /** TelefonNummer */
    public static final String telefonNummer = "TelefonNummer";
    /** HandyNummer */
    public static final String handyNummer = "HandyNummer";
    /** eMailAdresse */
    public static final String eMailAdresse = "eMailAdresse";

    // tblPr�parat
    /** PRID Pr�parat ID */
    public static final String COLUMN_PRID = "PRID";
    /** Abk�rzung */
    public static final String COLUMN_ABKUERZUNG = "Abk�rzung";

    // tblSaatgut
    /** SID Saatgut ID */
    public static final String sid = "SID";

    // tblS�maschinenEinstellung
    /** SMEID S�maschinenEinstelungs ID */
    public static final String smeid = "SMEID";
    /** Geschindigkeit */
    public static final String geschwindigkeit = "Geschwindigkeit";
    /** Gro�erGang */
    public static final String grosserGang = "Gro�erGang";
    /** KleinerGang */
    public static final String kleinerGang = "KleinerGang";
    /** DrehzahlZapfwelle */
    public static final String drehzahlZapfwelle = "DrehzahlZapfwelle";
    /** Mengenteiler */
    public static final String mengenteiler = "Mengenteiler";
    /** Einstellung */
    public static final String einstellung = "Einstellung";
    /** Bodenklappe */
    public static final String bodenklappe = "Bodenklappe";
    /** Aktiv */
    public static final String aktiv = "Aktiv";

    // tblThunElement
    /** TEID ThunElement ID */
    public static final String teid = "TEID";
    /** Startdatum */
    public static final String COLUMN_STARTDATUM = "Startdatum";
    /** Enddatum */
    public static final String COLUMN_ENDDATUM = "Enddatum";
    /** Element 1 */
    public static final String element = "Element";

    // tblThunFruchtorganImpuls
    /** TFID ThunFruchtorganimpuls ID */
    public static final String tfid = "TFID";
    /** FruchtorganImpuls */
    public static final String fruchtorganImpuls = "FruchtorganImpuls";

    // tblThunSternbild
    /** TSID ThunSternbild ID */
    public static final String tsid = "TSID";
    /** Sternbild */
    public static final String sternbild = "Sternbild";

    // Linktabellen
    /** LinkID */
    public static final String linkID = "LinkID";
    public static final String QRY_JOB = "qryJob";
    public static final String COLUMN_PRAEPARAT_EINS = "Pr�paratEins";
    public static final String COLUMN_PRAEPARAT_ZWEI = "Pr�paratZwei";
    public static final String COLUMN_PRAEPARAT_DREI = "Pr�paratDrei";
}
