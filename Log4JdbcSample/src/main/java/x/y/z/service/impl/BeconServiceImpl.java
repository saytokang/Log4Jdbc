package x.y.z.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import x.y.z.service.BeconService;

@Service("beconService")
public class BeconServiceImpl implements BeconService{

	@Resource(name="beconMapper")
	BeconMapper beconMapper;
	
	@Override
	public List<Map<String, Object>> getList(Map<String, String> params) {

		return beconMapper.getList(params);
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
