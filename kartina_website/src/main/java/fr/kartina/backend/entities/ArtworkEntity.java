package fr.kartina.backend.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ARTWORKS")
public class ArtworkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_art")
    private Integer idArt;

    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    @Column(name = "name_art", nullable = false)
    @NotBlank
    private String nameArt;

    @Column(name = "price_art", nullable = false)
    @NotBlank
    private float priceArt;

    @Column(nullable = false)
    @NotBlank
    private String theme;

    @Column(name = "publish_date")
    private LocalDateTime publishDate;

    @Column(name = "ending_date")
    @Temporal(TemporalType.DATE)
    private LocalDate endingDate;

    @Column(name = "path_url", nullable = false)
    private String pathUrl;

    @Column(name = "available", nullable = false)
    private boolean available;

    @Column(name = "type_classic", nullable = false)
    private boolean typeClassic;

    @Column(name = "type_large", nullable = false)
    private boolean typeLarge;

    @Column(name = "type_collector", nullable = false)
    private boolean typeCollector;

    @Column(name = "type_giant", nullable = false)
    private boolean typeGiant;

    @OneToOne(fetch = FetchType.LAZY)
    private FilterEntity idArtFilter;



}