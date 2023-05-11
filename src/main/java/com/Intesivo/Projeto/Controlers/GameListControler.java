package com.Intesivo.Projeto.Controlers;

import com.Intesivo.Projeto.GameServices.GameListService;
import com.Intesivo.Projeto.dto.GameListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
    @Autowired
    private GameListService listService;


    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = listService.findAll();
        return result;
    }


}
