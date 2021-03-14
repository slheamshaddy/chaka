package com.test.chaka.model;

import java.sql.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int Id;
private String merchantId;
private String name;
private String userId;
@Basic(optional = false)
@Column(name = "date", insertable = false, updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
private Date date;
}
