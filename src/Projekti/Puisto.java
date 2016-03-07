package Projekti;

public class Puisto {

    private Poliisi poliisi;

    public Puisto(Poliisi poliisi) {
        this.poliisi = poliisi;

    }

    /*
    lisätkää tomintoja:
    
    löytää rahaa
    löydät vinaa
    juttelee naisille
    koira hyökkäs
    
    
     */
 /* int LoysitRahaa(){
        int random = (int)(Math.random()*20);
        henk.lisaaRahaa(random);
        return "löysit: "+random+" Rahaa";
    }  
    String löysitViinaa(){
       return "löysit vanhentunutta viinaa puistosta"; 
    }
    String jutteleNaiselle(){
        return "tyhjää";
    }
    String koiraHyökkäs(){
        return "koira hyökkäs kimpuusi omistaja syyttää sua";
    }
     */
    public String juoOmajuoma(Henkilo henkilo) {
        String kommentti;
        double random = Math.random();
        if (random <= 0.2) {
            kommentti = "Mitäpä puistossa olo olisi ilman pussikaljaa? Ei mitään, joten avaat yhden taskulämpimän.";
            henkilo.juomaMiinus();
            henkilo.humalatilaPlus(0.7);
        } else if (random > 0.2 && random <= 0.4 && henkilo.getJuomat() > 0) {
            kommentti = "Kusihätä on, mutta sinnittelet vielä yhden oluen verran.";
            henkilo.juomaMiinus();
            henkilo.humalatilaPlus(0.7);
        } else if (random > 0.4 && random <= 0.6 && henkilo.getJuomat() > 0) {
            kommentti = "Naapuriseurueessa istuu helvetin ruma nainen. Korkkaat oluen ja toivot hänen kaunistuvan sen jälkeen.";
            henkilo.juomaMiinus();
            henkilo.humalatilaPlus(0.7);
        } else if (random > 0.6 && random <= 0.8 && henkilo.getJuomat() > 0) {
            kommentti = "Tunnet olevasi liian selvinpäin, avaat oluen.";
            henkilo.juomaMiinus();
            henkilo.humalatilaPlus(0.7);
        } else if (random > 0.8 && random <= 1 && henkilo.getJuomat() > 0) {
            kommentti = poliisi.huomautus(henkilo);

        } else {
            kommentti = "Jumalauta! Juomat on loppu!";
        }
        return kommentti;
    }

    public String pummiJuoma(Henkilo henkilo) {
        String kommentti="";
        double random = Math.random();
        if (random <= 0.2 && henkilo.getJuomat() == 0) {
            kommentti = "Menet pummimaan naapuriseurueelta juoman. Yksi heistä suostuu luopumaan kallisarvoisesta maljastaan. Kumoat juoman siltä seisomalta.";
            henkilo.humalatilaPlus(0.7);
        } else if (random > 0.2 && random <= 0.25 && henkilo.getJuomat() == 0) {
            kommentti = "Menet pummimaan naapuriseurueelta juomaa. Saat käteesi epäilyttävän näköisen pullon ja otat ison kulauksen... Lasoliahan se on.";
            henkilo.humalatilaPlus(11);
        } else if (random > 0.25 && random <= 0.6 && henkilo.getJuomat() == 0) {
            kommentti = "Jano on, mutta ei yhtään juomaa. Menet pyytämään naapuriseurueelta juomaa. Tuloksetta.";
        } else if (random > 0.6 && random <= 0.8 && henkilo.getJuomat() == 0) {
            kommentti = "Epätoivo (janon suhteen) yllättää, etsit rumimman naisen koko puistosta ja käytät osuvimmat iskurepliikkisi juoman saamiseen. Onnistut.";
            henkilo.humalatilaPlus(0.7);
        } else if (random > 0.8 && random <= 1 && henkilo.getJuomat() == 0) {

            kommentti = "Menet pummimaan naapuriseurueelta juomaa. Saat palkkioksi haistattelua ja lähdet häntä koipien välissä karkuun.";
        }
        return kommentti;

    }

}
