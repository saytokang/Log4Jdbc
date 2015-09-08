package x.y.z.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("beconMapper")
public class BeconMapper {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int getCount() {
		
		return sqlSession.selectOne("becon.getCount");
	}

	public List<Map<String, Object>> getList(Map<String, String> params) {
		
		return sqlSession.selectList("becon.getList", params);
	}

}
