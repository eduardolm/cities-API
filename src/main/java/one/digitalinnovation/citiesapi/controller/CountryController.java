package one.digitalinnovation.citiesapi.controller;

import one.digitalinnovation.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public ResponseEntity<?> findAll(Pageable page) {
        return ResponseEntity.ok(repository.findAll(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> fingById(@PathVariable("id") Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
