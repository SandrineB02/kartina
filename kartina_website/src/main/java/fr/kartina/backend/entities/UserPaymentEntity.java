package fr.kartina.backend.entities;

import java.sql.Date;

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
@Table(name = "USERS_PAYMENT")
public class UserPaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_table_users_payment")
    private Long idTableUsersPayment;
    
    @Column(name = "card_name", nullable = false, length = 150)
    @NotBlank
    private String cardName;

    @Column(name = "card_number", nullable = false, length = 20)
    @NotBlank
    @Pattern(regexp = "^(?:4[0-9]{12}(?:[0-9]{3})?|[25][1-7][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\d{3})\\d{11})$")
    private String cardNumber;

    @Column(name = "expiry_date", nullable = false)
    @NotBlank
    private Date expiryDate;

    @Column(nullable = false, length = 5)
    @NotBlank
    private String ccv;

    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
    public UserEntity idUser;

    // Regex à faire

}