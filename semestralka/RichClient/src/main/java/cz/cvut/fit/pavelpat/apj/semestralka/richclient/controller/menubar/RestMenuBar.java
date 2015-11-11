package cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller.menubar;

import cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller.FileMenu;
import cz.cvut.fit.pavelpat.apj.semestralka.richclient.controller.RestMenu;
import javafx.scene.control.MenuBar;

public class RestMenuBar extends MenuBar {

	public RestMenuBar() {
		getMenus().add(new FileMenu());
		getMenus().add(new RestMenu());
	}
}
