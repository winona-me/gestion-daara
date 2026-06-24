package sn.l2gl.warriors.model.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "maitres")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maitre {

    @Id
    private String matricule;
    private String nomComplet;
    private String telephone;
}