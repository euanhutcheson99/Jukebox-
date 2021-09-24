package Jukebox;

import java.util.List;
import java.util.Scanner;

public class UserInteraction {
    public int UIchoice1(){
        Scanner myMusic = new Scanner(System.in);
        int myalbum = myMusic.nextInt();

        return myalbum;}

    public List<String> UIalbum() {
   // Scanner myMusic = new Scanner(System.in);
   // Scanner mySong = new Scanner(System.in);
    Album a = new Album();
    List<String> aname = a.albumname();

    return aname;}


    public List<String> UIgenre(){
        // Scanner mySong = new Scanner(System.in);
    Album a = new Album();
    List<String> genre = a.genretype();

    return genre;}



    public List<Integer> UIsongyear(){
        Album a = new Album();
        List<Integer> syear = a.songyear();

        return syear;}

    public List<String> UIartistname(){
        Album a = new Album();
        List<String> artname = a.artistname();

        return artname;}


    }


   // List<String> artname = a.artistname();
   // List<String> songn1 = f.songs1();
   // List<String> songn2 = ka.songs2();
    //List<String> songn3 = am.songs3();
    //int myalbum = myMusic.nextInt();





