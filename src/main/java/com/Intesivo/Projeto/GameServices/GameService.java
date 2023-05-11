package com.Intesivo.Projeto.GameServices;

import com.Intesivo.Projeto.Repositories.GameRepository;
import com.Intesivo.Projeto.dto.GameDTO;
import com.Intesivo.Projeto.dto.GameMinDTO;
import com.Intesivo.Projeto.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result =  gameRepository.findAll();
        List<GameMinDTO> convertDto = result.stream().map(Game -> new GameMinDTO(Game)).toList();
        return  convertDto;
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }



}
