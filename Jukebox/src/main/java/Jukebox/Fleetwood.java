package Jukebox;

import java.util.ArrayList;
import java.util.List;

public class Fleetwood {
    private String songsfm;

    public void fm(String songsfm){
        this.songsfm =songsfm;
    }


    public List<String> songs1() {
        List<String> song1 = new ArrayList<String>();
        song1.add("1.Second Hand News");
        song1.add("2.Dreams");
        song1.add("3.Never Going Back Again");
        song1.add("4.Don't Stop");
        song1.add("5.Go Your Own Way");
        song1.add("6.Songbird");
        song1.add("7.he Chain");
        song1.add("8.You Make Loving Fun");
        song1.add("9.I Don't Want to Know");
        song1.add("10.Oh Daddy");
        song1.add("11.Gold Dust Woman");

        return song1;
    }
}