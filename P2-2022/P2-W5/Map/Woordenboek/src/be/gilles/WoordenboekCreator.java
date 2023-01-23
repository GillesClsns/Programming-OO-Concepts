package be.gilles;

public class WoordenboekCreator {

    public static Woordenboek maakWoordenboek() {
        Woordenboek finsWoordenboek = new Woordenboek();
        finsWoordenboek.voegWoordToe("een", "yksi");
        finsWoordenboek.voegWoordToe("twee", "kaksi");
        finsWoordenboek.voegWoordToe("drie", "kolme");
        finsWoordenboek.voegWoordToe("vier", "neljä");
        finsWoordenboek.voegWoordToe("vijf", "viisi");
        finsWoordenboek.voegWoordToe("zes", "kuusi");
        finsWoordenboek.voegWoordToe("zeven", "seitsemän");
        finsWoordenboek.voegWoordToe("acht", "kahdeksan");
        finsWoordenboek.voegWoordToe("negen", "yhdeksän");
        finsWoordenboek.voegWoordToe("tien", "kymmenen");
        return finsWoordenboek;
    }
}
