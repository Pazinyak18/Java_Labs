package org.vlad.rest.service;

import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.vlad.rest.models.album.Album;


@Service
@ApplicationScope
public class AlbumService {
    private AtomicInteger id = new AtomicInteger(0);

    private final Map<Integer, Album> ALBUM_MAP = new HashMap<Integer, Album>();

    public Album addAlbum(Album Album) {
        Integer AlbumId = id.incrementAndGet();
        Album.setId(AlbumId);
        ALBUM_MAP.put(AlbumId, Album);
        return Album;
    }

    public Album updateAlbum(int id, Album Album) {
        Album.setId(id);
        return ALBUM_MAP.put(id, Album);
    }

    public List<Album> getAlbums() {
        return ALBUM_MAP.values().stream().collect(Collectors.toList());
    }

    public Album getAlbum(Integer id) {
        return ALBUM_MAP.get(id);
    }

    public Map<Integer, Album> getAlbumMap(){
        return ALBUM_MAP;
    }

    public void deleteAlbumById(Integer id){
        ALBUM_MAP.remove(id);
    }
}
