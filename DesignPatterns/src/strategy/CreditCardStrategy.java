package strategy;

public class CreditCardStrategy implements PaymentStrategy {
	 @SuppressWarnings("unused") 
	private String name;
	 
	 @SuppressWarnings("unused")
	 private String cardNumber;
	 
	 @SuppressWarnings("unused")
	 private String cvv;
	 
	 @SuppressWarnings("unused")
	 private String dateOfExpiry;

	 public CreditCardStrategy(String nm, String ccNum, String cvv,
	String expiryDate){
	 this.name=nm;
	 
	 this.cardNumber=ccNum;
	 this.cvv=cvv;
	 this.dateOfExpiry=expiryDate;
	 }
	 @Override
	 public void pay(int amount) {
	 System.out.println(amount +" paid with credit/debit card");
	 }
	}
	
