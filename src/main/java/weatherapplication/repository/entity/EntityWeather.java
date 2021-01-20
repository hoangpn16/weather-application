package weatherapplication.repository.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "weather")
public class EntityWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "city_image")
    private String cityImage;

    @Column(name = "current_temp")
    private String currentTemp;

    @Column(name = "min_temp")
    private String minTemp;

    @Column(name = "max_temp")
    private String maxTemp;

}
