package com.example.demo2.service;

import com.example.demo2.pojo.Worker;
import com.example.demo2.pojo.WorkerDTO;

public interface IWorkerService {

    public void add (Worker worker);
    public void update(Worker worker);
    public WorkerDTO getWorkerById(int id);
}
