package com.fullstack.db;

import java.util.Optional;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fullstack.db.entity.Memo;
import com.fullstack.db.repository.MemoRepository;

@SpringBootTest
class JpaexApplicationTests {
   /*
    * 실행시에 객체를 자동 주입 시켜주는 대표적 API 인 AutoWired 입니다. 이 어노테이션을 사용하면 프레임워크가 자동으로 해당
    * 인스턴스를 생성해서 주입(Injection) 해줍니다. 이런건 IOC 합니다. (제어역전컨트롤러)
    */

   @Autowired
   MemoRepository memorepository;

//   @Test
//   void contextLoads() {
//      IntStream.rangeClosed(1, 100).forEach(i -> {
//         Memo memo = Memo.builder().memoTxt("이건 JPA 엔티티가 넣은 데이터 " + i).build();
//         memorepository.save(memo);
//
//      }); // 하나의 인스턴스생성을 memo 한테 줌
//
//   }
   
   @Test
   void testSelect() {
	   Long mno = 100L;
	   
	   Optional<Memo> result = memorepository.findById(mno);
	   System.out.println("=================================");
	   
	   if(result.isPresent()) {
		   Memo memo = result.get();
		   System.out.println(memo);
	   }
   }
   
}
