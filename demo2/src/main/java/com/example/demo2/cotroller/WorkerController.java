package com.example.demo2.cotroller;
import com.example.demo2.pojo.Worker;
import com.example.demo2.pojo.WorkerDTO;
import com.example.demo2.service.IWorkerService;
import com.example.demo2.service.WorkerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/worker")
//localhost:8081/worker/***
public class WorkerController {
    @Autowired
    IWorkerService iWorkerService;

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }


    @GetMapping("/test")
    public String test() {
       return "测试成功";
   }
    @PostMapping("/add")
    public String add(@RequestBody Worker worker) {
       workerService.add(worker);

        return "add success";
    }
    @PutMapping("/update")
    public String update(@RequestBody Worker worker) {
        workerService.update(worker);

        return "update success";
    }
    @GetMapping("/{id}")
    public WorkerDTO getWorkerById(@PathVariable Integer id) {
        WorkerDTO dto = new WorkerDTO();
        workerService.getWorkerById(id);
        return dto;
    }

}
