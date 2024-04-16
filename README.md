# 1. 전략패턴 (strategyPattern)
- 바뀌는 부분은 캡슐화
- 상속 보다는 구성
- 구현보다는 인터페이스에 맞춰 프로그래밍

# 2. 옵저버패턴 (observerPattern)
- 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용해야한다.

# 3. 데코레이터패턴 (DecoratorPattern)
- OCP (Open-Close Principle) : 확장에는 open 변경에는 close

# 4. 팩토리패턴 (FactoryPattern)
- 심플팩토리 패턴은 OCP 원칙에 위배됨 이유 : 만약 더 추가사항이 발생하면 변경해야하는 곳이 생김

# 5. 싱글톤패턴 (SingletonPattern)
- 클래스 인스턴스를 하나만 만들고, 그 인스턴스로 전역 접근을 제공한다.
- 정적메소드 사용 (=클래스 메소드)

# 6. 커맨드패턴 (CommandPattern)
- 요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변수화 할 수 있음

# 7. 어댑터 패턴과 퍼사드 패턴 (Adapter&FaçadePattern)
## 어댑터
- 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스 변환
## 퍼사드 (겉모양, 외관)
- 어떤 서브시스템에 대한 간단한 인터페이스를 제공하기
## 데메테르의 법칙 (=최소 지식 원칙)
- 최소 결함을 해야한다

# 8. 템플릿 메소드 패턴 (TemplateMethodPattern)
- 알고리즘의 골격을 정의
- 알고리즘의 각 단계를 정의하며 서브클래스에서 일부 단계를 구현할 수 있도록 유도함
## 후크 (Hook)
- 별 내용 없는 기본 메소드 (기본적으로 아무것도 하지않는 구상 메소드)
- 후크로 상황에 따라 알고리즘 진행을 변경하는 방법을 제공함

# 반복자 패턴 (IteratorPattern)
- 컬렉션의 구현 방법을 노출하지 않으면서 집합체 내의 모든 항목을 접근하는 방법을 제공
## 단일책임원칙 (SRP)
- 어떤 클래스가 바뀌는 이유는 하나뿐이어야 한다 
## 응집도
- 응집도 높음 : 서로 연관된 기능이 묶여있는 것
- 응집도 낮음 : 서로 상관없는 기능들이 묶여있는 것