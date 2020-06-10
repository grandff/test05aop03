package test.com.aop03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOimpl implements TestDAO {

	private static final Logger logger = LoggerFactory.getLogger(TestDAOimpl.class);

	@Override
	public int insert(RequestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RequestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(RequestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int select(RequestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int search(RequestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
