package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "customers")
//@Accessors(chain = true)
public class Customer  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "room_id",referencedColumnName = "id")
    private Room room;

    private String indentity;
    private String gender;
    private String phone;
    private String province_name;
    private String district;
    private String ward;
    private Date timeCheckin;

    public Customer(String fullName, String indentity, String gender, String phone, Date timeCheckin) {
        this.fullName = fullName;
        this.indentity = indentity;
        this.gender = gender;
        this.phone = phone;
        this.timeCheckin = timeCheckin;
    }

    public Customer(String fullName, String indentity, String gender, String phone, String province_name, String district, String ward, Date timeCheckin) {
        this.fullName = fullName;
        this.indentity = indentity;
        this.gender = gender;
        this.phone = phone;
        this.province_name = province_name;
        this.district = district;
        this.ward = ward;
        this.timeCheckin = timeCheckin;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", indentity='" + indentity + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", province_name='" + province_name + '\'' +
                ", district='" + district + '\'' +
                ", ward='" + ward + '\'' +
                ", timeCheckin=" + timeCheckin +
                '}';
    }
}


