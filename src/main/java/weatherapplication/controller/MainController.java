package weatherapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import weatherapplication.repository.EntityWeather;
import weatherapplication.repository.WeatherRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    WeatherRepository repo;


    @GetMapping(value = "/weather")
    public String homePage(Model model) {
        List<EntityWeather> list = repo.findAll();
        model.addAttribute("listWeather", list);
        return "home";
    }

    @GetMapping(value = "/detail/")
    public String detailCityTemp(Model model, @RequestParam(required = false, value = "cityname") String cityname) {
        EntityWeather response = repo.findByCityName(cityname);
        model.addAttribute("response", response);
        return "citydetail";
    }
}
