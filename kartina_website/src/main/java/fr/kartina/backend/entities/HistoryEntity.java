package fr.kartina.backend.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="HISTORY")
public class HistoryEntity {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "id_bill")
public Long idBill;

@Column(name = "id_art")
public Integer idArt;

@Column(name = "name_customer", length = 100)
public String nameCustomer;

@Column(name = "first_name_customer", length = 100)
public String firstNameCustomer;

@Column(name = "phone_customer", length = 20)
public String phoneCustomer;

@Column(name = "email_customer", length = 150)
public String emailCustomer;

@Column(name = "date_bill")
public Date dateBill;

public float price;
}
