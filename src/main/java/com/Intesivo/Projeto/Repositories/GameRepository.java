package com.Intesivo.Projeto.Repositories;

import com.Intesivo.Projeto.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
