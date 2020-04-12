/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.trainer.controllers;

import com.example.trainer.model.Trainers;
import com.example.trainer.services.TrainerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author kwsta
 */
@Controller
public class TrainerController {

    @Autowired
    TrainerServiceInterface trainerServiceInterface;

    @GetMapping("/trainers")
    public String getTrainers(ModelMap mm) {
        mm.addAttribute("alltrainers", trainerServiceInterface.getAllTrainers());
        return "alltrainers"; // 
    }

    @GetMapping("/addTrainersForm")
    public String trainerForm(ModelMap mm) {
        Trainers t = new Trainers();
        mm.addAttribute("trainer", t);
        return "addTrainers";
    }

    @PostMapping("/addTrainers")
    public String addTrainers(@ModelAttribute("addTrainers") Trainers t) {
        trainerServiceInterface.addTrainers(t);

        return "redirect:/trainers";
    }

    @GetMapping("/mainMenu")
    public String mainMenu() {
        return "redirect:/";
    }

    @PostMapping("/deleteTrainer")
    public String deleteTrainers(@RequestParam("TrainerID") Integer id) {
        System.out.println(id);
        trainerServiceInterface.deleteTrainer(id);

        return "redirect:/trainers";
    }

    @PostMapping("/updateTrainerForm")
    public String updateTrainers(@RequestParam("TrainerID") Integer id, ModelMap mm) {
        Trainers t1 = trainerServiceInterface.findTrainerById(id);
        
        mm.addAttribute("t1", t1);

        return "updateTrainers";
    }

    @PostMapping("/updateTrainers")
    public String updateTrainers(@ModelAttribute("t1") Trainers t) {
      
        trainerServiceInterface.updateTrainer(t);

        return "redirect:/trainers";
    }
}
