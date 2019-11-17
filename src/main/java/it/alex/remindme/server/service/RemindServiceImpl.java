package it.alex.remindme.server.service;

import it.alex.remindme.server.entity.Remind;
import it.alex.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemindServiceImpl implements ReminderService {

    @Autowired
    private RemindRepository repository;

    @Override
    public List<Remind> getAll() {
        return repository.findAll();
    }

    @Override
    public Remind getByID(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);

    }
}
