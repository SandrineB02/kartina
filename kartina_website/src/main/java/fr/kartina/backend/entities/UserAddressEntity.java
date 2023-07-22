package fr.kartina.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS_ADDRESS")
public class UserAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_table_users_address")
    private Long idTableUsersAddress;

    @Column(nullable = false)
    @NotBlank(message = "La rue doit être complétée")
    private String street;

    @Column(length = 150)
    private String complement;

    @Column(nullable = false,length = 10)
    @Pattern(regexp = "\\d{5,6}",
    message = "Le code postal ne doit comporter que 5 ou 6 chiffres")
    @NotBlank
    private String zip;

    @Column(nullable = false, length = 80)
    @NotBlank(message = "La ville doit être complétée")
    private String city;

    @Column(nullable = false, length = 80)
    @NotBlank(message = "Le pays doit être complété")
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
    public UserEntity idUser;
}