package com.example.trainer.services;

import com.example.trainer.model.Trainers;
import com.example.trainer.repository.TrainerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerServiceInterface {

    @Autowired
    TrainerRepository trainerRepository;

    @Override
    public List<Trainers> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public void addTrainers(Trainers t) {
        trainerRepository.save(t);
    }

    @Override
    public void updateTrainer(Trainers t) {
      
        trainerRepository.save(t);
    }

    @Override
    public void deleteTrainer(Integer id) {
        trainerRepository.deleteById(id);
        
    }

    @Override
    public Trainers findTrainerById(Integer id) {
        return trainerRepository.getOne(id);
    }

 

}
