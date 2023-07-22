package fr.kartina.backend.entities;

import fr.kartina.backend.enums.CiviliteEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="USERS")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(nullable = false, length = 100)
    @NotBlank
    private String firstName;

    @Column(nullable = false, length = 100)
    @NotBlank
    private String name;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private CiviliteEnum civility;

    @Column(nullable = false, length = 150)
    @Email
    @NotBlank
    private String email;

    @Column(nullable = false)
    @NotBlank
    private String password;

    @Transient
    @NotBlank
    private String checkPassword;

    @Column(length = 20)
    private String phone;

    @Column(nullable = false)

    private boolean banStatus = false;

    @Column(nullable = false)
    private Integer roleLevel = 0;

    @Column(nullable = false)
    private Boolean seller = false;

    @Column(nullable = false)
    private String nameArtiste = "";

    @Column(nullable = false, columnDefinition = "LONGTEXT", length = 1000)
    private String biography = "";

    @Column(nullable = false)
    private String facebook = "";

    @Column(nullable = false)
    private String twitter ="";

}
