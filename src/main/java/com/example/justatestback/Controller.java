package com.example.justatestback;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
@CrossOrigin
public class Controller {

    @Autowired
    private InputRepository inputRepository;

    @PostMapping("/saveInput")
    public @ResponseBody boolean saveInput(@RequestBody String input){
        InputObject inputObject = new InputObject();
        inputObject.setInput(input);
        inputRepository.save(inputObject);
        return true;
    }
    @GetMapping("/fetchInput")
    public @ResponseBody List<InputObject> fetchInput(){
        return inputRepository.findAll();
    }
}
