package de.lama.workaround.rcp.handler.load.mdb.move.extractor;

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
    public static final String tblArbeitsvorgang = "tblArbeitsvorgang";
    /** Tabellenname: tblEinsaat */
    public static final String tblEinsaat = "tblEinsaat";
    /** Tabellenname: tblEinsaatSaatgut */
    public static final String tblEinsaatSaatgut = "tblEinsaatSaatgut";
    /** Tabellenname: tblFahrzeug */
    public static final String tblFahrzeug = "tblFahrzeug";
    /** Tabellenname: tblFläche */
    public static final String tblFlaeche = "tblFläche";
    /** Tabellenname: tblFlurgrundstück */
    public static final String tblFlurgrundstueck = "tblFlurgrundstück";
    /** Tabellenname: tblGerät */
    public static final String tblGeraet = "tblGerät";
    /** Tabellenname: tblPerson */
    public static final String TBL_PERSON = "tblPerson";
    /** Tabellenname: tblPräparat */
    public static final String tblPraeparat = "tblPräparat";
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
    public static final String arbid = "ArbID";
    /** StartFahrdatum */
    public static final String startFahrdatum = "StartFahrdatum";
    /** EndeFahrdatum */
    public static final String endeFahrdatum = "EndeFahrdatum";
    /** PräparatEins */
    public static final String praeparatEins = "PräparatEins";
    /** PräparatZwei */
    public static final String praeparatZwei = "PräparatZwei";
    /** PräparatDrei */
    public static final String praeparatDrei = "PräparatDrei";
    /** Bemerkung */
    public static final String bemerkung = "Bemerkung";
    /** MaschinenArbeit */
    public static final String maschinenArbeit = "MaschinenArbeit";

    // tblArbeitsvorgang
    /** ArbvID */
    public static final String arbvID = "ArbvID";
    /** Tätigkeit */
    public static final String taetigkeit = "Tätigkeit";

    // tblEinsaat
    /** EID Einsaat ID */
    public static final String eid = "EID";

    // tblEinsaatSaatgut
    /** Menge */
    public static final String menge = "Menge";

    // tblFahrzeug
    /** FZID Fahrzeug ID */
    public static final String fzid = "FZID";
    /** Bezeichnung */
    public static final String bezeichnung = "Bezeichnung";
    /** Kennzeichen */
    public static final String kennzeichen = "Kennzeichen";

    // tblFläche
    /** FLID Fläche/Flurgrundstücks ID */
    public static final String flid = "FLID";
    /** Flächenname */
    public static final String name = "Name";
    /** Gemarkung */
    public static final String gemarkung = "Gemarkung";
    /** Schlagnummer */
    public static final String schlagnummer = "Schlagnummer";

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
    public static final String gid = "GID";

    // tblPerson
    /** PID Personen ID */
    public static final String pid = "PID";
    /** Nachname */
    public static final String nachname = "Nachname";
    /** Vorname */
    public static final String vorname = "Vorname";
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
    public static final String prid = "PRID";
    /** Abkürzung */
    public static final String abkuerzung = "Abkürzung";

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
    public static final String startdatum = "Startdatum";
    /** Enddatum */
    public static final String enddatum = "Enddatum";
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
}
