package com.example.belajar.cerpen;
import java.util.List;

import org.springframework.data.jpa.repository.*;

public interface CerpenRepository extends JpaRepository<Cerpen, Long> {
    @Query("select c from Cerpen c where c.karakter = ?1")
    public List<Cerpen> searchKarakter(String nama);
}
