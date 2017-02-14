package com.test.cases;

import com.fid.modules.LoginModule;

public class Testing {
	
	public static void test(){
		LoginModule.loginCalled();
		LoginModule.logoutCalled();;
	}
	
	public static void main(String[] args) {
		test();
	}

}
