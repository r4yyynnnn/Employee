package com.swamedia.siswa.controller;

import com.swamedia.siswa.dto.SiswaDto;
import com.swamedia.siswa.service.Siswaservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/siswa")
@AllArgsConstructor
public class SiswaController {

    private Siswaservice siswaService;

    // Build add Employee REST API
    @PostMapping
    public ResponseEntity<SiswaDto> createSiswa(@RequestBody SiswaDto siswaDto){
        SiswaDto savedSiswa = siswaService.createSiswa(siswaDto);
        return  new ResponseEntity<>(savedSiswa, HttpStatus.CREATED);
    }

    //Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<SiswaDto> getSiswaById(@PathVariable("id") Long siswaId){
        SiswaDto siswaDto = siswaService.getSiswaById(siswaId);
        return ResponseEntity.ok(siswaDto);
    }

    //Build Get All Employees REST API
    @GetMapping
    public ResponseEntity<List<SiswaDto>> getAllSiswa(){
        List<SiswaDto> siswa = siswaService.getAllSiswa();
        return ResponseEntity.ok(siswa);
    }

    //Build Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<SiswaDto> updateSiswa(@PathVariable("id") Long siswaId,
                                                   @RequestBody SiswaDto updatedSiswa){
        SiswaDto siswaDto = siswaService.updateSiswa(siswaId, updatedSiswa);
        return ResponseEntity.ok(siswaDto);
    }

    //Build Delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteSiswa(@PathVariable("id") Long siswaId){
        siswaService.deleteSiswa(siswaId);
        return  ResponseEntity.ok("Siswa Dihapus" );
    }
}
