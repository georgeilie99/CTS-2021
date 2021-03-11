package classes;

import java.util.Arrays;

public class Imobil {
    //MODIFICARE CTS - SEMINAR 3
    //AM MODIFICAT DENUMIREA VARIABILELOR
    //ASTFEL INCAT SA FIE USOR DE INTELES CE REPREZINTA
    public TipImobil tip;
    public String localitate;
    public float[] preturi;

    public Imobil(){
        this.tip = TipImobil.teren;
        this.localitate = "Bucuresti";
        this.preturi = new float[1];
        preturi[0] = 100.5f;
    }

    public Imobil(TipImobil tip, String localitate, float[] preturi){
        //MODIFICARE CTS - SEMINAR 3
        //AM MODIFICAT MODUL DE ATRIBUIRE,
        //ADAUGAND CUVANTUL CHEIE "THIS"
        this.tip = tip;
        this.localitate = localitate;
        this.preturi = new float[preturi.length];
        for (int i=0; i<preturi.length; i++){
            this.preturi[i] = preturi[i];
        }
    }

    public TipImobil getTip(){
        return tip;
    }

    public void setTip(TipImobil tip){
        this.tip = tip;
    }

    public String getLocalitate(){
        return localitate;
    }

    public void setLocalitate(String localitate){
        this.localitate = localitate;
    }

    public float[] getPreturi(){
        //MODIFICARE CTS - SEMINAR 3
        //AM MODIFICAT GETTER-UL STANDARD OFERIT DE INTELLIJ
        //PENTRU A TRATA TOATE CAZURILE POSIBILE
        if (preturi != null){
            float[] copie = new float[preturi.length];
            for(int i=0; i<preturi.length; i++){
                copie[i] = preturi[i];
            }
            return copie;
        }
        else {
            return null;
        }
    }

    public void setPreturi(float[] preturi){
        //MODIFICARE CTS - SEMINAR 3
        //AM MODIDFICAT METODA DE SET ASTFEL INCAT
        //SA CAUT CAT MAI DEVREME O MODALITATE
        //DE IESIRE DIN METODA
        if (preturi == null){
            this.preturi = null;
        }
        else {
            this.preturi = new float[preturi.length];
            for (int i=0; i<preturi.length; i++){
                this.preturi[i] = preturi[i];
            }

        }
    }

    @Override
    public String toString() {
        return "Imobil{" +
                "tip=" + tip +
                ", localitate='" + localitate + '\'' +
                ", preturi=" + Arrays.toString(preturi) +
                '}';
    }

    @Override
    public Object clone()  {
        Imobil clona = new Imobil();
        clona.tip = tip;
        clona.localitate = localitate;
        clona.preturi = getPreturi();
        return clona;
    }
}
