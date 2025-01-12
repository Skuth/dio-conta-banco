public class Account {
  private int number;
  private String agency;
  private String clientName;
  private double balance;

  public Account (
    int number,
    String agency,
    String clientNmae,
    double balance
  ) {
    this.number = number;
    this.agency = agency;
    this.clientName = clientNmae;
    this.balance = balance;
  }

  public void setNumber (
    int number
  ) {
    this.number = number;
  }

  public int getNumber () {
    return this.number;
  }

  public void setAgency (
    String agency
  ) {
    this.agency = agency;
  }

  public String getAgency () {
    return this.agency;
  }

  public void setClientName (
    String clientName
  ) {
    this.clientName = clientName;
  }

  public String getClientName () {
    return this.clientName;
  }

  public void setBalance (
    double balance
  ) {
    this.balance = balance;
  }

  public double getBalance () {
    return this.balance;
  }

  @Override
  public String toString() {
    return "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
      .replace("[Nome Cliente]", this.clientName)
      .replace("[Agencia]", this.agency)
      .replace("[Numero]", String.valueOf(this.number))
      .replace("[Saldo]", String.valueOf(this.balance));
  }
}
