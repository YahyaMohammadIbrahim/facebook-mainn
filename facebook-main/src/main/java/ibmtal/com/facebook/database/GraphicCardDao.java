package ibmtal.com.facebook.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.facebook.entity.GraphicCard;

public interface GraphicCardDao extends JpaRepository<GraphicCard, Integer> {

}
