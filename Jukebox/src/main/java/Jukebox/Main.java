package Jukebox;

import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String [] arg) {
    Scanner myMusic = new Scanner(System.in);
    Scanner mySong = new Scanner(System.in);
    Album a = new Album();
    List<String> aname= a.albumname();
    List<String> genre= a.genretype();
    List<Integer> syear= a.songyear();
    List<String> artname= a.artistname();
    List<String> songn1= a.songs1();
    List<String> songn2= a.songs2();
    List<String> songn3= a.songs3();
    System.out.println("Which album would you like to listen to?");
    System.out.println("1." +aname.get(0));
    System.out.println("2." +aname.get(1));
    System.out.println("3." +aname.get(2));
    int myalbum= myMusic.nextInt();
    System.out.println("Information:");
    System.out.println("Genre:"+genre.get(myalbum-1));
    System.out.println("Year:"+ syear.get(myalbum-1));
    System.out.println("Artist:"+artname.get(myalbum-1));

    if (myalbum == 1){
        System.out.println("Which track would you like to listen to?(1-11)");
        for (int i=0; i<=10; i++){
            System.out.println(songn1.get(i));
        }
        int mysong1 = mySong.nextInt();
        System.out.println("Now Playing:"+songn1.get(mysong1-1));
    }else if (myalbum == 2){
        System.out.println("Which track would you like to listen to?(1-13");
    for (int i=0; i<=12; i++){
        System.out.println(songn2.get(i));
    }
    int mysong2 = mySong.nextInt();
    System.out.println("Now Playing:"+songn2.get(mysong2-1));}
    else if (myalbum==3) {
        System.out.println("Which track would you like to listen to?");
        for (int i=0; i<=12; i++){
            System.out.println(songn3.get(i));
        }
        int mysong3 = mySong.nextInt();
        System.out.println("Now Playing:"+songn3.get(mysong3-1));
    }





    }

    }







