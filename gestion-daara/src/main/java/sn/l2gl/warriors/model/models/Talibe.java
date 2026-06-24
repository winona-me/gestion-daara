package sn.l2gl.warriors.model.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "talibes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Talibe {

    @Id
    private String matricule;

    private String prenom;
    private String nom;
    private LocalDate dateNaissance;
    private String nomTuteur;
    private String telephoneTuteur;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;
}