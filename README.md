# Member
JavaSpring, Web, MySQL을 활용한 Member 시스템

## 기능
localhost8080 에서 회원가입 및 회원목록 조회 가능

- 회원가입 : Member Repository에 새로운 Member를 등록
- 회원목록 : Member Repostiroy에 등록된 Member를 출력

## Repository
여러 종류의 Repository를 생성가능

- MemoryMemberRepository : 메모리에 Member를 저장
- JdbcMemberReposiotry : MySQL과 연동한 JDBC Repository
- JdbcTemplateMemberRepository : MySQL과 연동하고 JDBC Template을 이용한 Repository
- JpaMemberRepository : MySQL과 연동하고 EntityManager를 사용한 Jpa Repository
- SpringDataJpaMemberRepository : MySQL과 연동하고 Spring Data Jpa를 활용한 Repository

## AOP
AOP를 활용하여 각 메소드의 TimeTrace를 확인가능

## Test
- Unit Test : 각 기능의 동작이 올바르게 작동하는지에 대한 Test 
- Integration Test : 각 기능의 동작이 DataBase와 연동되어 올바르게 작동하는지에 대한 Test
