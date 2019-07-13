/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

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
 * @author PC
 */
@Entity
@Table(name = "admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findByAdmId", query = "SELECT a FROM Admin a WHERE a.admId = :admId")
    , @NamedQuery(name = "Admin.findByAdmUser", query = "SELECT a FROM Admin a WHERE a.admUser = :admUser")
    , @NamedQuery(name = "Admin.findByAdmPass", query = "SELECT a FROM Admin a WHERE a.admPass = :admPass")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ADM_ID")
    private Integer admId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ADM_USER")
    private String admUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ADM_PASS")
    private String admPass;

    public Admin() {
    }

    public Admin(Integer admId) {
        this.admId = admId;
    }

    public Admin(Integer admId, String admUser, String admPass) {
        this.admId = admId;
        this.admUser = admUser;
        this.admPass = admPass;
    }

    public Integer getAdmId() {
        return admId;
    }

    public void setAdmId(Integer admId) {
        this.admId = admId;
    }

    public String getAdmUser() {
        return admUser;
    }

    public void setAdmUser(String admUser) {
        this.admUser = admUser;
    }

    public String getAdmPass() {
        return admPass;
    }

    public void setAdmPass(String admPass) {
        this.admPass = admPass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (admId != null ? admId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.admId == null && other.admId != null) || (this.admId != null && !this.admId.equals(other.admId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "servicios.Admin[ admId=" + admId + " ]";
    }
    
}
