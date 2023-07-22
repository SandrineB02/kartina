package fr.kartina.backend.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="FILTERS")
public class FilterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_table_filters")
    private Long idTableFilters;

    @Column(name = "filter_woman", nullable = false)
    private boolean filterWoman;

    @Column(name = "filter_wild", nullable = false)
    private boolean filterWild;

    @Column(name = "filter_blackwhite", nullable = false)
    private boolean filterBlackwhite;

    @Column(name = "filter_landscape", nullable = false)
    private boolean filterLandscape;

    @Column(name = "filter_urban", nullable = false)
    private boolean filterUrban;

    @Column(name = "filter_vintage", nullable = false)
    private boolean filterVintage;

    @Column(name = "filter_travel", nullable = false)
    private boolean filterTravel;

    @Column(name = "filter_portrait", nullable = false)
    private boolean filterPortrait;

    @Column(name = "filter_panoramic", nullable = false)
    private boolean filterPanoramic;

    @Column(name = "filter_square", nullable = false)
    private boolean filterSquare;

    @OneToOne(fetch = FetchType.LAZY)
    private ArtworkEntity idArt;
}
