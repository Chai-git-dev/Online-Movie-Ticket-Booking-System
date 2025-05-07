package com.example.movietktbookingsys.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
@ToString
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String theatreId;
    private String theatreName;
    private String address;
    private String city;
    private String landmark;
    @CreatedBy
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt;
    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDate updatedAt;
    @CreatedBy
    private String createdBy;

    @ManyToOne
    private TheatreOwner theatreOwner;

//    @OneToMany(mappedBy = "theater")
//    private List<Screen> screens;

}

