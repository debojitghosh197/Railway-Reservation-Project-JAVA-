/*
 * ---Railway Reservation project---
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;


// Abstract class for train
abstract class trainModel {

    abstract void time();

    abstract void bookTicket(int x);

    abstract void getStatus(int x);

}

// This class generate train number
class Train_Numgen {
    public String numgen() {

        Random random = new Random();

        Long randomNumber = random.nextLong(10000, 100000);
        

        String unique = "ER-";
        String NewunqiueNo = "";

        NewunqiueNo = unique + randomNumber;

        return NewunqiueNo;
    }

}

// Train class that extends train model
class Train extends trainModel {
    private final String[] username = new String[100000];
    private String[][] stations = new String[100000][2];
    private long[] ticketPrice = new long[100000];
    private String[] stationName = { "HWH", "LLH", "BEQ", "BZL", "DKAE", "GBRA", "JOX", "BPAE", "BRPA", "MBE",
            "BLAE", "KQU", "MDSE", "CDAE", "PBZ", "BMAE", "DNHL", "SHBC", "HIH", "GRAE", "JPQ", "JRAE", "NBAE", "MSAE",
            "PRAE", "SKG", "GRP", "BWN" };

    // Method to show the timetable of the train
    @Override

    public void time() {
        System.out.println();
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 02:50 || Arrives Howrah @ 05:20");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 04:00 || Arrives Howrah @ 06:15");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 04:56 || Arrives Howrah @ 07:04");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 05:40 || Arrives Howrah @ 07:45");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 06:10 || Arrives Howrah @ 08:15");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 06:48 || Arrives Howrah @ 08:57");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 07:22 || Arrives Howrah @ 09:25");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 07:35 || Arrives Howrah @ 09:37");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 08:10 || Arrives Howrah @ 10:15");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 08:35 || Arrives Howrah @ 10:05");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 09:18 || Arrives Howrah @ 11:20");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 10:03 || Arrives Howrah @ 12:10");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 11:10 || Arrives Howrah @ 13:15");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 11:45 || Arrives Howrah @ 14:15");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 13:08 || Arrives Howrah @ 15:25");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 14:20 || Arrives Howrah @ 16:20");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 15:25 || Arrives Howrah @ 17:30");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 16:40 || Arrives Howrah @ 18:45");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 17:50 || Arrives Howrah @ 19:55");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 18:45 || Arrives Howrah @ 20:47");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 19:20 || Arrives Howrah @ 21:40");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 20:00 || Arrives Howrah @ 22:05");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 20:20 || Arrives Howrah @ 22:25");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 20:43 || Arrives Howrah @ 22:45");
        System.out.println("Barddhaman Jn-Howrah Chord Local || Departs Burdwan @ 22:00 || Arrives Howrah @ 00:03");
        System.out.println("");

    }


    // Method to book the train ticket
    @Override

    public void bookTicket(int x) {
        Scanner sc = new Scanner(System.in);

        int y = 0, z = 0;
        System.out.println("Use the short form of the station");
        System.out.println(
                "HWH-Howrah LLH-Liluah BEQ-Belur BZL-Belanagar DKAE-Dankuni Junction GBRA- Gobra JOX-Janai Road BPAE-Begampur BRPA-Baruipara MBE-Mirzapur Bnakipur\n\nBLAE-Balarambati KQU-Kamarkundu MDSE-Madhusudanpur CDAE-Chandanpur PBZ-Porabazar BMAE-Belmuri DNHL-Dhanikhali Halt SHBC-Sibaichandi HIH-Hajigrah GRAE-Gurap\n\nJPQ-Jhapandanga JRAE-Jaugram NBAE-Nabagram MSAE-Masagram PRAE-Pallaroad SKG-Saktigarh GRP-Gangpur BWN-BardhamanJN");

        System.out.println();

        System.out.print("Enter your name--> ");
        username[x] = sc.nextLine();

        System.out.print("From station: ");
        stations[x][0] = sc.nextLine().toUpperCase();

        System.out.print("To station: ");
        stations[x][1] = sc.nextLine().toUpperCase();

        for (int i = 0; i < stationName.length; i++) {
            if (stations[x][0].equals(stationName[i])) {
                y = i;
            } else if (stations[x][1].equals(stationName[i])) {
                z = i;
            }
        }

        ticketPrice[x] = Math.abs((y - z)) * 10;
        System.out.println("Ticket Price: Rs" + ticketPrice[x]);

        System.out.print("Press y/n to confirm the booking: ");
        char ch = sc.next().charAt(0);

        if (ch == 'y' || ch == 'Y') {
            System.out.println("✔✔Booking Confirmed✔✔");
            System.out.println("!!Thank You!!");
            System.out.println("Eastern Railway wishes you a happy and safe journey");
        } else {
            System.out.println("...✖ Booking cancled ✖...");
        }

    }

    // Method to get the ticket status
    @Override

    public void getStatus(int x) {

        Train_Numgen num = new Train_Numgen();
        System.out.println();

        if (username[x] != null && stations[x][0] != null && stations[x][1] != null && ticketPrice[x] != 0) {
            System.out.println("**********************************************");
            System.out.println("        Username - " + username[x]);
            System.out.println("*--------------------------------------------*");
            System.out.println("        Unique Id- " + x);
            System.out.println("*--------------------------------------------*");
            System.out.println("        Train No- " + num.numgen());
            System.out.println("*--------------------------------------------*");
            System.out.println("        From Station - " + stations[x][0]);
            System.out.println("*--------------------------------------------*");
            System.out.println("        To Station - " + stations[x][1]);
            System.out.println("*--------------------------------------------*");
            System.out.println("        Ticket Price - " + ticketPrice[x]);
            System.out.println("**********************************************");

        } else {
            System.out.println("Sorry no data found on this data code.");
        }
        System.out.println();

    }
}

public class Main {
    public static void main(String[] args) {

        boolean config = true;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Train tr = new Train();

        while (config == true) {

            int randomNumber = random.nextInt(10000);
            boolean containsElement = hashSet.contains(randomNumber);

            if (containsElement == false) {
                hashSet.add(randomNumber);
                System.out.println("************🚉🚉 Welcome To Eastern Railway 🚉🚉***********");
                System.out.println("*                  Select any of the option                 *");
                System.out.println("*                  ---1.Book Train Ticket---                *");
                System.out.println("*                ---2.Check My Ticket Status---             *");
                System.out.println("*                 ---3.Check Train Timetable---             *");
                System.out.println("*                         --4.Exit--                        *");
                System.out.println("*************************************************************");
                System.out.println();

                System.out.print("Enter your option --> ");
                int optionInp = sc.nextInt();

                switch (optionInp) {
                    case 1:
                        hashSet.add(randomNumber);
                        System.out.println("Your Data code: " + randomNumber);
                        tr.bookTicket(randomNumber);
                        break;
                    case 2:
                        System.out.print("Enter your unique data code: ");
                        int code = sc.nextInt();
                        tr.getStatus(code);
                        break;
                    case 3:
                        tr.time();
                        break;
                    case 4:
                        config = false;
                        break;
                    default:
                        System.out.println("❌❌❌Invalid Option❌❌❌");
                        System.out.println("❗❗Please enter a valid option❗❗");
                        break;
                }

            }
        }
    }
}