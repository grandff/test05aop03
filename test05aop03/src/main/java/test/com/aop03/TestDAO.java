package test.com.aop03;

public interface TestDAO {
	public int insert(RequestVO vo);
	public int update(RequestVO vo);
	public int delete(RequestVO vo);	
	public int select(RequestVO vo);	
	public int search(RequestVO vo);	
}
