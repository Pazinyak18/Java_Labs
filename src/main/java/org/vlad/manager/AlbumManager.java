package org.vlad.manager;

import com.google.gson.internal.bind.util.ISO8601Utils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.vlad.album.Album;
import org.vlad.album.LaserDisc;

import java.util.List;
import java.util.Optional;

@Getter
@NoArgsConstructor
public class AlbumManager {
    private List<Album> albums;

    public List<Album> getAlbums() {
        return albums;
    }

    public AlbumManager(final List<Album> albumsPar) {
        albums = albumsPar;
    }

    public void addAlbum(final Album album) {
        albums.add(album);
    }

    public List<Album> sortByName(final boolean reverse) {
        if (reverse) {
            albums.sort((Album a1, Album a2) ->
                    a2.getName().compareTo(a1.getName()));
        } else {
            albums.sort((Album a1, Album a2) ->
                    a1.getName().compareTo(a2.getName()));
        }
        return albums;
    }

    public List<Album> sortByPrice(final boolean reverse) {
        if (reverse) {
            albums.sort((Album a1, Album a2) ->
                    Float.compare(a2.getPrice(), a1.getPrice()));
        } else {
            albums.sort((Album a1, Album a2) ->
                    Float.compare(a1.getPrice(), a2.getPrice()));
        }
        return albums;
    }

    public Optional<Album> searchBar(final String search) {
        return albums.stream().filter(a -> a.getName().equals(search)).findAny().filter(a -> a instanceof LaserDisc);
    }

}
