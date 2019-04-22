package com.kosinza.eurekaclient;
import com.kosinza.common.dao.OrderDetailDao;
import com.kosinza.common.entity.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = { "com.kosinza.common.dao" })
public class EurekaClientApplicationTests {
	//降低spring的敏感检测
	@Autowired(required = false)
	private OrderDetailDao orderDetailDao;
	@Test
	public void contextLoads() {
		OrderDetail orderDetail = orderDetailDao.selectById(1);
		System.out.println(orderDetail.getProductName());
		System.out.println("aaaaaaaaaa");
	}

}
