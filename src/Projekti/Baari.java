/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

/**
 *
 * @author Sinh
 */
public class Baari {

    final int kalja;
    final int siideri;
    final int jallu;
    final int jekku;
    final String nimi;
    //Henkilo henkilo;

    
    public Baari() {
        this.kalja = 5;
        this.siideri = 6;
        this.jallu = 5;
        this.jekku = 5;
        this.nimi = "Nimetön baari";
    }
    
    public Baari(int kalja, int siideri, int jallu, int jekku, String nimi) {
        this.kalja = kalja;
        this.siideri = siideri;
        this.jallu = jallu;
        this.jekku = jekku;
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return nimi;
    }

    public String ostaJuoma(int juoma, Henkilo henkilo) {
        boolean maksuLapi;
        String kommentti = "";
        switch (juoma) {
            case 1:
                maksuLapi = henkilo.uusiMaksu((double) kalja);
                if (maksuLapi == true) {
                    kommentti = "Menet baaritiskille ja kaikkien hämmästykseksi sinua palvellaan hyvinkin nopeasti oluen muodossa.";
                    henkilo.humalatilaPlus(0.5);
                } else {
                    kommentti = "Menet tiskille ja tilaat oluen. Valitettavasti et saa kuin haukut, koska rahasi ovat loppu.";
                }
                break;
            case 2:
                maksuLapi = henkilo.uusiMaksu((double) siideri);
                if (maksuLapi == true) {
                    kommentti = "Tunnet itsesi pissaliisaksi ja menet tiskille tilaamaan siiderin.";
                    henkilo.humalatilaPlus(0.5);
                } else {
                    kommentti = "Menet tiskille ja tilaat siiderin. Valitettavasti et saa kuin haukut, koska rahasi ovat loppu.";
                }
                break;
            case 3:
                maksuLapi = henkilo.uusiMaksu((double) jallu);
                if (maksuLapi == true) {
                    kommentti = "Tunnet itsesi lähestulkoon Ron Jeremyksi, joten tilaat jaloviinashotin.";
                    henkilo.humalatilaPlus(0.7);
                } else {
                    kommentti = "Menet tiskille ja tilaat jallushotin. Valitettavasti et saa muuta kuin haukut, koska rahasi ovat loppu.";
                }
                break;
            case 4:
                maksuLapi = henkilo.uusiMaksu((double) jekku);
                if (maksuLapi == true) {
                    kommentti = "Sinulla on vahva tunne, että tänään lykästää. Menet tilaamaan Jägermeisterin, koska olet kuullut sen mieskuntoa kohottavista ominaisuuksista";
                    henkilo.humalatilaPlus(0.7);
                } else {
                    kommentti = "Menet tiskille ja tilaat jekkushotin. Valitettavasti et saa muuta kuin haukut, koska rahasi ovat loppu.";
                }
                break;
        }
        return kommentti;
    }

    public String tanssi() {
        double random = Math.random();
        String kommentti = "";
        if (random <= 0.2) {
            kommentti = "Tunnet itsesi John Travoltaksi Saturday night feverissä ja menet tanssimaan. Valitettavasti totuus on eri.";
        } else if (random > 0.2 && random <= 0.4) {
            kommentti = "Menet tanssimaan ja hyvin tanssitkin. Omasta mielestäsi.";
        } else if(random > 0.4 && random <= 0.6){
            kommentti = "tanssi kommentti 3";
        }else if(random > 0.6 && random <= 0.8){
            kommentti = "tanssi kommentti 4";
        }else {
            kommentti = "Menet tanssilattialle näyttämään kireimmät liikkeesi. Yleisö ei pidä sinusta ja saat kaljat päällesi.";
        }
        return kommentti;
    }

    public String puhuPaskaa() {
        double random = Math.random();
        String kommentti = "";
        if (random < 0.2) {
            kommentti = "Puhuit tuntemattomalle ja sait melkein turpaasi.";
        } else if (random > 0.2 && random <= 0.4) {
            kommentti = "Puhuit tuntemattomalle naiselle ja sait vihreää valoa.";
        }else if(random > 0.4 && random <= 0.6){
            kommentti = "puhu kommentti 3";
        }else if(random > 0.6 && random <= 0.8){
            kommentti = "puhu komentti 4";
        }else{
            kommentti = "puhu kommentti 5";
        }
        return kommentti;

    }
}
