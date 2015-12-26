package cz.cvut.fit.pavelpat.apj.semestralka.utils;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public enum Messages {
	
	Library,
	Create_Book;
	
	public String createMessage(Object...args) {
		ResourceBundle bundle = ResourceBundle.getBundle("bundles.properties");
		String rm = bundle.getString(this.name());
		return MessageFormat.format(rm, args);
	}
	
}
