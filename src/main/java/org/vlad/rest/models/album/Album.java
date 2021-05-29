package org.vlad.rest.models.album;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Album {
    private Integer id;

    @NotNull(message = "Missing name")
    @Size(min=2, max=32)
    private String name;

    @NotNull(message = "Missing band")
    @Size(min=2, max=32)
    private String band;

    @NotNull(message = "Missing typeOfGener (enum)")
    @Enumerated(EnumType.STRING)
    private Gener typeOfGener;

    @NotNull(message = "Missing amountOfSongs")
    @Min(1)
    @Max(9999)
    private int amountOfSongs;

    @NotNull(message = "Missing durationInSec")
    @Min(1)
    @Max(99999)
    private int durationInSec;

    @NotNull(message = "Missing price")
    @Min(1)
    @Max(999999)
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
