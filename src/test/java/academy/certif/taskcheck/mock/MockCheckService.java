package academy.certif.taskcheck.mock;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;
import academy.certif.taskcheck.service.CheckService;

public class MockCheckService extends CheckService {
    public MockCheckService(EntityCheckableProvider entityCheckableProvider) {
        super(entityCheckableProvider);
    }

    @Override
    public Iterable<EntityCheckable> listNotDone() {
        return super.listNotDone();
    }

    @Override
    public void check(int id) {
        super.check(id);
    }
}