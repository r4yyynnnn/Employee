package com.swamedia.siswa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SiswaDto {
    private Long id;
    private String Nama;
    private String Kelas;
    private String WaliKelas;
}
