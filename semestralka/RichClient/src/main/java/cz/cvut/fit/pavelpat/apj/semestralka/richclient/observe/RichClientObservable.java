package cz.cvut.fit.pavelpat.apj.semestralka.richclient.observe;

import java.util.Observable;

public class RichClientObservable extends Observable {

	private static RichClientObservable instance = new RichClientObservable();
	
	private RichClientObservable() {
	}

	public static RichClientObservable getInstance() {
		return instance;
	}
	
	@Override
	public void notifyObservers(Object arg) {
		super.setChanged();
		super.notifyObservers(arg);
	}
	
}
