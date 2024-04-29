package news;

import java.util.Objects;

public class User implements Observer {
	
	private String email;

	public User(String email) {
		this.email = email;
	}

	public void sendMail(String mail) {
		System.out.println(mail);
	}

	@Override
	public void update(String s) {
		this.sendMail("News are here!");
		System.out.println(this.toString() + " updated");
		System.out.println();
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "User [email=" + email + "]";
	}
	
}
