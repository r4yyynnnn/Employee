package com.swamedia.siswa.mapper;

import com.swamedia.siswa.dto.SiswaDto;
import com.swamedia.siswa.entity.siswa;

public class SiswaMapper {

    public static SiswaDto mapToSiswaDto(siswa siswa){
        return new SiswaDto(
                siswa.getId(),
                siswa.getNama(),
                siswa.getKelas(),
                siswa.getWaliKelas()
        );
    }


    public static siswa mapToSiswa(SiswaDto siswaDto){
        return new siswa(
                siswaDto.getId(),
                siswaDto.getNama(),
                siswaDto.getKelas(),
                siswaDto.getWaliKelas()
        );
    }
}
