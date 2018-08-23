package mounika;

import com.google.gwt.angular.client.AngularController;

/**
 * This is your Controller
 * append injected services to the onInit-Method
 * all public methods are exposed to the View
 */
public class MyController extends AngularController<MyScope> {
	public void onInit(MyScope scope) {
		scope.name("World");
	}
	
	public void resetName() {
		scope.name("World");
	}
	
	public void toUpper() {
		scope.name(scope.name().toUpperCase());
	}
	
	public void toLower() {
		scope.name(scope.name().toLowerCase());
	}
}
