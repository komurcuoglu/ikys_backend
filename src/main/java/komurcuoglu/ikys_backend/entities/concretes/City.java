package komurcuoglu.ikys_backend.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateInitializer","handler"})
@Table(name="cities")
public class City {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="city")
    private String city;


}
