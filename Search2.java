package util;

import java.io.IOException;
import java.util.Scanner;

public class Search2 extends Woordboom{

	public static String solution;

	
	public static void Inputword() throws IOException{
		Woordmaat();
		Woordboom s = new Woordboom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welk woord zoekt u");
		String string = sc.next();
		//sc.close();
		Boomsearch(string);
		System.out.println(solution);
	}

	public static void Boomsearch(String L){
		WNode hulp = root;
		String sol ="";
		String coord = "";
		Zoekp4(hulp,L,0,sol,coord);
		Zoekp6(hulp,L,0,sol,coord);
		Zoekp5(hulp,L,0,sol,coord);
	}

	public static void Zoekp1(WNode R, String L, int x,String sol, String coord){
		if( (x== L.length() && Check(L,sol)) || (Check(L,sol) == false && (R.Rxcoord()-1<0 || R.Rycoord()-1<0))){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
			if(R.LWnode() == L.charAt(x)){
				sol += String.valueOf(R.LWnode());

				coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
				if(R.has1())
					Zoekp1(R.p1(),L,x+1,sol,coord);

			}
			else{

				sol = "";
				coord = "";
				if(R.has1())
					Zoekp1(R.p1(),L,0,sol,coord);

			}
		}

	}
	public static void Zoekp2(WNode R, String L, int x,String sol, String coord){

		if( (x == L.length() && Check(L,sol)== true ) || (Check(L,sol) == false && (R.Rxcoord()<0 || R.Rycoord()<0))){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
			if(R.has2()){
				if(R.p2().LWnode() == L.charAt(x)){
					coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
					sol += String.valueOf(R.LWnode());
					Zoekp2(R,L,x+1,sol,coord);
				}
			}
			else{

				sol = "";
				coord = "";
				
				if(R.has2())
					Zoekp2(R.p2(),L,0,sol,coord);


			}
		}

	}
	public static void Zoekp3(WNode R, String L, int x,String sol, String coord){

		if( (x == L.length() && Check(L,sol)== true ) || (Check(L,sol) == false && (R.Rxcoord()-1 == res[0].length  || R.Rycoord()-1 == res.length))){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
			if(R.LWnode() == L.charAt(x)){
				coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
				sol += String.valueOf(R.LWnode());

				if(R.has3())
					Zoekp3(R.p3(),L,x+1,sol,coord);
			}
			else{

				sol = "";
				coord = "";
				
				if(R.has3())
					Zoekp3(R.p3(),L,0,sol,coord);


			}
		}

	}
	public static void Zoekp4(WNode R, String L, int x,String sol, String coord){
		if( (x== L.length() && Check(L,sol)) || ( !Check(L,sol) && res[0].length == R.Rxcoord()-1)){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
			if(R.LWnode() == L.charAt(x)){
				sol += String.valueOf(R.LWnode());
				coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
				if(R.has1())
					Zoekp1(R.p1(),L,x+1,sol,coord);

				if(R.has2())
					Zoekp2(R.p2(),L,x+1,sol,coord);

				if(R.has3())
					Zoekp3(R.p3(),L,x+1,sol,coord);

				if(R.has4())
					Zoekp4(R.p4(),L,x+1,sol,coord);

				if(R.has5())
					Zoekp5(R.p5(),L,x+1,sol,coord);

				if(R.has6())
					Zoekp6(R.p6(),L,x+1,sol,coord);

				if(R.has7())
					Zoekp7(R.p7(),L,x+1,sol,coord);

				if(R.has8()){
					coord = "";
					sol = "";
					Zoekp8(R,L,0,sol,coord);
					
				}

			}
			else{

				sol = "";
				coord = "";
				if(R.has1())
					Zoekp1(R.p1(),L,0,sol,coord);

				if(R.has2())
					Zoekp2(R.p2(),L,0,sol,coord);

				if(R.has3())
					Zoekp3(R.p3(),L,0,sol,coord);

				if(R.has4())
					Zoekp4(R.p4(),L,0,sol,coord);

				if(R.has5())
					Zoekp5(R.p5(),L,0,sol,coord);

				if(R.has6())
					Zoekp6(R.p6(),L,0,sol,coord);

				if(R.has7())
					Zoekp7(R.p7(),L,0,sol,coord);

				if(R.has8())
					
					Zoekp8(R.p8(),L,0,sol,coord);

			}

		}
	}




	public static void Zoekp5(WNode R, String L, int x,String sol, String coord){
		if( (x== L.length() && Check(L,sol)) || ( !Check(L,sol) && (res[0].length == R.Rxcoord()-1 || res.length == R.Rycoord()-1))){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
			if(R.LWnode() == L.charAt(x)){
				sol += String.valueOf(R.LWnode());
				coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
				if(R.has1())
					Zoekp1(R.p1(),L,x+1,sol,coord);

				if(R.has2())
					Zoekp2(R.p2(),L,x+1,sol,coord);

				if(R.has3())
					Zoekp3(R.p3(),L,x+1,sol,coord);

				if(R.has4())
					Zoekp4(R.p4(),L,x+1,sol,coord);

				if(R.has5())
					Zoekp5(R.p5(),L,x+1,sol,coord);

				if(R.has6())
					Zoekp6(R.p6(),L,x+1,sol,coord);

				if(R.has7())
					Zoekp7(R.p7(),L,x+1,sol,coord);

				if(R.has8())
					Zoekp8(R.p8(),L,x+1,sol,coord);
			}
			else{

				sol = "";
				coord = "";
				if(R.has1())
					Zoekp1(R.p1(),L,0,sol,coord);

				if(R.has2())
					Zoekp2(R.p2(),L,0,sol,coord);

				if(R.has3())
					Zoekp3(R.p3(),L,0,sol,coord);

				if(R.has4())
					Zoekp4(R.p4(),L,0,sol,coord);

				if(R.has5())
					Zoekp5(R.p5(),L,0,sol,coord);

				if(R.has6())
					Zoekp6(R.p6(),L,0,sol,coord);

				if(R.has7())
					Zoekp7(R.p7(),L,0,sol,coord);

				if(R.has8())
					Zoekp8(R.p8(),L,0,sol,coord);

			}
		}

	}
	public static void Zoekp6(WNode R, String L, int x,String sol, String coord){
		if( (x== L.length() && Check(L,sol)) || ( !Check(L,sol) && res.length == R.Rycoord()-1)){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
			if(R.LWnode() == L.charAt(x)){
				coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
				sol += String.valueOf(R.LWnode());
				if(R.has1())
					Zoekp1(R.p1(),L,x+1,sol,coord);

				if(R.has2())
					Zoekp2(R.p2(),L,x+1,sol,coord);

				if(R.has3())
					Zoekp3(R.p3(),L,x+1,sol,coord);

				if(R.has4())
					Zoekp4(R.p4(),L,x+1,sol,coord);

				if(R.has5())
					Zoekp5(R.p5(),L,x+1,sol,coord);

				if(R.has6())
					Zoekp6(R.p6(),L,x+1,sol,coord);

				if(R.has7())
					Zoekp7(R.p7(),L,x+1,sol,coord);

				if(R.has8())
					Zoekp8(R.p8(),L,x+1,sol,coord);


			}
			else{

				sol = "";
				coord = "";
				if(R.has1())
					Zoekp1(R.p1(),L,0,sol,coord);

				if(R.has2())
					Zoekp2(R.p2(),L,0,sol,coord);

				if(R.has3())
					Zoekp3(R.p3(),L,0,sol,coord);

				if(R.has4())
					Zoekp4(R.p4(),L,0,sol,coord);

				if(R.has5())
					Zoekp5(R.p5(),L,0,sol,coord);

				if(R.has6())
					Zoekp6(R.p6(),L,0,sol,coord);

				if(R.has7())
					Zoekp7(R.p7(),L,0,sol,coord);

				if(R.has8())
					Zoekp8(R.p8(),L,0,sol,coord);

			}
		}

	}
	public static void Zoekp7(WNode R, String L, int x,String sol, String coord){

		if( (x == L.length() && Check(L,sol)== true ) || (Check(L,sol) == false && (R.Rxcoord()-1<0 || R.Rycoord()-1<0))){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
			if(R.LWnode() == L.charAt(x)){
				coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
				sol += String.valueOf(R.LWnode());
				if(R.has7())

					Zoekp7(R.p7(),L,x+1,sol,coord);
			}
			else{

				sol = "";
				coord = "";
				
				if(R.has7())
					Zoekp7(R.p7(),L,0,sol,coord);

				

			}
		}

	}
	public static void Zoekp8(WNode R, String L, int x,String sol, String coord){

		if( (x == L.length() && Check(L,sol)== true ) || (Check(L,sol) == false && (R.Rxcoord()-1<0 || R.Rycoord()-1<0))){
			solution = coord;
			if(sol.length()==0){
				System.out.println("Word Not Found");
			}
		}
		else{
		//	System.out.println(coord);
			if(R.LWnode() == L.charAt(x)){
				coord += "(" + R.Rxcoord() + "," + R.Rycoord() + ")";
				sol += String.valueOf( R.LWnode());
				if(R.has8()){
					Zoekp8(R.p8(),L,x+1,sol,coord);
					
			}
			else{

				sol = "";
				coord = "";
				
				if(R.has8())
					Zoekp8(R.p8(),L,0,sol,coord);

			}
		}
		}
	}

	public static boolean Check(String L,String rex){
		boolean res = false;
		if(L.length() == rex.length()){
			for(int i=0; i<rex.length(); i++)
				if(L.charAt(i)==rex.charAt(i) )
					res = true;
		}
		else
			res = false;
		return res;
	}

	public static void main(String[] args) throws IOException {
		Inputword();
		//WNode res = root.p4();
		//	WNode ress = res.p8();
		//System.out.println(ress.toString());
		//System.out.println(root.p5());
		//String q = "ioa";
		//System.out.println(q);
		//Boomsearch(q);
		//	System.out.println(sol + sol + 8
		;

	}
}
