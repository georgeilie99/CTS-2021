package Betoane;

import java.util.ArrayDeque;
import java.util.Arrays;

// CTS - 2021 SEMINAR 1
// denumirea clasei poate fi grea de înțeles
// exemplu: linia 10

public class ColoanaBetoane implements Estimabil{

// CTS - 2021 SEMINAR 1
// am oferit comentarii suplimentare pentru lucuri care sunt evident
// (care sunt atributele clasei, constructori, etc.)
// exemplu: liniile 17, 23, etc.

    //atributele clasei
    private String denumireReteta;
    private Materiale[] materiale;
    private float[] volume;

    //constructorul default
    public ColoanaBetoane(){
        this.denumireReteta="";
        this.materiale = null;
        this.volume = null;
    }

// CTS - 2021
// sunt unele locuri în care înainte și după egal nu pun spațiu și astfel se vede încărcat
// exemplu: liniile 35, 38, etc.

    //constructorul cu parametrii
    public ColoanaBetoane(String denumireReteta, Materiale[] materiale, float[] volume){
        this.denumireReteta=denumireReteta;
        this.materiale = new Materiale[materiale.length];
        for(int i=0; i<materiale.length; i++){
            this.materiale[i]=materiale[i];
        }
        this.volume = new float[volume.length];
        for(int i=0; i<volume.length; i++){
            this.volume[i]=volume[i];
        }
    }

    //getteri si setteri
    public String getDenumireReteta() {
        return denumireReteta;
    }

    public void setDenumireReteta(String denumireReteta) {
        this.denumireReteta = denumireReteta;
    }

// CTS - 2021 SEMINAR 1
// folosirea atât a limbii engleze cât și a limbii române în scrierea codului
// exemplu: linia 61 (puteam scrie copie în loc de copy)

    public Materiale[] getMateriale() {
        if(materiale!=null){
            Materiale[] copy = new Materiale[materiale.length];
            System.arraycopy(materiale, 0, copy, 0, materiale.length);
            return copy;
        }
        else {
            return null;
        }
    }

    public void setMateriale(Materiale[] materiale) {
        if(materiale!=null){
            this.materiale=new Materiale[materiale.length];
            for (int i=0; i<materiale.length; i++){
                this.materiale[i]=materiale[i];
            }
        }
    }

    public float[] getVolume() {
        if(volume!=null){
            float[] copy = new float[volume.length];
            System.arraycopy(volume, 0, copy, 0, volume.length);
            return copy;
        }
        else {
            return null;
        }
    }

    public void setVolume(float[] volume) {
        if(volume!=null){
            this.volume = new float[volume.length];
            for (int i=0; i<volume.length; i++){
                this.volume[i]=volume[i];
            }
        }
    }

// CTS - 2021 SEMINAR 1
// am comentat conținutul metodei toString în loc să îl șterg 
// deoarece nu folosesc acea versiune generată de intellij
// exemplu: liniile 107 - 111

   //toString
    @Override
    public String toString() {
//        return "ColoanaBetoane{" +
//                "denumireReteta='" + denumireReteta + '\'' +
//                ", materiale=" + Arrays.toString(materiale) +
//                ", volume=" + Arrays.toString(volume) +
//                '}';
        return this.denumireReteta + "," +
                Arrays.toString(this.materiale) + "," +
                Arrays.toString(this.volume);
    }

    //toClone
    public Object clone(){
        ColoanaBetoane copy = new ColoanaBetoane();
        copy.denumireReteta = denumireReteta;
        copy.materiale=getMateriale();
        copy.volume=getVolume();
        return copy;
    }

    //getVolume()
    public float getVolum(){
        float volumTotal = 0;
        for (int i=0; i<volume.length; i++){
            volumTotal+=volume[i];
        }
        return volumTotal;
    }
}



