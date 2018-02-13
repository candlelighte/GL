package strategy;

public class PaypalStrategy implements PaymentStrategy {
	
	 @SuppressWarnings("unused")
	 private String emailId;
	 @SuppressWarnings("unused")
	 private String password;

//	 public PaypalStrategy(String email, String pwd){
//	 this.emailId=email;
//	 this.password=pwd;
//	 }

	 public PaypalStrategy(String email, String pwd) {
		// TODO Auto-generated constructor stub
		 this.emailId=email;
		 this.password=pwd;
	}

	@Override
	 public void pay(int amount) {
	 System.out.println(amount + " paid using Paypal.");
	 }
	}
