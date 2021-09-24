package Jukebox;

import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String [] arg) {
    UserInteraction u= new UserInteraction();
    System.out.println("Which album would you like to listen to?");
    System.out.println("1." +u.UIalbum().get(0));
    System.out.println("2." +u.UIalbum().get(1));
    System.out.println("3." +u.UIalbum().get(2));
    //System.out.println("Genre:"+u.UIgenre().get(u.UIchoice1(myalbum)-1));
    //System.out.println("Year:"+ u.UIsongyear().get(u.UIchoice1(myalbum)-1));
    //System.out.println("Artist:"+u.UIartistname().get(u.UIchoice1(myalbum)-1));

    //if (myalbum == 1) {
      //      System.out.println("Which track would you like to listen to?(1-11)");
        //    for (int i = 0; i <= (songn1.size() - 1); i++) {
          //      System.out.println(songn1.get(i));
            //}
            //int mysong1 = mySong.nextInt();
            //System.out.println("Now Playing:" + songn1.get(mysong1 - 1));
        //} else if (myalbum == 2) {
          //  System.out.println("Which track would you like to listen to?(1-13");
            //for (int i = 0; i <= (songn2.size() - 1); i++) {
            //    System.out.println(songn2.get(i));
            //}
            //int mysong2 = mySong.nextInt();
           // System.out.println("Now Playing:" + songn2.get(mysong2 - 1));
      //  } else if (myalbum == 3) {
        //    System.out.println("Which track would you like to listen to?");
          //  for (int i = 0; i <= songn3.size() - 1; i++) {
            //    System.out.println(songn3.get(i));
        //    }
          //  int mysong3 = mySong.nextInt();
          //  System.out.println("Now Playing:" + songn3.get(mysong3 - 1));
        //}
    }




    }









