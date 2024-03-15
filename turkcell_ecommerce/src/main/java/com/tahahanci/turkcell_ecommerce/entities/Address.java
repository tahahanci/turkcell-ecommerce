package com.tahahanci.turkcell_ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "addresses")
public class Address {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int addressID;

    @Column(name = "name")
    private String addressName;

    @Column(name = "description")
    private String addressDescription;

    @ManyToOne()
    @JoinColumn(name = "district_id")
    private District district;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_surname")
    private String receiverSurname;

    @Column(name = "receiver_phone_number")
    private String receiverPhoneNumber;

    public Address() {
    }

    public Address(String addressName, String addressDescription, District district, String receiverName, String receiverSurname, String receiverPhoneNumber) {
        this.addressName = addressName;
        this.addressDescription = addressDescription;
        this.district = district;
        this.receiverName = receiverName;
        this.receiverSurname = receiverSurname;
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressDescription() {
        return addressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverSurname() {
        return receiverSurname;
    }

    public void setReceiverSurname(String receiverSurname) {
        this.receiverSurname = receiverSurname;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }
}
