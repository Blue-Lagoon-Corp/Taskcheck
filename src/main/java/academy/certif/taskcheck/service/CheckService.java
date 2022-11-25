package academy.certif.taskcheck.service;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

public class CheckService {

	private EntityCheckableProvider entityCheckableProvider;
	
	public CheckService(EntityCheckableProvider entityCheckableProvider) {
		this.entityCheckableProvider = entityCheckableProvider;
	}
	
	public Iterable<EntityCheckable> listNotDone() {
		return this.entityCheckableProvider.searchDone(false);
	}
	
	public void check(int id) {
		this.entityCheckableProvider.setDone(id, true);
	}
}
