package kr.co.blli.model.posting;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PostingDAO {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	public void test(String test) {
		sqlSessionTemplate.insert("posting.test",test);
	}
	public String test2() {
		return sqlSessionTemplate.selectOne("posting.test2");
	}
	
}