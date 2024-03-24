package zq.project.kitchen.account;

import org.apache.ibatis.type.Alias;
import zq.project.kitchen.common.BaseEntity;

import java.util.Date;

@Alias("account")
public class Account extends BaseEntity {

	private String account;   // 邮箱或手机号

	private AccountBindingType bindingType;

	private AccountStatus status;

	private String telephone;

	private String email;

	private Date createTime;

	private Date updateTime;

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
