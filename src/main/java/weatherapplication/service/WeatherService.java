package weatherapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weatherapplication.repository.WeatherRepository;
import weatherapplication.repository.entity.EntityWeather;
import java.util.List;
@Service
public class WeatherService {
    @Autowired
    WeatherRepository repo;

    public List<EntityWeather> findAll(){
        return repo.findAll();
    }
    public EntityWeather findByCityName(String cityName){
        return repo.findByCityName(cityName);
    }
}
