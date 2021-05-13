package generics.set_Interface.exercicioLog;

/* Aquivo salvo nos meus documentos chamdo in.txt com os seguintes log de usuarios
 * amanda 2018-08-26T20:45:08Z
 * alex86 2018-08-26T21:49:37Z
 * bobbrown 2018-08-27T03:19:13Z
 * amanda 2018-08-27T08:11:00Z
 * jeniffer3 2018-08-27T09:19:24Z
 * alex86 2018-08-27T22:39:52Z
 * amanda 2018-08-28T07:42:19Z
 */

import java.util.Date;

public class LogEntry {

	private String username;
	private Date moment;

	public LogEntry(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}