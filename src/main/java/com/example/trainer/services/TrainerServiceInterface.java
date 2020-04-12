package com.example.trainer.services;

import com.example.trainer.model.Trainers;
import java.util.List;

public interface TrainerServiceInterface {
    
    
    public Trainers findTrainerById(Integer id);
    
    
    public void addTrainers(Trainers t);
    
    
    public List <Trainers> getAllTrainers();
    
    public void deleteTrainer(Integer id);
    
    public void updateTrainer(Trainers t);

}
