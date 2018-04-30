package test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.mapper.BoBarcoderuleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext-dao.xml"})
public class Test1{
	@Autowired
	private BoBarcoderuleMapper boBarcoderuleMapper;
	@Test
	public void testInsert(){
	System.out.println(boBarcoderuleMapper.selectByPrimaryKey("8db2e356d3af4e3e8f153680a4cd8425"));
	}
}