/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Tushar
 */
@Entity
@Table(name = "CUSTOMERS_DETAIL", catalog = "", schema = "MALVIKASINHA")
@NamedQueries({
    @NamedQuery(name = "CustomersDetail.findAll", query = "SELECT c FROM CustomersDetail c")
    , @NamedQuery(name = "CustomersDetail.findByConsumerId", query = "SELECT c FROM CustomersDetail c WHERE c.consumerId = :consumerId")
    , @NamedQuery(name = "CustomersDetail.findByName", query = "SELECT c FROM CustomersDetail c WHERE c.name = :name")
    , @NamedQuery(name = "CustomersDetail.findByGender", query = "SELECT c FROM CustomersDetail c WHERE c.gender = :gender")
    , @NamedQuery(name = "CustomersDetail.findByMobileNo", query = "SELECT c FROM CustomersDetail c WHERE c.mobileNo = :mobileNo")
    , @NamedQuery(name = "CustomersDetail.findByAddress", query = "SELECT c FROM CustomersDetail c WHERE c.address = :address")
    , @NamedQuery(name = "CustomersDetail.findByPasswords", query = "SELECT c FROM CustomersDetail c WHERE c.passwords = :passwords")
    , @NamedQuery(name = "CustomersDetail.findByUnits", query = "SELECT c FROM CustomersDetail c WHERE c.units = :units")})
public class CustomersDetail implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONSUMER_ID")
    private String consumerId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PASSWORDS")
    private String passwords;
    @Column(name = "UNITS")
    private String units;

    public CustomersDetail() {
    }

    public CustomersDetail(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        String oldConsumerId = this.consumerId;
        this.consumerId = consumerId;
        changeSupport.firePropertyChange("consumerId", oldConsumerId, consumerId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        String oldMobileNo = this.mobileNo;
        this.mobileNo = mobileNo;
        changeSupport.firePropertyChange("mobileNo", oldMobileNo, mobileNo);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        String oldPasswords = this.passwords;
        this.passwords = passwords;
        changeSupport.firePropertyChange("passwords", oldPasswords, passwords);
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        String oldUnits = this.units;
        this.units = units;
        changeSupport.firePropertyChange("units", oldUnits, units);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consumerId != null ? consumerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomersDetail)) {
            return false;
        }
        CustomersDetail other = (CustomersDetail) object;
        if ((this.consumerId == null && other.consumerId != null) || (this.consumerId != null && !this.consumerId.equals(other.consumerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bill.system.CustomersDetail[ consumerId=" + consumerId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
