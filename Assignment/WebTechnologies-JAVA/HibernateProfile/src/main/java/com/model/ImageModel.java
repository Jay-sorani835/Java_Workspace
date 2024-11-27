package com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="image")
public class ImageModel implements Serializable {

    @Id
	@GeneratedValue
	@GenericGenerator(name="incrment",strategy = "increment")
    @Column(name = "id")
    private int id;
    
    private String image;
    private String time;
    public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public User getEmail() {
		return email;
	}

	public void setEmail(User email) {
		this.email = email;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@ManyToOne
    @JoinColumn(name = "email", referencedColumnName = "email", nullable = false)
    @Column(name = "email")
    private User email;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getImage() {
		return image;
	}

	public User getEmailEntity() {
        return email;
    }

    public void setEmailEntity(User email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageModel that = (ImageModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
