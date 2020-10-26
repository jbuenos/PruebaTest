/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JoseMiguel
 */
@Entity
@Table(name = "videojuego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Videojuego.findAll", query = "SELECT v FROM Videojuego v"),
    @NamedQuery(name = "Videojuego.findByCodVideojuego", query = "SELECT v FROM Videojuego v WHERE v.codVideojuego = :codVideojuego")})
public class Videojuego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_videojuego")
    private Integer codVideojuego;
    @Lob
    @Size(max = 65535)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Size(max = 65535)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 65535)
    @Column(name = "protagonistas")
    private String protagonistas;
    @Lob
    @Size(max = 65535)
    @Column(name = "director")
    private String director;
    @Lob
    @Size(max = 65535)
    @Column(name = "productor")
    private String productor;
    @Lob
    @Size(max = 65535)
    @Column(name = "tecnologia")
    private String tecnologia;
    @OneToMany(mappedBy = "codVideojuego")
    private Collection<Alquiler> alquilerCollection;

    public Videojuego() {
    }

    public Videojuego(Integer codVideojuego) {
        this.codVideojuego = codVideojuego;
    }

    public Integer getCodVideojuego() {
        return codVideojuego;
    }

    public void setCodVideojuego(Integer codVideojuego) {
        this.codVideojuego = codVideojuego;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @XmlTransient
    public Collection<Alquiler> getAlquilerCollection() {
        return alquilerCollection;
    }

    public void setAlquilerCollection(Collection<Alquiler> alquilerCollection) {
        this.alquilerCollection = alquilerCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVideojuego != null ? codVideojuego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Videojuego)) {
            return false;
        }
        Videojuego other = (Videojuego) object;
        if ((this.codVideojuego == null && other.codVideojuego != null) || (this.codVideojuego != null && !this.codVideojuego.equals(other.codVideojuego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Videojuego[ codVideojuego=" + codVideojuego + " ]";
    }
    
}
