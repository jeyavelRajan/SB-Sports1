package com.rts;



import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.rts.evaluation.model.Sports;
import com.rts.evaluation.reopsitory.SportsDAO;

@SpringBootTest
class SbSports1ApplicationTests {

@Autowired
public static SportsDAO dao;
Sports bean = new Sports(134,"jeyavel","@123",23,234567891,"sjrajan11955@gmail.com");
@org.junit.Test
void contextLoads() {
	
}
@org.junit.Test
public void testperformInsert() {
	dao=new SportsDAO();
	boolean value = dao.insert(bean);
	assertEquals(value, true);
}


}
