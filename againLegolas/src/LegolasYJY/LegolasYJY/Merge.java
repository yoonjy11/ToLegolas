//	comp[i] = new 머시기 애들의 값이 null 이라고 에러가 떠 그 이상 진도를 못나갔습니다. ㅜ. ㅠ 
//	검사 방법으로 디버깅이랑 길이 체크를 해보았으나 디버깅은 실력이 없어 시도만 해보았고 길이 체크는 
//	에러가 뜨는것을 확인했습니당. 
//
//	무엇을 잘못한 것일까여...

package LegolasYJY;

import java.util.Scanner;

public class Merge
{
	Scanner sc = new Scanner(System.in);
	Company[] comp = new Company[16];
	
	public  void  MergeFunction() 
	{    // 왜 null 이라고 에러가 뜰까 ? 
//		comp[0] = new Company("마이크로소프트", 3000);
//		comp[1] = new Company("어도비", 2000);
//		comp[2] = new Company("세이즈포스", 300);
//		comp[3] = new Company("엔비디아 ", 750);
//		comp[4] = new Company("삼성  ", 405);
//		comp[5] = new Company("네이버", 30);
//		comp[6] = new Company("쿠팡", 25);
//		comp[7] = new Company("카카오 ", 25);
//		comp[8] = new Company("라인", 9);
//		comp[9] = new Company("배달의 민족", 4);
//		comp[10] = new Company("민우요", 1);
//		comp[11] = new Company("깃허브", 8 );//"마이크로소프트에 인수되었습니다."
//		comp[12] = new Company("피그마", 27);//, "어도비인수되었습니다"
//		comp[13] = new Company("슬랙", 30); //, "세일즈포스 인수되었습니다"
//		comp[14] = new Company("ARM", 50); //, "엔비디아에 인수되었습니다."
//		comp[15] = new Company("블리자드", 81); //, "마이크로소프트에 인수되었습니다"
	}
	
	public String intro()
	{
		System.out.println(comp[0].getName());
		
		System.out.println("인수합병게임");
		System.out.print("당신의 이름 : ");
		String myName = sc.nextLine(); 
		
		System.out.println("당신이 다니는 회사 : ");
//회사 이름들 출력
//		for(int i =0; i<comp.length; i++) 
//		{
//			System.out.println((comp[i].getName()));
//		}
		System.out.println("마이크로소프트, 어도비, 세이즈포스, 엔비디아, 삼성, 네이버, 쿠팡, 카카오, 라인, 배달의 민족, 민우요");
		String myCompany = sc.nextLine(); 
		System.out.println("1.사원   2.팀장   3.사장");
		System.out.println("당신의 직급 : ");
		int myRank = sc.nextInt();
		System.out.println();
		if( myRank == 1) { System.out.println("안녕하세요 신입사원" + myName + " 님 당신은 " 
		+ myCompany + "사의 자식입니다. 위장취업은 어제로 끝났고. 오늘부로 사장으로 발령받았습니다. 축하합니다 사장님 ");}
		else if(myRank == 2) {System.out.println("안녕하세요 " + myName + 
				" 팀장님 당신의 상급자 모두가 해외로 도피했습니다.당신은 당분간 임시사장직을 맡게 되었습니다. 축하합니다 사장님" );}
		else if(myRank == 3) {System.out.println("안녕하세요 " + myName + "사장님");}
		return myName;
	}
	
	public String compBuy() 
	{
		System.out.println("자, 사장님! 어떤 회사를 인수합병할 계획이세요?");
// 회사 이름들 출력 
//		for(int i =0; i<comp.length; i++) 
//		{
//			System.out.print(comp[i].getName() + " ");
//		}
		System.out.println("마이크로소프트, 어도비, 세이즈포스, 엔비디아, 삼성, "
				+ "네이버, 쿠팡, 카카오, 라인, 배달의 민족, 민우요, 깃허브, 피그마, 슬랙, ARM, 블리자드");
		String compbuy = sc.nextLine();

		return 	compbuy;	
	}
	
	public void soldout(String buy) 
	{
		if(buy == "깃허브"){ System.out.println("이미 '마이크로소프트'사가 8조원에 인수했습니다.");}  
		else if(buy == "피그마") {System.out.println("이미 '어도비'사가 27조원에 인수했습니다.");}  
		else if(buy == "슬랙") {System.out.println("이미 '세일즈포스'사가 30조원에 인수했습니다.");}  
		else if(buy == "ARM") {System.out.println("이미 '엔비디아'사가 50조원에 인수했습니다.");}  
		else if(buy == "블리자드") {System.out.println("이미 '마이크로소프트'사가 81조원에 인수했습니다.");}
	}

	
	
}	

