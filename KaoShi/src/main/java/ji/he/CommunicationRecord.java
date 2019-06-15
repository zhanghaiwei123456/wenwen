package ji.he;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommunicationRecord{
	private int size = 0;
	private List<Record> list = new ArrayList<Record>();
	
	
	public CommunicationRecord() {
		
		// TODO Auto-generated constructor stub
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<Record> getList() {
		return list;
	}
	public void setList(List<Record> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "CommunicationRecord [size=" + size + ", list=" + list + "]";
	}
	public void add(Record r) {
		if(r!=null) {
			list.add(r);
			Collections.sort(list);
		}
		
	}

}
