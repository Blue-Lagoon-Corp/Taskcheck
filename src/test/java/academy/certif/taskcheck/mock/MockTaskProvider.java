package academy.certif.taskcheck.mock;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.domain.Task;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

import java.util.ArrayList;

public class MockTaskProvider extends EntityCheckableProvider {

    @Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {
        return new ArrayList<>();
    }

    @Override
    public EntityCheckable find(int id) {
        return new Task(1, "test");
    }

    @Override
    public void setDone(int id, boolean isDone) {

    }
}
