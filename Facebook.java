class FacebookLogin
{
	void login(String name)
	{
		
		System.out.println("login with name="+name);
	}
	
	void login(int number)
	{
		System.out.println("login with mobile nmber="+number);
	}
	  void login(String mail,int number) {
		  System.out.println("login with mail="+mail+ "and="+number);
		  
	  }
}

 class Facebook {
	 public static void main(String args[]) {
		 
		 FacebookLogin login=new FacebookLogin();
		 login.login("naresh");
		 login.login(960310720);
		 login.login("ragulanesh12345@gmil.com", 960310720);
		 
	 }

	
}
