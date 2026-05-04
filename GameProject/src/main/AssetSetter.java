package main;

import object.*;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	public void setObject() {
		
		gp.obj[0] = new OBJ_Spray();
		gp.obj[0].worldX = 9 * gp.tileSize;
		gp.obj[0].worldY = 23 * gp.tileSize;
		
		gp.obj[1] = new OBJ_ArmchairR();
		gp.obj[1].worldX = 31 * gp.tileSize;
		gp.obj[1].worldY = 27 * gp.tileSize;
		
		gp.obj[2] = new OBJ_ArmchairR();
		gp.obj[2].worldX = 31 * gp.tileSize;
		gp.obj[2].worldY = 28 * gp.tileSize;
		
		gp.obj[3] = new OBJ_ArmchairR();
		gp.obj[3].worldX = 31 * gp.tileSize;
		gp.obj[3].worldY = 29 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Shelf();
		gp.obj[4].worldX = 1 * gp.tileSize;
		gp.obj[4].worldY = 13 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Shelf();
		gp.obj[5].worldX = 2 * gp.tileSize;
		gp.obj[5].worldY = 13 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Shelf();
		gp.obj[6].worldX = 1 * gp.tileSize;
		gp.obj[6].worldY = 12 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Shelf();
		gp.obj[7].worldX = 2 * gp.tileSize;
		gp.obj[7].worldY = 12 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Tree1();
		gp.obj[8].worldX = 0 * gp.tileSize;
		gp.obj[8].worldY = 13 * gp.tileSize;
		
	}
}
