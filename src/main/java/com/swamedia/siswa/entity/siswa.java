package com.swamedia.siswa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "kelas")
public class siswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama")
    private String Nama;

    @Column(name = "kelas")
    private String Kelas;

    @Column(name = "waliKelas")
    private String WaliKelas;
}
