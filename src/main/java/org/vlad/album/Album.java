package org.vlad.album;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Album {
    private String name;
    private String band;
    private Gener typeOfGener;
    private int amountOfSongs;
    private int durationInSec;
    private float price;

    public Album(final String namePar, final String bandPar, final Gener typeOfGenerPar, final int amountOfSongsPar,
                 final int durationInSecPar, final float pricePar) {
        this.name = namePar;
        this.band = bandPar;
        this.typeOfGener = typeOfGenerPar;
        this.amountOfSongs = amountOfSongsPar;
        this.durationInSec = durationInSecPar;
        this.price = pricePar;
    }
}
