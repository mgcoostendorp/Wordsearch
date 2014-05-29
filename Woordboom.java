package util;

import java.io.IOException;

public class Woordboom extends Woordveld{

	public static char[][] hulp;
	public static WNode root;
	public static int size;	

	public Woordboom(){
		root = new WNode(res[0][0],0,0,null,null,null,null,null,null,null,null);
		size = 0;
		root();
	}


	public  void root(){

		//root = new WNode(res[0][0],0,0,null,null,null,null,null,null,null,null);
		//System.out.println(root.LWnode());
		VulBoom(root,1,0);
		VulBoom(root,1,1);
		VulBoom(root,0,1);
	}
	public static void VulBoom(WNode nieuw, int x, int y){

		if(x==1 && y==0)
			VulPosition4(nieuw,x,y);
		if(x==1 && y==1)
			VulPosition5(nieuw,x,y);
		if(x==0 && y==1)
			VulPosition6(nieuw,x,y);
	}
	public static void VulPosition1(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition1(hulp);
			VulPosition1(hulp,x-1,y-1);
		}
	}
	public static void VulPosition2(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition2(hulp);
			VulPosition2(hulp,x,y-1);
		}
	}
	public static void VulPosition3(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition3(hulp);
			VulPosition3(hulp,x+1,y-1);
		}
	}


	public static void VulPosition4(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition4(hulp);
			VulPosition1(hulp,x-1,y-1);
			VulPosition2(hulp,x,y-1);
			VulPosition3(hulp,x+1,y-1);
			VulPosition4(hulp,x+1,y);
			VulPosition5(hulp,x+1,y+1);
			VulPosition6(hulp,x,y+1);
			VulPosition7(hulp,x-1,y+1);
			VulPosition8(hulp,x-1,y);
		}
	}
	public static void VulPosition5(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition5(hulp);
			VulPosition1(hulp,x-1,y-1);
			VulPosition2(hulp,x,y-1);
			VulPosition3(hulp,x+1,y-1);
			VulPosition4(hulp,x+1,y);
			VulPosition5(hulp,x+1,y+1);
			VulPosition6(hulp,x,y+1);
			VulPosition7(hulp,x-1,y+1);
			VulPosition8(hulp,x-1,y);

		}
	}
	public static void VulPosition6(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition6(hulp);
			VulPosition1(hulp,x-1,y-1);
			VulPosition2(hulp,x,y-1);
			VulPosition3(hulp,x+1,y-1);
			VulPosition4(hulp,x+1,y);
			VulPosition5(hulp,x+1,y+1);
			VulPosition6(hulp,x,y+1);
			VulPosition7(hulp,x-1,y+1);
			VulPosition8(hulp,x-1,y);

		}
	}
	public static void VulPosition7(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition6(hulp);
			//VulPosition1(hulp,x-1,y-1);
			//VulPosition2(hulp,x,y-1);
			VulPosition7(hulp,x-1,y+1);
		}
	}
	public static void VulPosition8(WNode ress, int x, int y){
		if(x<0 || y<0 || x==res[0].length || y==res.length){

		}	
		else{

			WNode hulp = new WNode(res[y][x],x,y,null,null,null,null,null,null,null,null);
			ress.SetPosition8(hulp);
			
			VulPosition8(hulp,x-1,y);
		}
	}


	public String toString()
	{

		return toString(root, 0);
	}

	public String toString(WNode t, int indents)
	{
		String tab = "   ";
		String tabs = "";
		for(int i = 0; i < indents; i++)
			tabs = tabs + tab;


		String res = "";
		res = tabs + "<BinTree(" + t.LWnode();
		if (t.has1())
			res = res + "\n" + toString(t.p1(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		if (t.has2())
			res = res + "\n" + toString(t.p2(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		if (t.has3())
			res = res + "\n" + toString(t.p3(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		if (t.has4())
			res = res + "\n" + toString(t.p4(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		if (t.has5())
			res = res + "\n" + toString(t.p5(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		if (t.has6())
			res = res + "\n" + toString(t.p6(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		if (t.has7())
			res = res + "\n" + toString(t.p7(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		if (t.has8())
			res = res + "\n" + toString(t.p8(), indents + 1);
		else
			res = res + "\n" + tabs + tab + "()";
		res = res + "\n" + tabs + ")>";
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		Woordmaat();
		Woordboom s = new Woordboom();
		System.out.println(s.toString());
	}

}
