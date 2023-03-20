package com.javacoding.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import com.javacoding.game.Student;
import com.javacoding.logics.calcLogic;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

class StudentIdAsComparator implements Comparator<List>{
    @Override
    public int compare(List o1, List o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
class Comparator implements Comparator<List>{
    @Override
    public int compare(List o1, List o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
public class Main {

	public static void main(String[] args) throws Exception {
	    List list = new ArrayList<>(); //array f3으로 내용 확인
	    
	    list.add(new List(1, "얄"));
	    list.add(new List(2, "홍"));
        list.add(new List(3, "길동"));
        list.add(new List(3, "길"));
	    
	    
	    
	    list.sort(new StudentIdAsComparator()); //sort의 comparator 확인 list super ,타입을 강제
	    list.sort(new Comparator<List>() {
	        @Override
	        public int compare(List o1, List o2) {
	            return o1.getName().compareTo(o2.getName());
	        }
	    });
	    
	    Asset asset = new Asset("aaa",100); 
	 
	    Collections.sort(list);
        System.out.println(list);
        
	    Object object = (int)list.get(0);
	    
	    System.out.println((int)list.get(0) + 10);
	    //잘못된 코드 ( 강제로 캐스팅 )
	    //object는 무엇을 해도 오류가 안남, 실행 시 종료가 됨 ( 많은 오류 발생 )
	    //수정한 코드
	    if(object instanceof Integer) {
	        System.out.println((int)list.get(0) + 10);
	    }
	    
	}

}
