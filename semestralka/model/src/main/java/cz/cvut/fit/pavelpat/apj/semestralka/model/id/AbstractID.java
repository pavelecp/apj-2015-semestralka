package cz.cvut.fit.pavelpat.apj.semestralka.model.id;

import java.io.Serializable;

public abstract class AbstractID<T extends AbstractID> implements Serializable, Comparable<T> {

	private final Long id;

	public AbstractID(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (!(obj instanceof AbstractID)) {
			return false;
		}
		
		AbstractID<T> tmp = (T) obj;
		return id.equals(tmp.getId());
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	public int compareTo(T o) {
		return getId().compareTo(o.getId());
	}
	
}
