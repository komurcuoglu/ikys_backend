package komurcuoglu.ikys_backend.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName="id")
@Table(name="candidates")

public class Candidate {

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_number")
    private String identityNumber;

    @Column(name="date_of_birth")
    private String dateOfBirth;

    @JsonIgnore
    @OneToOne(mappedBy="user")
    private UserActivation userActivation;
}
