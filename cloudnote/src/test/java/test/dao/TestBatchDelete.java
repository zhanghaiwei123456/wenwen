package test.dao;

import org.junit.Test;

import com.tedu.cloudnote.dao.NoteDao;


public class TestBatchDelete extends BaseTest{
	@Test
	public void test(){
		NoteDao noteDao = ac.getBean("noteDao",NoteDao.class);
		String[] ids = {
			"9187ffd3-4c1e-4768-9f2f-c600e835b823",
			"ebd65da6-3f90-45f9-b045-782928a5e2c0",
			"28d2ee27a61549a7aaed7fe1503cbf52"
		};
		int rows = noteDao.batchDelete(ids);
		System.out.println(
			"删除的记录行数："+rows);
	}
	
}
