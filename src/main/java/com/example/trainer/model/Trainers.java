/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.trainer.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kwsta
 */
@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t")
    , @NamedQuery(name = "Trainers.findByTrainerid", query = "SELECT t FROM Trainers t WHERE t.trainerid = :trainerid")
    , @NamedQuery(name = "Trainers.findByFirstname", query = "SELECT t FROM Trainers t WHERE t.firstname = :firstname")
    , @NamedQuery(name = "Trainers.findByLastname", query = "SELECT t FROM Trainers t WHERE t.lastname = :lastname")
    , @NamedQuery(name = "Trainers.findBySubject", query = "SELECT t FROM Trainers t WHERE t.subject = :subject")})
public class Trainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TRAINERID")
    private Integer trainerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "LASTNAME")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SUBJECT")
    private String subject;

    public Trainers() {
    }

    public Trainers(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public Trainers(Integer trainerid, String firstname, String lastname, String subject) {
        this.trainerid = trainerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }

    public Integer getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerid != null ? trainerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainers)) {
            return false;
        }
        Trainers other = (Trainers) object;
        if ((this.trainerid == null && other.trainerid != null) || (this.trainerid != null && !this.trainerid.equals(other.trainerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.trainer.model.Trainers[ trainerid=" + trainerid + " ]";
    }
    
}
