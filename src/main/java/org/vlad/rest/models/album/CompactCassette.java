package org.vlad.rest.models.album;
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString

public class CompactCassette extends Album{

    private int capacityInSec;
    private boolean twoSides;

    public CompactCassette(final String namePar, final String bandPar, final Gener typeOfGenerPar,
                           final int amountOfSongsPar, final int durationInSecPar, final float pricePar,
                           final int capacityInSecPar, final boolean twoSidesPar) {
        super(namePar, bandPar, typeOfGenerPar, amountOfSongsPar, durationInSecPar, pricePar);
        this.capacityInSec = capacityInSecPar;
        this.twoSides = twoSidesPar;
    }
}
