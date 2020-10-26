/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JoseMiguel
 */
@Entity
@Table(name = "alquiler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alquiler.findAll", query = "SELECT a FROM Alquiler a"),
    @NamedQuery(name = "Alquiler.findByCodAlquiler", query = "SELECT a FROM Alquiler a WHERE a.codAlquiler = :codAlquiler"),
    @NamedQuery(name = "Alquiler.findByValorAlquiler", query = "SELECT a FROM Alquiler a WHERE a.valorAlquiler = :valorAlquiler"),
    @NamedQuery(name = "Alquiler.findByFechaCompra", query = "SELECT a FROM Alquiler a WHERE a.fechaCompra = :fechaCompra"),
    @NamedQuery(name = "Alquiler.findByFechaEntrega", query = "SELECT a FROM Alquiler a WHERE a.fechaEntrega = :fechaEntrega")})
public class Alquiler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_alquiler")
    private Integer codAlquiler;
    @Column(name = "valor_alquiler")
    private Integer valorAlquiler;
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario")
    @ManyToOne
    private Usuario codUsuario;
    @JoinColumn(name = "cod_videojuego", referencedColumnName = "cod_videojuego")
    @ManyToOne
    private Videojuego codVideojuego;

    public Alquiler() {
    }

    public Alquiler(Integer codAlquiler) {
        this.codAlquiler = codAlquiler;
    }

    public Integer getCodAlquiler() {
        return codAlquiler;
    }

    public void setCodAlquiler(Integer codAlquiler) {
        this.codAlquiler = codAlquiler;
    }

    public Integer getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(Integer valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Videojuego getCodVideojuego() {
        return codVideojuego;
    }

    public void setCodVideojuego(Videojuego codVideojuego) {
        this.codVideojuego = codVideojuego;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAlquiler != null ? codAlquiler.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alquiler)) {
            return false;
        }
        Alquiler other = (Alquiler) object;
        if ((this.codAlquiler == null && other.codAlquiler != null) || (this.codAlquiler != null && !this.codAlquiler.equals(other.codAlquiler))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Alquiler[ codAlquiler=" + codAlquiler + " ]";
    }
    
}
