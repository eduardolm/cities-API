package one.digitalinnovation.citiesapi.repository;

import one.digitalinnovation.citiesapi.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository  extends JpaRepository<State, Long> {
}
