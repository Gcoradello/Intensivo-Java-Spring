package com.Intesivo.Projeto.GameServices;

import com.Intesivo.Projeto.Repositories.GameListRepository;
import com.Intesivo.Projeto.dto.GameListDTO;
import com.Intesivo.Projeto.dto.GameMinDTO;
import com.Intesivo.Projeto.entities.Game;
import com.Intesivo.Projeto.entities.GameList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository listRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = listRepository.findAll();
        List<GameListDTO> convertDto = result.stream().map(GameList -> new GameListDTO(GameList)).toList();
        return convertDto;
    }


}
