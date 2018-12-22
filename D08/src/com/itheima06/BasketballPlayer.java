package com.itheima06;

public class BasketballPlayer extends Player {
	

	public BasketballPlayer() {
		super();
		
	}

	public BasketballPlayer(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void eat() {
		System.out.println("³ÔÀºÇòÔË¶¯Ô±Ì×²Í");
	}

	@Override
	public void study() {
		System.out.println("Á·Ï°Í¶Àº");
	}
	
	

}
