package com.fid.modules;

import com.fid.framework.BaseClass; // This is from Framework module

public class LoginModule {
	
	public static void loginCalled(){		
		BaseClass.baseCaller();
	}
	
	
	public static void logoutCalled(){
		System.out.println("Module: Modules are called");
	}

}
