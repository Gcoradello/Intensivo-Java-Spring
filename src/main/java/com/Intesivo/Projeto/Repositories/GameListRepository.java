package com.Intesivo.Projeto.Repositories;

import com.Intesivo.Projeto.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
