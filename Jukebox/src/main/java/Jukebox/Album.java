package Jukebox;

//import jdk.internal.icu.impl.NormalizerImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Album {
    public String albums;
    private String aname;
    private int year;
    private String genre;

    public void album(String aname, String artist, String song, int year, String genre) {
        this.aname = aname;
        this.year = year;
        this.genre = genre;

    }

    public List<String> albumname() {
        List<String> albums = new ArrayList<String>();
        albums.add("Rumours");
        albums.add("My Beautiful Dark Twisted Fantasy (Explicit)");
        albums.add("Whatever People Say I Am, That's What I'm Not (Explicit)");

        return albums;
    }

    public List<String> genretype() {
        List<String> genre = new ArrayList<String>();
        genre.add("Rock");
        genre.add("Hip-Hop");
        genre.add("Indie");

        return genre;

    }

    public List<Integer> songyear() {
        List<Integer> year = new ArrayList<Integer>();
        year.add(1977);
        year.add(2010);
        year.add(2006);

        return year;


    }

    public List<String> artistname() {
        List<String> artist = new ArrayList<String>();
        artist.add("Fleetwood Mac");
        artist.add("Kanye West");
        artist.add("Arctic Monkeys");


        return artist;
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

    public List<String> songs2() {
        List<String> song2 = new ArrayList<String>();
        song2.add("1.Dark Fantasy");
        song2.add("2.Gorgeous ft(Kid Cudi and Raekwon)");
        song2.add("3.Power");
        song2.add("4.All of the Lights (Interlude)");
        song2.add("5.All of the Lights");
        song2.add("6.Monster ft(Jay-Z, Rick Ross, Nicki Minaj and Bon Iver");
        song2.add("7.So Appalled ft( Swizz Beatz, Jay-Z, Pusha T, Cyhi the Prynce and RZA");
        song2.add("8.Devil in a New Dress ft(Rick Ross)");
        song2.add("9.Runaway ft(Pusha T)");
        song2.add("10.Hell of a Life");
        song2.add("11.Blame Game ft(John Legend)");
        song2.add("12.Lost in the World ft(Bon Iver)");
        song2.add("13.Who Will Surive in America");

        return song2;
    }
public List<String> songs3(){
    List<String> song3 = new ArrayList<String>();
    song3.add("1.Th View from the Afternoon");
    song3.add("2.I Bet You Look Good on the Dancefloor");
    song3.add("3.Fake Tales of San Francisco");
    song3.add("4.Dancing Shoes");
    song3.add("5.You Probably Couldn't See for the Lights but You Were Staring Straight at Me");
    song3.add("6.Still Take You Home");
    song3.add("7.Riot Van");
    song3.add("8.Red Light Indicates Doors are Secured");
    song3.add("9.Mardy Bum");
    song3.add("10.Perhaps Vampires Is a Bit Strong But...");
    song3.add("11.When the Sun Goes Down");
    song3.add("12.From the Ritz to the Rubble ");
    song3.add("13.A Certain Romance");

    return song3;
    }






}







