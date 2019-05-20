package com.ghgj.lesson2.work;

public class Enply {
	
	public void music(Music music) {
		if(music instanceof Taodi) {
			Taodi taodi =(Taodi)music;
			taodi.play();
		}else {
			Xiao xiao =(Xiao)music;
			xiao.play();
		}
	}
	public static void main(String[] args) {
		Taodi mc = new Taodi("Ã’µ—1");
		Xiao xi = new Xiao("œÙ");
		Enply my = new Enply();
		my.music(mc);
		my.music(xi);
	}
}


