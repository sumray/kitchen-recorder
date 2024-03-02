package zq.project.account;

public class RegisterRequest {

	private String account;

	private AccountBindingType bindingType;

	private String telephone;

	private String email;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public AccountBindingType getBindingType() {
		return bindingType;
	}

	public void setBindingType(AccountBindingType bindingType) {
		this.bindingType = bindingType;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
