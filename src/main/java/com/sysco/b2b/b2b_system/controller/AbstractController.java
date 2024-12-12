package com.sysco.b2b.b2b_system.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

public abstract class AbstractController<T, ID> {

    @PostMapping
    public abstract ResponseEntity<T> create(@RequestBody T dto);

    @GetMapping("/{id}")
    public abstract ResponseEntity<T> getById(@PathVariable ID id);

    @GetMapping
    public abstract ResponseEntity<List<T>> getAll();

    @PutMapping("/{id}")
    public abstract ResponseEntity<T> update(@PathVariable ID id, @RequestBody T dto);

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable ID id) {
        return ResponseEntity.ok("Entity deleted successfully.");
    }
}
