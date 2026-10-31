package com.example.repository;

import com.example.model.ConversionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConversionHistoryRepository extends JpaRepository<ConversionHistory, Long> {
    // Fungsi custom untuk mencari sejarah penukaran berdasarkan nama pengguna
    List<ConversionHistory> findByUsername(String username);
}
