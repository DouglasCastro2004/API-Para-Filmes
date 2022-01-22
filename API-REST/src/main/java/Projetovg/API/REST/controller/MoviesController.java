package Projetovg.API.REST.controller;


import Projetovg.API.REST.controller.model.MoviesModel;
import Projetovg.API.REST.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MoviesController {

    @Autowired
    private MoviesRepository repository;

    @GetMapping(path = "/movies")
    public Iterable<MoviesModel> getAll() {

        return repository.findAll();

    }

    @GetMapping(path = "/movies/{id}")
    public ResponseEntity get(@PathVariable("id") Integer id) {

        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/movies")
    public MoviesModel create(@RequestBody MoviesModel movies) {
        return repository.save(movies);

    }

    @PutMapping(path = "/movies")
    public MoviesModel update(@RequestBody MoviesModel movies) {
        return repository.save(movies);
    }

    @DeleteMapping(path = "/movies/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

}
