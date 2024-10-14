package com.swamedia.siswa.repository;

import com.swamedia.siswa.entity.siswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiswaRepository extends JpaRepository<siswa, Long> {
}
