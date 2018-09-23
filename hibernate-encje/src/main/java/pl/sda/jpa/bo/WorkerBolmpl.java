package pl.sda.jpa.bo;

import pl.sda.jpa.dao.WorkerDaolmpl;
import pl.sda.jpa.model.Worker;

public class WorkerBolmpl {
    private WorkerDaolmpl dao;

    public void List() {
        for (Worker worker : dao.list()) {
            System.out.println(worker.toString());
        }
    }
}
