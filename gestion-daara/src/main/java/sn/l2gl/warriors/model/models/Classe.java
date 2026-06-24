package sn.l2gl.warriors.model.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "classes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Classe {

    @Id
    private String code;

    private String libelle;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToOne
    @JoinColumn(name = "maitre_id")
    private Maitre maitre;
}