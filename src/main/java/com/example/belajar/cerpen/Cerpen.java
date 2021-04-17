package com.example.belajar.cerpen;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cerpen {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String sinopsis;
    String karakter;
    String cerita;
    Date date;


    public Cerpen() {
    }

    public Cerpen(Long id, String title, String sinopsis, String karakter, String cerita, Date date) {
        this.id = id;
        this.title = title;
        this.sinopsis = sinopsis;
        this.karakter = karakter;
        this.cerita = cerita;
        this.date = date;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getKarakter() {
        return this.karakter;
    }

    public void setKarakter(String karakter) {
        this.karakter = karakter;
    }

    public String getCerita() {
        return this.cerita;
    }

    public void setCerita(String cerita) {
        this.cerita = cerita;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cerpen id(Long id) {
        setId(id);
        return this;
    }

    public Cerpen title(String title) {
        setTitle(title);
        return this;
    }

    public Cerpen sinopsis(String sinopsis) {
        setSinopsis(sinopsis);
        return this;
    }

    public Cerpen karakter(String karakter) {
        setKarakter(karakter);
        return this;
    }

    public Cerpen cerita(String cerita) {
        setCerita(cerita);
        return this;
    }

    public Cerpen date(Date date) {
        setDate(date);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cerpen)) {
            return false;
        }
        Cerpen cerpen = (Cerpen) o;
        return Objects.equals(id, cerpen.id) && Objects.equals(title, cerpen.title) && Objects.equals(sinopsis, cerpen.sinopsis) && Objects.equals(karakter, cerpen.karakter) && Objects.equals(cerita, cerpen.cerita) && Objects.equals(date, cerpen.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, sinopsis, karakter, cerita, date);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", sinopsis='" + getSinopsis() + "'" +
            ", karakter='" + getKarakter() + "'" +
            ", cerita='" + getCerita() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }

}
