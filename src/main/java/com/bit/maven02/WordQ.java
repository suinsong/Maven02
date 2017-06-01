package com.bit.maven02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bit.maven02.dao.WordDAO;

public class WordQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordDAO dao = new WordDAO();
		
		
		
		WordDTO dto= dao.getWord(); //단어 1개 추출
		String word = dto.getWord(); //단어만 추출
		String[] words = word.split("");//글자 단위로 분리
		
		List<String> arrWord = new ArrayList<String>();
		
		// 배열을 (Array)List에 복사
		arrWord = Arrays.asList(words);
		
		// for(String s : words){   이렇게도 해줄 수 있음
//			arrWord.add(s);
//		}
		
		
		Collections.shuffle(arrWord);//글자 섞기
		
		System.out.println(" 다음의 알파벳으로 단아로 완성하시오 ");
		System.out.println(arrWord);
		System.out.println("--------------------------");
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println(" >> ");
		String keyin = scanner.nextLine();
		
		if(keyin.equalsIgnoreCase(word)){
			System.out.println(" 맞음 ");
			
		}else {
			System.out.println(" 정답은 " + word +" 입니다");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
