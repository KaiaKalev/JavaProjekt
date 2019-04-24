package ee.itcollege.taltechcars.repository;

import ee.itcollege.taltechcars.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
