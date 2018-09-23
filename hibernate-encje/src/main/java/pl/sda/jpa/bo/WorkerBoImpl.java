package pl.sda.jpa.bo;

import pl.sda.jpa.dao.WorkerDaoImpl;
import pl.sda.jpa.model.Worker;

public class WorkerBoImpl {

    private WorkerDaoImpl dao = new WorkerDaoImpl();

    public void list() {
        for (Worker worker : dao.list()) {
            System.out.println(worker.toString());
        }
        //dao.list().stream().forEach(System.out::println);
    }

    public void delete(Long workerId) {
        dao.delete(workerId);
    }

    public void hqlDelete(Long workerId) {
        dao.hqlDelete(workerId);
    }
}
