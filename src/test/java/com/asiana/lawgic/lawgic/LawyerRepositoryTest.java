package com.asiana.lawgic.lawgic;

import com.asiana.lawgic.lawgic.entity.Category;
import com.asiana.lawgic.lawgic.entity.Lawyer;
import com.asiana.lawgic.lawgic.repository.LawyerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;
import java.util.stream.IntStream;

@SpringBootTest
public class LawyerRepositoryTest {
    private String[] address = {"경기도 시흥시", "경기도 화성시", "서울시 화곡동", " 서울시 염창동", "서울시 관악구"};
    private String[] birthday = {"1995/03/16", "1996/04/25", "1997/12/24", "1993/06/23", "1997/02/12"};
    private String[] carType = {"Sonata", "Genesis", "Lamborghini", "SM6", "Lincoln"};
    private String[] email = {"kang@naver.com", "danny@nate.com", "terry@yahoo.com", "jack@gmail.com", "megan@naver.com"};
    private String[] name = {"강형성", "김윤성", "유아인", "김동성", "송인아"};
    private String[] password = {"DFGsdf", "wefR34!", "234dfD", "ghtr%^", "SDDS34e"};
    private String[] phone = {"01033426442", "01055236442", "01042365723", "01054625245", "01094358343"};
    private Category[] categories={Category.CAR_ONLY,Category.CAR_TO_CAR,Category.RAILROAD_CROSSING,Category.CAR_TO_CAR,Category.CAT_TO_PERSON};
    @Autowired
    private LawyerRepository lawyerRepository;
    @Test
    public void insertLawyerData(){
        IntStream.rangeClosed(1,5).forEach(i->{
            Lawyer lawyer=Lawyer.builder()
                    .lawyerId("lawyer_id_"+i)
                    .password(password[i-1])
                    .name(name[i-1])
                    .address(address[i-1])
                    .email(email[i-1])
                    .phone(phone[i-1])
                    .categoryId(categories[i-1])
                    .valid(Math.round(Math.random())==1L?true:false)
                    .gender(Math.round(Math.random())==1L?true:false)
                    .build();
            lawyerRepository.save(lawyer);
        });
    }
}
