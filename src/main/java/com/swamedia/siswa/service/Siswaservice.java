package com.swamedia.siswa.service;

import com.swamedia.siswa.dto.SiswaDto;

import java.util.List;

public interface Siswaservice {
    SiswaDto createSiswa(SiswaDto siswaDto);

    SiswaDto getSiswaById(Long siswaId);

    List<SiswaDto> getAllSiswa();

    SiswaDto updateSiswa(Long siswaId, SiswaDto updateSiswa);

    void deleteSiswa(Long siswaId);
}
