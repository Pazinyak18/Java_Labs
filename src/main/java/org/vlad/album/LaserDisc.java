package org.vlad.album;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class LaserDisc extends Album{

    private String cdFormat;
    private int amountOfDataInBits;
    private int amountOfLayers;

    public LaserDisc(final String namePar, final String bandPar, final Gener typeOfGenerPar, final int amountOfSongsPar,
                     final int durationInSecPar, final float pricePar,final String cdFormatPar ,final int amountOfDataInBitsPar,
                     final int amountOfLayersPar) {
        super(namePar, bandPar, typeOfGenerPar, amountOfSongsPar , durationInSecPar, pricePar);
        this.cdFormat = cdFormatPar;
        this.amountOfDataInBits = amountOfDataInBitsPar;
        this.amountOfLayers = amountOfLayersPar;
    }
}
