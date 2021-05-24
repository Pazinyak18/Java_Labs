package org.vlad.album;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class VinylLp extends Album{

    private int rpm;
    private int amountOfSongsOnSideA;
    private int amountOfSongsOnSideB;

    public VinylLp(String namePar, String bandPar, Gener typeOfGenerPar, int amountOfSongsPar,
                   int durationInSecPar, float pricePar, int rpmPar, int amountOfSongsOnSideAPar,
                   int amountOfSongsOnSideBPar){
        super(namePar, bandPar, typeOfGenerPar, amountOfSongsPar, durationInSecPar, pricePar);
        this.rpm = rpmPar;
        this.amountOfSongsOnSideA = amountOfSongsOnSideAPar;
        this.amountOfSongsOnSideB = amountOfSongsOnSideBPar;
    }
}
