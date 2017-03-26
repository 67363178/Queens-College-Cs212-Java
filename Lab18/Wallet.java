import java.text.DecimalFormat;

public class Wallet {
  private MoneyList walletContents = new MoneyList();
  
  public Wallet(){
	  
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
  }
  public void print () {
	  System.out.println(walletContents);
  }
  public String getValue() {
	  DecimalFormat df = new DecimalFormat("#.##"); // 1.12, 2.12, 2.21
	  return df.format(walletContents.getValue());
	  
  }
}