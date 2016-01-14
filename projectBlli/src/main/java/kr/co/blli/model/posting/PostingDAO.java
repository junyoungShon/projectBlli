package kr.co.blli.model.posting;

<<<<<<< HEAD
import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
=======
>>>>>>> branch 'master' of https://github.com/junyoungShon/projectBlli.git

<<<<<<< HEAD
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
=======
public interface PostingDAO {

}
>>>>>>> branch 'master' of https://github.com/junyoungShon/projectBlli.git
