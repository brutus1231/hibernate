package pl.sda.jpa.bo;

import pl.sda.jpa.dao.WorkerDaoImpl;
import pl.sda.jpa.model.Worker;

public class WorkerBoImpl {
    private WorkerDaoImpl dao = new WorkerDaoImpl();

    public void list(){
        for (Worker worker:dao.list()) {
            System.out.println(worker.toString());
        }
    }

    public void delete(Long workerId){
        dao.delete(workerId);
    }
}
