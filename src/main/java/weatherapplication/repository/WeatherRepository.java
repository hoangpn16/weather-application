package weatherapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<EntityWeather,Integer> {
    EntityWeather findByCityName(String cityName);
}
