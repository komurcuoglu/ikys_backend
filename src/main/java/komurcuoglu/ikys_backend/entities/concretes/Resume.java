package komurcuoglu.ikys_backend.entities.concretes;

import java.time.LocalDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="resumes")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="creation_date")
    private LocalDateTime creationDate;

    @OneToOne
    @JoinColumn(name="candidate_id")
    private Candidate candidate;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name="cover_letter_id")
    private CoverLetter coverLetter;

    @JsonIgnore
    @OneToMany(mappedBy="resume")
    private List<Education> educations;

    @JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Experience> experiences;

    @JsonIgnore
    @OneToMany(mappedBy ="resume")
    private List<LanguageLevel> languageLevels;

    @JsonIgnore
    @OneToMany(mappedBy = "resume")
    private List<Link> links;

    @JsonIgnore
    @OneToMany(mappedBy ="resume")
    private List<Skill> skills;

    public Resume(Candidate candidate){
        this.setCandidate(candidate);
    }

}
