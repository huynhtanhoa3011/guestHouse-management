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
    private String province_id;
    private String province_name;
    private String district_id;
    private String district_name;
    private String ward_id;
    private String ward_name;
    private Date timeCheckin;

    public Customer(String fullName, String indentity, String gender, String phone, Date timeCheckin) {
        this.fullName = fullName;
        this.indentity = indentity;
        this.gender = gender;
        this.phone = phone;
        this.timeCheckin = timeCheckin;
    }

    public Customer(String fullName, Room room, String indentity, String gender, String phone, String province_id, String province_name, String district_id, String district_name, String ward_id, String ward_name, Date timeCheckin) {
        this.fullName = fullName;
        this.room = room;
        this.indentity = indentity;
        this.gender = gender;
        this.phone = phone;
        this.province_id = province_id;
        this.province_name = province_name;
        this.district_id = district_id;
        this.district_name = district_name;
        this.ward_id = ward_id;
        this.ward_name = ward_name;
        this.timeCheckin = timeCheckin;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", room=" + room +
                ", indentity='" + indentity + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", province_id='" + province_id + '\'' +
                ", province_name='" + province_name + '\'' +
                ", district_id='" + district_id + '\'' +
                ", district_name='" + district_name + '\'' +
                ", ward_id='" + ward_id + '\'' +
                ", ward_name='" + ward_name + '\'' +
                ", timeCheckin=" + timeCheckin +
                '}';
    }
}


