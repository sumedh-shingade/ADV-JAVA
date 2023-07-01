package com.demo.beans;

public class Teams {
	private int tid;
	private String tname;
	
	private Player player;

	public Teams() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teams(int tid, String tname, Player player) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.player = player;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Teams [tid=" + tid + ", tname=" + tname + ", player=" + player + "]";
	}
	
	

}
