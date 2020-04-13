package stepdefs;

import java.util.Map;
import io.cucumber.java.en.Given;
import parallel.Data;

public class BetaStepDefs {

	@Given("I am in Beta project")
	public void i_am_in_Beta_project() {
		System.out.println("*** I am in Beta Project ***");
		System.out.println("Beta Thread: " + Thread.currentThread().getName());
	}

	@Given("user dispatched given order id")
	public void user_dispatched_given_order_id() {
		Map<String, String> mapFromAlphaProject = Data.getGlobalDataMap();
		String orderID = mapFromAlphaProject.get("FK_ORDER_ID");
		dispatchOrderID(orderID);
			
	}

	public void dispatchOrderID(String orderID) {
		System.out.println("### Order ID has been DISPATCHED: " + orderID);
	}

}
