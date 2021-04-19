package one.digitalinnovation.citiesapi.repository;

import one.digitalinnovation.citiesapi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
