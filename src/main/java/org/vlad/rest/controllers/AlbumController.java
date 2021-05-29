package org.vlad.rest.controllers;

import org.vlad.rest.models.album.Album;
import org.vlad.rest.service.AlbumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/albums")

public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Album> getAlbum(@PathVariable(name = "id") Integer id) {
        if(albumService.getAlbum(id) != null) {
            return new ResponseEntity<Album>(albumService.getAlbum(id), HttpStatus.OK);
        }
        return new ResponseEntity<Album>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public List<Album> getAlbums() {
        return albumService.getAlbums();
    }

    @PostMapping
    public Album createAlbum(@RequestBody @Valid Album Album) {
        return albumService.addAlbum(Album);
    }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Album> updateAlbum(@Valid @PathVariable("id") int id, @RequestBody Album album) {
        if (albumService.getAlbum(id) != null) {
            return new ResponseEntity<Album>(albumService.updateAlbum(id, album), HttpStatus.OK);
        } else {
            return new ResponseEntity<Album>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAlbumById(@PathVariable("id") Integer id) {
        albumService.deleteAlbumById(id);
    }
}
