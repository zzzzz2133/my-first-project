package com.example.demo2.service;

import com.example.demo2.pojo.Worker;
import com.example.demo2.pojo.WorkerDTO;
import com.example.demo2.repository.WorkerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService implements IWorkerService {
    @Autowired
    WorkerRepository workerRepository;


    @Override
    public void add(Worker worker) {
        workerRepository.save(worker);
    }

    @Override
    public void update(Worker worker) {
        workerRepository.save(worker);
    }

    @Override
    public WorkerDTO getWorkerById(int id) {
        Worker worker = workerRepository.findById(id).orElseThrow(()->{
            try {
                throw  new IllegalAccessException("用户不存在");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
        WorkerDTO workerDTO = new WorkerDTO();
        BeanUtils.copyProperties(worker, workerDTO);
        return workerDTO;


    }


}
