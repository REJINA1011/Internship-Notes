package com.f1soft.Task.UniqueNameFind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NameController {

    @Autowired
    NameServices nameServices;

    @PostMapping("/addNames")
    private void addNames(@RequestBody NameList nameList){
      nameServices.addNames(nameList);
    }

    @GetMapping("/getAllNames")
    private List<NameList> getAllNames(){
        return nameServices.getAllNames();

    }

    @GetMapping("/getUniqueNames")
    private List<NameList> getUniqueNames(){
        return nameServices.getUniqueNames();

    }


    //PutMapping
//    @PutMapping("/updateNames/{id}")
//    private void updateNames(@PathVariable String id,@RequestBody NameList nameList ){
//        nameServices.updatenames(id, nameList);
//    }

}
