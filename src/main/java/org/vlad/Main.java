package org.vlad;

import org.vlad.album.*;
import org.vlad.manager.AlbumManager;

import java.util.ArrayList;

public class Main{
    public static void main(final String[] args) {
        AlbumManager albumManager = new AlbumManager(new ArrayList<Album>());
        albumManager.addAlbum(new CompactCassette("What's the Story Morning Glory?", "Oasis",
                Gener.ROCK, 10, 100, 200, 20, true));
        albumManager.addAlbum(new LaserDisc("Le Dernier des heros", "KINO", Gener.ROCK,
                9, 300, 100, "Video-CD",
                858993,2));
        albumManager.addAlbum(new VinylLp("Imagine", "John Lennon", Gener.ROCK, 10,
                400, 300, 33, 5, 5));
        System.out.println("_______________________________________________________");
        System.out.println("Search cd song by gener and duration");
        System.out.println(albumManager.searchBar("Le Dernier des heros"));
        System.out.println("_______________________________________________________");
        System.out.println("Sorted by price in alphabetical order");
        albumManager.sortByName(true).forEach(System.out::println);
        System.out.println("_______________________________________________________");
        System.out.println("Sorted by price in ascending order");
        albumManager.sortByPrice(true).forEach(System.out::println);

    }
}
