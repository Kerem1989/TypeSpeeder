package se.ju23.typespeeder.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.ju23.typespeeder.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
}