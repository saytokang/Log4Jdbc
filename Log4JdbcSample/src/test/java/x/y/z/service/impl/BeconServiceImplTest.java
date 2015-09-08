package x.y.z.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import x.y.z.service.BeconService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:/spring/context-*.xml"})
public class BeconServiceImplTest {


	@Resource(name="beconService")
	BeconService beconService;
	
	@Test
	public void getList() {
		Map<String, String> params = new HashMap<String, String>();
		List<Map<String, Object>> list = beconService.getList(params);
		System.out.println(list);
		Assert.assertTrue(list.size() > 0);
	}
}
