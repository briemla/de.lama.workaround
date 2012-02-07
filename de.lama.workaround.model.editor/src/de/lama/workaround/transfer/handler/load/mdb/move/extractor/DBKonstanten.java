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
    /** Tabellenname: tblArbeitGerät */
    public static final String tblArbeitGeraet = "tblArbeitGerät";
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
    /** Tabellenname: tblFläche */
    public static final String TBL_FLAECHE = "tblFläche";
    /** Tabellenname: tblFlurgrundstück */
    public static final String tblFlurgrundstueck = "tblFlurgrundstück";
    /** Tabellenname: tblGerät */
    public static final String TBL_GERAET = "tblGerät";
    /** Tabellenname: tblPerson */
    public static final String TBL_PERSON = "tblPerson";
    /** Tabellenname: tblPräparat */
    public static final String TBL_PRAEPARAT = "tblPräparat";
    /** Tabellenname: tblSaatgut */
    public static final String tblSaatgut = "tblSaatgut";
    /** Tabellenname: tblSämaschineneEinstellung */
    public static final String tblSaemaschinenEinstellung = "tblSämaschinenEinstellung";
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
    /** PräparatEins */
    public static final String praeparatEins = "PräparatEins";
    /** PräparatZwei */
    public static final String praeparatZwei = "PräparatZwei";
    /** PräparatDrei */
    public static final String praeparatDrei = "PräparatDrei";
    /** Bemerkung */
    public static final String COLUMN_BEMERKUNG = "Bemerkung";
    /** MaschinenArbeit */
    public static final String maschinenArbeit = "MaschinenArbeit";

    // tblArbeitsvorgang
    /** ArbvID */
    public static final String COLUMN_ARBVID = "ArbvID";
    /** Tätigkeit */
    public static final String COLUMN_TAETIGKEIT = "Tätigkeit";

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

    // tblFläche
    /** FLID Fläche/Flurgrundstücks ID */
    public static final String COLUMN_FLID = "FLID";
    /** Flächenname */
    public static final String COLUMN_NAME = "Name";
    /** Gemarkung */
    public static final String COLUMN_GEMARKUNG = "Gemarkung";
    /** Schlagnummer */
    public static final String COLUMN_SCHLAGNUMMER = "Schlagnummer";

    // tblFlurgrundstück
    /** Flurstücksnummer */
    public static final String flurstuecksNummer = "FlurstücksNummer";
    /** Unternummer */
    public static final String unterNummer = "UnterNummer";
    /** Katasterfläche */
    public static final String katasterFlaeche = "KatasterFläche";
    /** Nettofläche */
    public static final String nettoFlaeche = "NettoFläche";

    // tblGerät
    /** GID Geräte ID */
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
    /** Straße */
    public static final String strasse = "Straße";
    /** hausNummer */
    public static final String hausNummer = "Hausnummer";
    /** TelefonNummer */
    public static final String telefonNummer = "TelefonNummer";
    /** HandyNummer */
    public static final String handyNummer = "HandyNummer";
    /** eMailAdresse */
    public static final String eMailAdresse = "eMailAdresse";

    // tblPräparat
    /** PRID Präparat ID */
    public static final String COLUMN_PRID = "PRID";
    /** Abkürzung */
    public static final String COLUMN_ABKUERZUNG = "Abkürzung";

    // tblSaatgut
    /** SID Saatgut ID */
    public static final String sid = "SID";

    // tblSämaschinenEinstellung
    /** SMEID SämaschinenEinstelungs ID */
    public static final String smeid = "SMEID";
    /** Geschindigkeit */
    public static final String geschwindigkeit = "Geschwindigkeit";
    /** GroßerGang */
    public static final String grosserGang = "GroßerGang";
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
    public static final String COLUMN_PRAEPARAT_EINS = "PräparatEins";
    public static final String COLUMN_PRAEPARAT_ZWEI = "PräparatZwei";
    public static final String COLUMN_PRAEPARAT_DREI = "PräparatDrei";
}
