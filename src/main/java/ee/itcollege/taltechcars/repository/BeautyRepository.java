package ee.itcollege.taltechcars.repository;

import ee.itcollege.taltechcars.model.BeautyService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeautyRepository extends JpaRepository<BeautyService, Long> {
}
