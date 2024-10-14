package com.swamedia.siswa.service.impl;

import com.swamedia.siswa.dto.SiswaDto;
import com.swamedia.siswa.entity.siswa;
import com.swamedia.siswa.exception.ResourceNotFoundException;
import com.swamedia.siswa.mapper.SiswaMapper;
import com.swamedia.siswa.repository.SiswaRepository;
import com.swamedia.siswa.service.Siswaservice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SiswaServicempl implements Siswaservice {

    private SiswaRepository siswaRepository;
    @Override
    public SiswaDto createSiswa(SiswaDto siswaDto) {

        siswa siswa = SiswaMapper.mapToSiswa(siswaDto);
        siswa savedSiswa = siswaRepository.save(siswa);
        return SiswaMapper.mapToSiswaDto(savedSiswa);
    }


    @Override
    public SiswaDto getSiswaById(Long siswaId) {
        siswa siswa = siswaRepository.findById(siswaId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Data Siswa Tidak Ada" + siswaId));
        return SiswaMapper.mapToSiswaDto(siswa);
    }

    @Override
    public List<SiswaDto> getAllSiswa() {
        List<siswa> siswas = siswaRepository.findAll();
        return siswas.stream().map(siswa1 ->  SiswaMapper.mapToSiswaDto(siswa1))
                .collect(Collectors.toList());

    }

    @Override
    public SiswaDto updateSiswa(Long siswaId, SiswaDto updateSiswa) {

        siswa siswa = siswaRepository.findById(siswaId).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exist" + siswaId)
        );


        siswa.setNama(updateSiswa.getNama());
        siswa.setKelas(updateSiswa.getKelas());
        siswa.setWaliKelas(updateSiswa.getWaliKelas());

        siswa updatedSiswaObj = siswaRepository.save(siswa);

        return SiswaMapper.mapToSiswaDto(updatedSiswaObj);
    }

    @Override
    public void deleteSiswa(Long siswaId) {


        siswa siswa = siswaRepository.findById(siswaId).orElseThrow(
                () -> new ResourceNotFoundException("Data Siswa Tidak Ada" + siswaId)
        );

        siswaRepository.deleteById(siswaId);
    }
}
