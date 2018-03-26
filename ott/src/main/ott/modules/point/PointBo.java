package main.ott.modules.point;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import main.ott.modules.sillon.SillonBo;
import main.ott.modules.sillon.SillonDto;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "points")
@Table(name = "points")
@Getter
@Setter
@EqualsAndHashCode(of = {"version", "id"})
public class PointBo {

    @Version
    @Column(name = "version")
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "isGare")
    private boolean isGare;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<SillonBo> sillons;

    public PointBo() {
        super();
    }

    public PointBo(String nom, boolean isGare) {
        this.nom = nom;
        this.isGare = isGare;
    }

    public PointBo(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isGare() {
        return isGare;
    }

    public void setGare(boolean gare) {
        isGare = gare;
    }

    public Set<SillonBo> getSillons() {
        return sillons;
    }

    public void setSillons(Set<SillonBo> sillons) {
        this.sillons = sillons;
    }
}
