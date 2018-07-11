package spark.fr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spark.fr.entities.Message;
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
