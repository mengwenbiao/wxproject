package com.wechat.test;

import java.io.File;

import org.junit.Test;

import com.wechat.model.configuration.TokenConfig;

public class TestWx {
	@Test
	public void testTicket() {
		//TokenConfig.getQrCodeTicket(userOpenid);
		
	}
	
	
	@Test
	public void testImage() {
		File file1=new File("G:\\a\\haibao.jpg");
		File file2=new File("G:\\a\\ss.jpg");
		//ImgUtils.getIamgePressText(file1, file2,"你好", -230,-520);
		
		
	}
	
	
	@Test
	public void testUpload() {
		//E:\eclipse\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\wtpwebapps\wechatdemo\img\Templateimg
		System.out.println(TokenConfig.getAccessToken());
		//String file="http://thirdwx.qlogo.cn/mmopen/VaxZ4UVDKX51iahhbnpfjJOIiaJQPBWlkpy1zS8FjugfIQpeViawgdibp4NBw4sD72y5AnrW4wlsLVgic5icWXjWNHV46qPVj7q0jT/132";
		String file="E:\\eclipse\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\wechatdemo\\img\\Templateimg\\targethaibao.jpg";
		String info=TokenConfig.upload(file,"image");
		System.out.println(info);
		
	}
	
	
	@Test
	public void getUserInfo() {
		String user="o8ft36JLsgbT1lX0L1QqdHZphCBY";
		String  info=TokenConfig.getUserInfo(user);
		System.out.println(info);
		
	}
	
	
	@Test
	public void getQrCodeTickets() {
		//示例
		String  info=TokenConfig.getQrCodeTicket("1111");
		System.out.println(info);
		
	}
	

}
