# Spring Framework

### Index

1. [프레임워크란](#프레임워크란)
2. [Spring 정의 및 장점](#Spring-정의-및-장점)
3. [DI](#DI)
4. [IoC](#IoC)
5. [스프링 컨테이너](#스프링-컨테이너)
6. [Bean 정의](#Bean-정의)
    1. [생명주기](#빈-생명주기에-대해-설명해주세요)
    2. 스코프
7. [싱글톤 vs 스프링 싱글톤](#싱글톤-vs-스프링-싱글톤)

<br/>

## 프레임워크란

### 프레임워크란 무엇인가요?

프레임워크는 소프트웨어를 구축할 때 사용할 수 있는 구조이다.

집을 지을 때 처음부터 직접 만든다면 시간이 오래 걸린다. 하지만 이미 틀이 완성되어 있다면? 많은 시간과 수고를 절약할 수 있다.

이처럼 소프트웨어에서 프레임워크란 어떤 어플리케이션을 개발하기 위해 필요한 기본적인 클래스와 라이브러리 등을 갖추고 있는 것을 의미한다.

### 프레임워크를 사용하는 이유는 무엇인가요?

프레임워크를 사용하면 시간 절약 및 오류 위험이 줄어든다.

처음부터 모든 것을 작성할 필요가 없으며, 프레임워크는 이미 테스트 되어 있으므로 오류가 발생할 가능성이 적다.

그 외에도 유지보수 용이, 중복 코드 제거 등의 장점이 있다.

### 알고 있는 프레임워크에 대해 간단하게 설명해주실 수 있나요?

대표적인 (백엔드) 프레임워크로는 Spring, Node.js, Django 등이 있다.

> **연관 질문** <br/>
> 스프링 프레임워크란 무엇인가요?

### 프레임워크와 라이브러리는 어떤 차이점이 존재하나요?

> **연관 질문** <br/>
> 라이브러리란 무엇인가요?

라이브러리란 자주 사용되는 로직을 재사용하기 편하도록 잘 정리한 일련의 코드들의 집합이다.

자동차와 비교하면

- 프레임워크는 자동차의 뼈대인 프레임이라고 할 수 있다.
- 라이브러리는 자동차의 기능을 하는 부품이라고 할 수 있다. 예로 바퀴, 라이트, 와이퍼 등이다.

프레임워크는 한번 정해지면 바꿀 수 없지만, 바퀴, 라이트처럼 라이브러리는 비교적 쉽게 변경할 수 있다.

### 참고 링크

- [https://www.codecademy.com/resources/blog/what-is-a-framework/](https://www.codecademy.com/resources/blog/what-is-a-framework/)
- [https://www.freecodecamp.org/news/what-is-a-framework-software-frameworks-definition/](https://www.freecodecamp.org/news/what-is-a-framework-software-frameworks-definition/)
- [https://moolgogiheart.tistory.com/87](https://moolgogiheart.tistory.com/87)
- [https://www.icia.co.kr/community/board/view/2/1/84](https://www.icia.co.kr/community/board/view/2/1/84)
- [https://www.icia.co.kr/community/board/view/2/2/76](https://www.icia.co.kr/community/board/view/2/2/76)?
- [https://steady-coding.tistory.com/457](https://steady-coding.tistory.com/457)

<br/>

## Spring 정의 및 장점

### Spring이란 무엇인가요?

자바 엔터프라이즈 개발을 편하게 해주는 오픈 소스 경량급 애플리케이션 프레임워크이다.

> 엔터프라이즈 개발이란?  
> 대규모 데이터 처리와 트랜잭션이 동시에 여러 사용자로부터 > 행해지는 매우 큰 규모의 환경에서 개발하는 것을 의미한다.
> 오픈 소스란?  
> 소스 코드를 공개해 누구나 특별한 제한 없이 그 코드를 보고 사용할 수 있는 오픈 소스 라이선스를 만족하는 소프트웨어를 의미한다.
> 경량급?  
> 기존의 EJB처럼 툴의 도움 없이는 다루기 힘든 난해한 설정파일 구조와 까다로운 패키징, 불편한 서버 배치 등으로 인한 부담을 없애고, 쉽게 해당 기능들을 사용할 수 있게 되었다.

### Spring이 가진 장점은 무엇이라고 생각하나요? (특징)

Spring이 가진 특징들 덕분에 편하게 서버 개발이 가능하다.

1. **POJO(Plain Old Java Object) 기반의 구성**

   POJO는 특정 기술에 종속되지 않는 순수한 자바 객체를 의미한다.
   스프링은 내부적으로 객체 간의 관계를 구성할 때 별도의 API 등을 사용하지 않는 POJO 만으로 구성이 가능하도록 되어 있다.

   따라서 일반적인 Java 코드를 스프링에서 그대로 사용할 수 있다.

   이것은 특정 라이브러리나 컨테이너에 종속적이지 않다는 것이며, 이로 인해 개발자는 가장 일반적인 형태로 코드를 작성하고 실행할 수 있기 때문에 높은 생산성과 유연한 테스트를 할 수 있게 된다.

2. **DI(Dependency Injection, 의존성 주입)을 통한 객체 간의 관계 구성**

   스프링은 개발자가 부품을 만들어 조립하는 형태의 개발이 가능하다. 이때 조립된 코드의 최종 호출을 개발자가 정하는 것이 아니라 프레임워크 내부에서 결정한 대로 이루어지게 된다.

   이것을 제어의 역행(IoC, Inversion of Control)라고 한다.

   의존성 주입은 제어의 역행이 일어나는 것을 전재로, 특정 개체에 필요한 객체를 외부에서 결정하여 연결하는 것을 의미한다.

   정리하면 다음과 같다.

   - 메서드나 객체(bean)의 호출 작업은 제어의 역행(IoC)를 통해 외부에서 이루어짐 (외부는 객체를 기준으로 봤을 때를 의미)
   - 제어의 역행(IoC)을 전제 조건으로 의존성 주입(DI)이 일어남
   - 의존성을 가진 객체에 대해 스프링에서 의존성 주입(DI)이 발생하도록 함
   - 의존성 주입(DI)의 특징으로 인하여 개발자는 POJO 개발이 가능

3. **AOP(Aspect Oriented Programming) 지원**

   보안, 로그, 트랜잭션과 같이 핵심 비즈니스 로직은 아니지만 애플리케이션 전체를 관통하는 부가 기능 로직이 있다. 이를 횡단 관심사(cross-concern)라고 한다.

   스프링은 AOP를 통해 횡단 관심사 코드를 핵심 비즈니스 로직의 코드와 분리하여, 반복적인 코드를 줄이고 개발자가 핵심 비즈니스 로직에만 집중할 수 있도록 지원한다.

4. **편리한 MVC 구조**
5. **WAS에 독립적인 개발 환경**

   과거의 EJB가 동작하기 위해서는 무거운 자바 서버(WAS)가 필요했다.

   반에 스프링은 단순한 서버 환경은 톰캣(Tomcat)에서도 완벽하게 동작한다.

따라서 Spring이 제공하는 기능을 통해 개발자는 비즈니스 로직에만 집중하며 편리하게 개발할 수 있다.

### 스프링 프레임워크와 스프링 부트은 어떤 차이점이 존재할까요?

스프링 부트는 configuration 파일들을 간단하게 설정할 수 있고 편리한 의존성 관리와 자동 권장 버전을 할 수 있도록 해주는 것이다.

- 스프링 프레임워크에서는 의존성 버전을 명확히 적어줘야 하지만 스프링 부트에서는 버전을 적어주지 않아도 부트 버전에 맞춰 알아서 버전을 지정해준다.
- 스프링 프레임워크에서는 엄청 긴 설정파일(xml)을 작성하였지만 스프링 부트에서는 자바 Bean을 통해 편리하게 할 수 있게 되었다.
- 스프링 부트에서는 기본적으로 내장 Tomcat을 지원한다.(물론 프레임워크에서도 내장 톰캣을 연동할 수는 있다.)

### 참고 링크

- [https://freestrokes.tistory.com/79](https://freestrokes.tistory.com/79)
- [https://steady-coding.tistory.com/457](https://steady-coding.tistory.com/457)
- [https://velog.io/@kai6666/Spring-Spring-AOP-개념](https://velog.io/@kai6666/Spring-Spring-AOP-%EA%B0%9C%EB%85%90)
- [https://yoo11052.tistory.com/133](https://yoo11052.tistory.com/133)

<br/>

## DI

_Dependency Injection, 의존성 주입_

### 의존성이란?

하나의 코드가 다른 코드를 의존하는 상태를 의미한다.

```java
public class discountService{
    private DiscountPolicy discountPolicy = new DiscountPolicy ();
}
```

Service가 DiscountPolicy를 사용하기 때문에, Service는 DiscountPolicy에 의존하고 있다고 할 수 있다.

### 의존성이 있다면(높다면) 어떤 문제가 발생할 수 있을까요?

할인 서비스를 개발한다고 한다.

할인 정책이 하나만 있다면 new를 통해 직접 넣어줘도 된다.

```java
public interface DiscountPolicy {
    /* 생략 */
}
public class FixDiscountPolicy implements DiscountPolicy{
    /* 생략 */
}
...
public class discountService{
    private DiscountPolicy discountPolicy = new FixDiscountPolicy();
}
```

하지만 어느 날 할인 정책이 변경 되었다.

의존성이 있기 때문에 discountService에서도 코드를 수정해줘야 한다.

```java
public interface DiscountPolicy {
    /* 생략 */
}
public class FixDiscountPolicy implements DiscountPolicy{
    /* 생략 */
}
public class RateDiscountPolicy implements DiscountPolicy{
    /* 생략 */
}
...
public class discountService{
    // private DiscountPolicy discountPolicy = new FixDiscountPolicy();
		private DiscountPolicy discountPolicy = new RateDiscountPolicy();
}
```

이렇게 의존성이 있다면 불필요한 코드까지 수정을 해줘야 된다.

### 의존성 주입에 대해 설명해주세요.

의존성 주입이란 필요한 객체를 (new를 통해)직접 생성하는 것이 아닌 외부 IoC Container를 통해 필요한 객체를 받아서 사용하는 것이다.

이를 통해 클래스 간의 결합도를 줄인다, 즉 의존성을 낮출 수 있다.

> **IoC Container란?**  
> IoC를 구현하는 프레임워크로 객체를 관리하고, 객체의 생성을 책임지고, 의존성을 관리하는 컨테이너이다.  
> 모든 의존성을 IoC Container통해 받아오게 된다.

### 의존성을 주입하는 방법에 대해 설명해주세요.

> **연관 질문** <br/>
> 각 주입 방식은 어떤 문제점을 가지고 있을까요?

크게 3가지 방법(생성자 주입, 수정자 주입, 필드 주입)이 있다.

1. **생성자 주입**

   말 그대로 생성자를 통해 의존 관계를 주입 받는 방법이다.

   특징

   - 생성자는 딱 1번만 호출되므로, 의존 관계 주입도 생성자 호출 시점에 딱 1번만 호출되는 것이 보장된다.
   - **불변, 필수** 의존 관계에서 사용된다.

   클래스를 생성하면 무조건 생성자를 호출하기 때문에, 생성자 주입에서는 빈을 등록하면서 의존 관계 주입이 같이 일어난다.

   @Autowired가 있으면 스프링 컨테이너에서 꺼내오며, 생성자가 1개만 있는 경우 생략 가능하다.

   ```java
   @Component
   public class OrderServiceImpl implements OrderService {

       private final MemberRepository memberRepository;
       private final DiscountPolicy discountPolicy;

   	  @Autowired
       public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
           this.memberRepository = memberRepository;
           this.discountPolicy = discountPolicy;
       }
   		...
   }
   ```

   생성자 주입을 사용하면 스프링 컨테이너 도움 없이 테스트 코드를 작성할 수 있다는 이점이 있다.

2. **수정자 주입(setter 주입)**

   setter라 불리는 수정자 메서드를 통해 의존 관계를 주입하는 방법이다.

   특징

   - **선택, 변경** 가능성이 있는 의존관계에서 사용한다.
   - 자바빈 프로퍼티 규약의 수정자 메서드 방식을 사용하는 방법이다.

   ```java
   @Component
   public class OrderServiceImpl implements OrderService {

       private MemberRepository memberRepository;
       private DiscountPolicy discountPolicy;

   	  @Autowired
   		public void setMemberRepository(MemberRepository memberRepository) {
   				this.memberRepository = memberRepository;
   		}

   		@Autowired
   		public void setDiscountPolicy(DiscountPolicy discountPolicy) {
   				this.discountPolicy = discountPolicy;
   		}
   		...
   }
   ```

3. **필드 주입**

   필드에 바로 주입하는 방법이다.

   특징

   - 코드가 간결하나 외부에서 변경이 불가능해 테스트가 힘들다.
   - DI 프레임워크가 없으면 아무것도 할 수 없다.
   - 두 가지 경우 외에는 사용하지 않는 것이 좋다.
     - 테스트 코드(`@SpringBootTest` 환경에서 가능)
     - 스프링 설정을 목적으로 하는 @Configuration 같은 곳에서만 특별한 용도로 사용

   ```java
   @Component
   public class OrderServiceImpl implements OrderService {

   		@Autowired
       private MemberRepository memberRepository;
   		@Autowired
       private DiscountPolicy discountPolicy;

   		...
   }
   ```

### 왜 생성자 주입을 권장할까요?

1. 순환참조 방지

   - 순환참조란 A 클래스가 B 클래스의 Bean을 주입받고, B 클래스가 A 클래스의 Bean을 주입받는 상황처럼 서로 순환되어 참조할 경우 발생하는 문제를 의미한다.
   - 수정자, 필드 주입 방식은 호출 시에 주입되기 때문에 호출 전까진 순환참조가 있더라도 알 수 없다.
   - 하지만 생성자 주입은 클래스 생성 시 Bean이 주입되기 때문에 앱 구동 시점에서 예외가 발생한다. 따라서 사전에 방지할 수 있다.

2. final 선언 가능

   - 수정자, 필드 주입은 생성자 이후에 호출되므로, final 키워드를 사용할 수 없다.
   - 그러나 생성자 주입은 가능하다.
   - 따라서 런타입에 객체 불변성을 보장한다.(객체를 생성할 때 1번만 호출됨)
   - 또한 데이터가 누락되었을 때 컴파일 오류를 발생하므로 어떤 값을 필수로 주입해야 하는지 알 수 있다.

3. 테스트 코드 작성 용이
   - 스프링 컨테이너 도움 없이 테스트 코드를 작성할 수 있다.
   - 수정자, 필드 주입에서는 Mockito를 이용해 목킹한 후 테스트를 진행해야 한다.
   - 그러나 생성자 주입은 단순히 원하는 객체를 생성한 후, 생성자에 넣어주면 된다.

### 참고 링크

- [https://velog.io/@robolab1902/Spring-DI가-무엇일까](https://velog.io/@robolab1902/Spring-DI%EA%B0%80-%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C)
- [https://www.inflearn.com/course/스프링-핵심-원리-기본편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8)
- [https://jackjeong.tistory.com/41](https://jackjeong.tistory.com/41)

<br/>

## IoC

_Inversion of Control, 제어의 역전_

### IoC에 대해 설명해주세요.

프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것을 제어의 역전(IoC)이라 한다.

기존에는 `객체 생성 => 의존성 객체 생성(클래스 내부에서 생성) => 의존성 객체 메소드 호출` 순서로 객체가 만들어지고 실행되었다.

하지만 스프링에서는 `객체 생성 => 의존성 객체 주입 (제어권을 스프링에게 위임하여, 스프링에서 만들어놓은 객체 주입) => 의존성 객체 메소드 호출` 순서로 진행된다.

즉, 스프링 컨테이너가 대신 제어권을 갖는 것을 의미한다.

### IoC를 제공하는 프레임워크에는 Spring만 있을까요?

아니다.

모든 프레임워크는 IoC를 제공해준다.

### IoC Container는 어떤 역할을 하나요?

IoC를 구현하는 프레임워크로 객체를 관리하고, 객체의 생성을 책임지고, 의존성을 관리하는 컨테이너이다. 스프링 컨테이너라고도 한다.

인스턴스 생성부터 소멸까지의 인스턴스 생명주기 관리를 개발자가 아닌 컨테이너가 대신 해준다.

따라서 개발자는 로직에 집중할 수 있다는 장점이 있다.

### IoC의 종류는 무엇이 있나요?

IoC는 DL과 DI이 있다.

![img1 daumcdn](https://user-images.githubusercontent.com/80824750/222139489-b15c79cf-f42a-478f-ae9f-01c80c54dcd1.png)

https://dog-developers.tistory.com/12

- **DL(Dependency Lookup)**

  의존성 검색이다. 저장소에 저장되어 있는 Bean에 접근하기 위해 컨테이너가 제공하는 API를 이용하여 Bean을 Lockup하는 것이다.

- **DI(Dependency Injection)**

  의존성 주입이다. 필요한 객체를 (new를 통해)직접 생성하는 것이 아닌 외부 IoC Container를 통해 필요한 객체를 받아서 사용하는 것이다.

  주입 방법으로는 생성자 주입, 수정자 주입, 필드 주입이 있다.

### 참고 링크

- https://live-for-myself.tistory.com/201
- https://happy-playboy.tistory.com/entry/%EB%B0%B1%EC%88%98%EC%9D%98-%EC%8A%A4%ED%94%84%EB%A7%81-IoC%EC%99%80-DI%EC%97%90-%EB%8C%80%ED%95%B4%EC%84%9C
- https://dev-coco.tistory.com/80

<br/>

## 스프링 컨테이너

### 스프링 컨테이너란 무엇인가요?

Bean이라고 하는 자바 객체의 생명주기(생성부터 소멸까지)를 개발자 대신 관리 해주는 것이다.

흔히 ApplicationContext를 스프링 컨테이너라고 한다.

ApplicationContext는 인터페이스로 XML을 기반으로 만들 수 있고, 애노테이션 기반의 자바 설정 클래스로 만들 수 있다.

### 컨테이너의 종류에 대해 설명해주세요.

스프링 컨테이너는 BeanFactory와 ApplicationContext가 있다.

- **BeanFactory**

  스프링 컨테이너의 최상위 인터페이스로, 스프링 빈을 관리하고 조회하는 역할을 담당한다.

  <img src="https://user-images.githubusercontent.com/80824750/222149631-ae4b3585-7b1c-4b48-a971-96ad9fc57fb6.png" width=600/>

  _인프런 김영한님 강의_

- **ApplicationContext**

  BeanFactory를 상속받아 추가로 부가 기능을 제공한다.

  ![Untitled](https://user-images.githubusercontent.com/80824750/222150542-ba3694e0-1152-4985-9452-20de8aebcc2d.png)

  _인프런 김영한님 강의_

  제공하는 부가 기능은 다음과 같다.

  1. 메시지 소스를 활용한 국제화 기능(MessageSource)
     - 한국에서 들어오면 한국어로, 영어로 들어오면 영어로 출력 등
  2. 환경 변수(EnvironmentCapable)
     - 로컬, 개발, 운영 등을 구분해서 처리
  3. 애플리케이션 이벤트(ApplicationEventPublisher)

     - 이벤트를 발행하고 구독하는 모델을 편리하게 지원

  4. 편리한 리소스 조회(ResourcePatternResolver)
     - 파일, 클래스패스, 외부 등에서 리소스를 편리하게 조회

### 스프링 컨테이너의 생성과정을 설명해주세요.

1. 빈 스프링 컨테이너가 생성된다.
2. 스프링 설정 파일(Java, XML 등)을 기반으로 스프링 빈이 등록된다.

   이때 빈 이름은 메서드 이름 또는 직접 부여한 이름으로 부여된다.

3. 스프링 설정 파일을 기반으로 스프링 빈 의존 관계를 주입(DI)한다.

### 참고 링크

- https://inf.run/Tfjy
- https://live-for-myself.tistory.com/201
- https://dev-aiden.com/spring/Spring-Container/

<br/>

## Bean 정의

### Spring Bean이란 무엇인가요?

스프링 IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라고 한다.

[IoC](#IoC)가 적용되면 사용자가 직접 객체를 생성하지 않고 스프링에 의해 관리당하는 자바 객체를 사용하게 된다.

이렇게 스프링에 의하여 생성되고 관리되는 자바 객체를 의미한다.

Spring Framework 에서는 Spring Bean 을 얻기 위하여 ApplicationContext.getBean() 와 같은 메소드를 사용하여 Spring 에서 직접 자바 객체를 얻어서 사용한다.

### Spring Bean을 Spring IoC Container에 등록하는 방법에 대해 설명해주세요.

크게 두 가지 방법이 존재한다.

1. **애노테이션을 사용하는 방법**

	Bean을 등록하기 위해서는 @Component Annotation을 사용한다. @Component가 붙은 클래스를 스캔하여 빈으로 등록한다.

	@Component 뿐만 아니라 다음도 컴포넌트 스캔 대상으로 포함된다.

	> @Controller
	> - 스프링 MVC 컨트롤러로 인식
	>
	> @Service
	> - 비즈니스 로직에서 사용
	>
	> @Repository
	> - 스프링 데이터 접근 계층에서 사용
	> 
	> @Configuration
	> - 스프링 설정 정보에서 사용

	```java
	@Controller
	public class HelloController {    
	    @GetMapping("hello")
	    public String hello(){
		return "hello";
	    }
	}
	```

	`@Controller` 애노테이션을 확인해보면 `@Component`이 있는 것을 확인할 수 있다.

2. **빈 설정 파일에 직접 등록하는 방법**

	@Configuration을 이용하면 Spring Project 에서의 Configuration 역할을 하는 Class를 지정할 수 있다.

	해당 File 하위에 Bean 으로 등록하고자 하는 Class에 @Bean Annotation을 사용해주면 간단하게 Bean을 등록할 수 있다.

	```java
	@Configuration
	public class HelloConfiguration {
	    @Bean
	    public HelloController sampleController() {
		return new SampleController;
	    }
	}
	```

### 빈 생명주기에 대해 설명해주세요.

```
스프링 컨테이너 생성 -> 스프링 빈 생성 -> 의존관계 주입 → 초기화 콜백 → 사용 → 소멸전 콜백 → 스프링 종료
```

스프링은 의존관계 주입이 다 끝난 후에 필요한 데이터를 사용할 수 있다. 스프링에서는 초기화 콜백과 소멸 콜백을 통해 초기화 시점과 종료되기 전 시점을 알려준다.

- 초기화 콜백 : 빈이 생성되고, 빈의 의존관계 주입이 완료된 후 호출
- 소멸전 콜백 : 빈이 소멸되기 직전에 호출

### 스프링에서 빈 생명주기 콜백을 관리할 수 있는 방법을 설명해주세요.

`@PostConstruct`, `@PreDestroy` 두 애노테이션을 사용해 관리할 수 있다.

1. `@PostConstruct`
   - 초기화 콜백
   - 객체가 생성된 후 별도의 초기화 작업을 위해 실행하는 메서드 위에 선언한다.

2. `@PreDestroy`
   - 소멸전 콜백
   - 스프링 빈(객체)을 제거하기 전에 해야할 작업이 있을 때 메서드 위에 선언한다.

이 방식은 최신 스프링에서 가장 권장하는 방법이다.

애노테이션 하나만 붙이면 되므로 매우 편리하며, 자바 표준 기술로 다른 컨테이너에서도 동작한다.

그러나 코드를 고칠 수 없는 외부 라이브러리에서는 사용하지 못하며, 필요 시에는 `@Bean`의 `initMethod`, `destroyMethod` 를 사용하면 된다.

### 참고 링크

- https://melonicedlatte.com/2021/07/11/232800.html
- 인프런 김영한님 강의 : 스프링 핵심 원리 - 기본편
- https://jeongkyun-it.tistory.com/209

<br/>

## 싱글톤 vs 스프링 싱글톤

### 싱글톤 패턴이란 무엇인가요?

클래스의 인스턴스가 딱 1개만 생성되는 것을 보장하는 디자인 패턴이다.

인스턴스가 필요할 때 똑같은 인스턴스를 만들지 않고 기존의 인스턴스를 가져와 활용한다.

![img1 daumcdn](https://user-images.githubusercontent.com/80824750/223136481-6c399c1b-bbb3-4644-afbb-05dd7d7d746e.jpg)

https://gem1n1.tistory.com/96

싱글톤 패턴의 이점으로는 
- 불필요한 메모리 낭비를 방지할 수 있다.
- 공통된 객를 사용해야 하는 상황에서 일관성 있는 객체를 제공한다.(데이터베이스 연결 모듈, 디스크 연결, 캐시, 로그 기록 객체 등)

### 자바 싱글톤과 스프링 싱글톤의 차이점에 대해 설명해주세요.

1. **자바 싱글톤은 클래스로더에 의해 구현되고, 스프링 싱글톤은 스프링 컨테이너에 의해 구현된다.**

	> **자바 클래스로더(Java ClassLoader)**
	>
	> 클래스 파일들을 찾아서 JVM 의 메모리에 탑재해주는 역할을 한다.

	스프링 싱글톤은 클래스 자체에 의해서가 아니라, 스프링 컨테이너에 의해 구현된다.

	스프링에 등록된 빈은 기본적으로 싱글톤으로 관리되어 스프링에 여러 번 빈을 요청하더라도 매번 동일한 객체를 돌려준다.

2. **자바 싱글톤의 스코프는 코드 전체이고, 스프링 싱글톤의 스코프는 해당 컨테이너 내부이다.**

### 자바 싱글톤에서는 (구현방법에 따라)Thread safety 하지 않다는 문제점이 있을 수도 있습니다. 그러면 스프링 싱글톤에서는 Thread safety 하나요?

스프링 빈의 상태를 변경할 수 있게 만든다면, Thread safety 하지 않다.

### 참고 링크

- https://gem1n1.tistory.com/96
- https://inpa.tistory.com/entry/GOF-💠-싱글톤Singleton-패턴-꼼꼼하게-알아보자
- https://tecoble.techcourse.co.kr/post/2021-07-15-jvm-classloader/
- https://alwayspr.tistory.com/11
- https://dahye-jeong.gitbook.io/spring/spring/2020-04-09-bean-threadsafe

