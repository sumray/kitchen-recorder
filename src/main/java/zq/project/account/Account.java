package zq.project.account;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("Account")
public class Account {

	private Long id;

	private String account;   // 邮箱或手机号

	private AccountBindingType bindingType;

	private AccountStatus status;

	private String telephone;

	private String email;

	private Date createTime;

	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
