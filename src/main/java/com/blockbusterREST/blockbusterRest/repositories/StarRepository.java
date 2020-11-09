package com.blockbusterREST.blockbusterRest.repositories;

import com.blockbusterREST.blockbusterRest.domain.Star;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarRepository extends JpaRepository<Star,Long> {
}
