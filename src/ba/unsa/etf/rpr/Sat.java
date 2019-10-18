package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Sat {
        private int sati,minute,sekunde;

        public Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }

        public void Postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }

        public void Sljedeci() {
            sekunde++;
            if (sekunde==60) { sekunde=0; minute++; }
            if (minute==60) { minute=0; sati++; }
            if (sati==24) sati=0;
        }

        public void Prethodni() {
            sekunde--;
            if (sekunde==-1) { sekunde=59; minute--; }
            if (minute==-1) { minute=59; sati--; }
            if (sati==-1) sati=23;
        }

        public void PomjeriZa(int pomak) {
            if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
		    else for (int i=0; i<-pomak; i++) Prethodni();
        }

        public int getSati()  { return sati; }

        public int getMinute()  { return minute; }

        public int grtSekunde() { return sekunde; }

        public void Ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
        }
}
