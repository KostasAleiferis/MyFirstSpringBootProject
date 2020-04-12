/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.trainer.repository;

import com.example.trainer.model.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;




/**
 *
 * @author kwsta
 */
public interface TrainerRepository extends JpaRepository<Trainers, Integer>{
    
}
