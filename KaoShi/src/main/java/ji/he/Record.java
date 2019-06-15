package ji.he;

import java.text.Collator;
import java.util.Locale;

public class Record implements Comparable<Record>{
	private int id;
	private String name;
    private String phone;
    
	@Override
	public String toString() {
		return "Record [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

	public Record(String name, String phone) {
		super();

		this.name = name;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int compareTo(Record o) {
		// TODO Auto-generated method stub
		return Collator.getInstance(Locale.CHINESE).compare(this.name, o.getName());
	}

	

}
