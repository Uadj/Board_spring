# Board_spring
책 : 스프링부트와 AWS로 혼자 구현하는 웹 서비스 <br><br>
## 간단한 게시판을 구현하는 프로젝트입니다. <br><br>
#### 기능 : 게시글 C(생성), R(조회), U(수정), D(삭제), 네이버, 구글 로그인<br><br>
#### 배포 주소 : https://boardspring.shop
<div align=center><h1>📚 STACKS</h1></div>

<div align=center> 
  <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> 
  <img src="https://img.shields.io/badge/mariadb-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> 
  <img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">
  <img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"> 
  <br>
  Spring Boot, AWS(EC2, RDS[Mariadb], Route53, Load Balancer, ACM), Git
</div>
<br>
<img width="954" alt="1s" src="https://user-images.githubusercontent.com/30551889/157786919-cde4ee4a-8205-40bd-ac96-1d8a37173a6b.png">
<br>
<h2>  업데이트 이력</h2>
<br><br>
22.2.18
https등록완료
<br><br>
22.2.17
모든 에러 수정
포트 변경, 리디렉션
<br><br>
22.2.10
EC2 인스턴스 재생성
<br><br>
22.1.28<br>
Rout53이용, Gabia 도메인 등록<br>
<strike>http://boardspring.shop:8000/</strike><br>
구글 로그인 오류 수정완료.<br>

22.01.16<br><br>
<strike>http://52.78.126.80:8000/</strike><br>
<strike>!글 등록시 403 error h2 db권한 문제<br> -> GUEST도 이용가능하게 변경</strike>
<strike>!오류 구글 로그인은 도메인 주소가 있어야 리디렉션 가능</strike><br>
<br><br>
22.01.10 travis CI추가
AWS EC2, RDS 인스턴스 
<br><br>
22.01.04 기준
<br><br>
기본적인 게시글 작성, 수정, 삭제가 가능합니다.
Naver로그인, 구글 로그인이 구현되었습니다.









  

