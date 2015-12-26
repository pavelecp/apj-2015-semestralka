package cz.cvut.fit.pavelpat.apj.semestralka.model.id;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class AbstractID<T extends AbstractID> implements Serializable, Comparable<T> {

	private Long id;

	public AbstractID() {
	}

	public AbstractID(Long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.id == null) {
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
