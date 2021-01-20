package weatherapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weatherapplication.repository.entity.EntityWeather;

@Repository
public interface WeatherRepository extends JpaRepository<EntityWeather,Integer> {
    EntityWeather findByCityName(String cityName);
}
